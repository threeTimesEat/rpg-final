package com.rpg.npc.view;

import com.rpg.npc.controller.NPCController;
import com.rpg.npc.dto.NPCDTO;

import java.util.Scanner;

public class NPCMenu {

    Scanner sc = new Scanner(System.in);
    NPCPrint npcPrint = new NPCPrint();
    private NPCController npcController = new NPCController();

    public void displayTalkToNPC() {

        npcController.selectAllNpcList();
        System.out.println("============================");
        System.out.print("누구랑 대화할까? : ");
        int num = sc.nextInt();
        sc.nextLine();
        NPCDTO selectedNPC = npcController.getNpcInfo(num);
        System.out.println(selectedNPC.getName() + " (을)를 만났다!");
        System.out.println("============================");
        System.out.println("[1] 오늘 날씨 어때?");
        System.out.println("[2] 우리 놀러갈래?");
        System.out.println("[3] 어제 뭐 먹고 잤니..?");
        System.out.println("[4] 선물을 준다..");
        System.out.println("[5] 아무 것도 하지 않는다...");
        System.out.println("============================");
        System.out.print("무엇을 할까? :");
        int talkType = sc.nextInt();
        sc.nextLine();

        switch (talkType) {
            case 1 : npcController.talkAboutWeather(selectedNPC); break;
            case 2 : break;
//            case 3 -> talkAboutFood(selectedNPC);
//            case 4 -> presentGift(selectedNPC);
//            case 5 -> nothingHappened();
            default : System.out.println("올바른 번호를 선택해주세요."); break;

        }

    }

}
