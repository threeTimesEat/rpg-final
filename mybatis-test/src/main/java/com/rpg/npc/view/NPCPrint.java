package com.rpg.npc.view;

import com.rpg.npc.dto.NPCDTO;
import com.rpg.user.dto.UserDTO;

import java.util.List;

public class NPCPrint {

    //npc 리스트 출력
    public void printAllNpcList(List<NPCDTO> npcList) {
        for (NPCDTO npcDTO : npcList) {
            System.out.println(npcDTO);
        }
    }

    //특정 npc 출력
    public void printSelectedNpc(NPCDTO selectedNpc) {
        System.out.println(selectedNpc);
    }


//    public void talkAboutWeather(NPCDTO selectedNPC) {
//        System.out.println(mainController.getUserInfo().getName() + ": 오늘 날씨 어때?");
//        System.out.println(selectedNPC.getName() + ": 화창한걸!");
//        plusNPCLike(selectedNPC, 20);
//    }
//
//    public void talkAboutTrip(NPCDTO selectedNPC) {
//        System.out.println(mainController.getUserInfo().getName() + ": 우리 놀러갈래?!");
//        if (selectedNPC.getLike() > 50) {
//            System.out.println(selectedNPC.getName() + ": 좋아! 어디로 갈까?");
//            System.out.println("둘은 어디로 놀러갈지 대화하기 시작했다...");
//        } else {
//            System.out.println(selectedNPC.getName() + ": 우리가..?");
//            System.out.println(mainController.getUserInfo().getName() + " 은/는 버려졌다....");
//        }
//    }
//
//    public void talkAboutFood(NPCDTO selectedNPC) {
//        System.out.println(mainController.getUserInfo().getName() + ": 어제 뭐 먹고 잤니..?");
//        System.out.println(selectedNPC.getName() + ": 뭐?");
//        minusNPCLike(selectedNPC, 100);
//    }
//
//    public void presentGift(NPCDTO selectedNPC) {
//        UserDTO userInfo = mainController.getUserInfo();
//        System.out.println("가지고 있는 선물");
//        System.out.println("============================");
//        showGiftList();
//        System.out.print("무엇을 줄까? : ");
//        int selectedGift = sc.nextInt() - 1;
//        sc.nextLine();
//        GiftDTO givenGift = mainController.getUserBag().getGiftList().get(selectedGift);
//        mainController.presentGift(givenGift);
//        int changeLike = 30 + givenGift.getCharm() + userInfo.getCharm();
//
//        if (changeLike > 0){
//            plusNPCLike(selectedNPC, changeLike);
//        }
//        else if (changeLike < 0) {
//            minusNPCLike(selectedNPC, changeLike);
//        }
//        else {
//            nothingHappened();
//        }
//    }
//
//    public void showGiftList() {
//        List<GiftDTO> giftList = mainController.getUserBag().getGiftList();
//
//        for (GiftDTO gift : giftList) {
//            System.out.println("[" + (giftList.indexOf(gift) + 1)+ "]" + gift);
//        }
//
//    }
//
//    public void plusNPCLike(NPCDTO selectedNPC, int like) {
//        System.out.println(selectedNPC.getName() + "의 호감도가 " + like + "만큼 상승했다!");
//        mainController.plusNPCLike(selectedNPC, like);
//        System.out.println(selectedNPC.getName() + "의 호감도가 " + selectedNPC.getLike() + "가 되었다.");
//    }
//
//    public void minusNPCLike(NPCDTO selectedNPC, int like) {
//        System.out.println(selectedNPC.getName() + "의 호감도가 " + like + "만큼 하락했다....");
//        mainController.minusNPCLike(selectedNPC, like);
//        System.out.println(selectedNPC.getName() + "의 호감도가 " + selectedNPC.getLike() + "가 되었다.");
//    }
//
//    public void nothingHappened() {
//        System.out.println("아무 일도 일어나지 않았다.....");
//    }



}
