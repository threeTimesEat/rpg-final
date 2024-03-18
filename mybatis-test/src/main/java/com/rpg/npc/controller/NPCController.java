package com.rpg.npc.controller;

import com.rpg.npc.dto.NPCDTO;
import com.rpg.npc.service.NPCService;
import com.rpg.npc.view.NPCMenu;
import com.rpg.npc.view.NPCPrint;
import com.rpg.user.dto.UserDTO;

import java.util.List;

public class NPCController {

    // Service와 Print 객체 선언
    private final NPCService npcService;
    private final NPCPrint npcPrint;


    public NPCController() {
        npcService = new NPCService();
        npcPrint = new NPCPrint();
    }

    //NPC와의 대화창을 호출하는 메소드
    public void talkToNPC() {
        NPCMenu npcMenu = new NPCMenu();
        npcMenu.displayTalkToNPC();
    }

    //NPC 목록을 조회하는 메소드
    public void selectAllNpcList() {
        List<NPCDTO> npcList = npcService.selectAllNpcList();

        if (npcList != null) {
            npcPrint.printAllNpcList(npcList);
        } else {
            System.out.println("다시 선택해주세요");
        }

    }

    //선택된 NPC를 조회하는 메소드
    public NPCDTO getNpcInfo(int code) {
        return npcService.getNpcInfo(code);
    }

    //NPC와의 날씨 이야기 메소드
    public void talkAboutWeather(NPCDTO selectedNPC) {
        System.out.println(selectedNPC);

        int num = selectedNPC.getCode();
        System.out.println(num);

        System.out.println("나 : 오늘 날씨 어때?");
        System.out.println(selectedNPC.getName() + ": 화창한걸!");
        npcService.updateNpcCharm(num, 20);
        System.out.println(selectedNPC.getName() + "의 호감도가 변화했다.");
    }

}
