package com.rpg.view;

import com.rpg.bag.controller.BagController;
import com.rpg.npc.controller.NPCController;
import com.rpg.shop.view.ShopView;
import com.rpg.user.view.UserMenu;

import java.util.Scanner;

public class RPGMenu {

    public RPGMenu() {
    }

    private Scanner sc = new Scanner(System.in);
    private BagController bagController = new BagController();
    private UserMenu userMenu = new UserMenu();
    private NPCController npcController = new NPCController();
    private ShopView shopView = new ShopView();

    public void menu() {

        System.out.println("두근두근(?) 연애 시뮬레이션!");
        userMenu.updateUserName();


        while (true) {
            System.out.println("============ 메뉴 ============");
            System.out.println("1. 이름 변경하기");
            System.out.println("2. 내 상태 확인하기");
            System.out.println("3. 소지품 보기");
            System.out.println("4. 대화하기");
            System.out.println("5. 쇼핑하기");
            System.out.println("6. 아르바이트 하기");
            System.out.println("7. 호감도 확인하기");
            System.out.println("8. 종료");
            System.out.println("============================");
            System.out.print("번호를 선택하세요 : ");
            int selectNum = sc.nextInt();
            sc.nextLine();

            switch (selectNum) {
                case 1 : userMenu.updateUserName(); break;
                case 2 : userMenu.getUserInfo(); break;
                case 3 : bagController.selectBagItemList(); break;
                case 4 : npcController.talkToNPC(); break;
                case 5 : shopView.goToItemShop(); break;
                case 6 : userMenu.userAlba(); break;
                case 7 : npcController.selectAllNpcList(); break;
                case 8:
                    System.out.println("게임을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 번호입니다. 확인 후 다시 입력해 주세요.");
                    break;
            }
        }
    }

}
