package com.rpg.shop.view;

import com.rpg.bag.dto.BagAndItemDTO;
import com.rpg.item.dto.ClothesDTO;
import com.rpg.item.dto.ItemDTO;
import com.rpg.shop.controller.ShopController;
import com.rpg.shop.dto.ShopAndItemDTO;
import com.rpg.user.dto.UserDTO;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ShopView {
    private ShopController shopController=new ShopController();
    public void goToItemShop() {

        Scanner sc=new Scanner(System.in);
        System.out.println("1. 옷 가게 / 2. 선물 가게");
        System.out.println("============================");
        System.out.print("어느 가게로 가시겠습니까? : ");
        int shopType = sc.nextInt();
        sc.nextLine();

        switch (shopType) {
            case 1 : goToClothesShop(shopType); break;
            case 2 : goToGiftShop(shopType); break;
        }

//        ItemDTO[] itemDTOList = shopController.getItemShopItemList(shopType);
//        showItemList(itemDTOList);

        System.out.print("어느 물건을 달라 할까? : ");
//        int itemIndex = sc.nextInt() - 1;
        int itemIndex = sc.nextInt();

        ItemDTO buyItemDTO = switch (shopType) {
            case 1 -> shopController.getBuyClothes(itemIndex);
            case 2 -> shopController.getBuyGift(itemIndex);
            default -> throw new InputMismatchException();
        };

        UserDTO userInfo = shopController.getUserInfo();
        if (userInfo.getMoney() < buyItemDTO.getPrice()) {
            System.out.println("돈이 없다. 아르바이트를 하러 가볼까?");
            return;
        }

        System.out.println();
        System.out.println("구매한 아이템 : " + buyItemDTO);
//        shopController.buyItem(buyItemDTO);
//        System.out.println(buyItemDTO.getName() + "을/를 샀다!");
//        if (buyItemDTO instanceof ClothesDTO) {
//            shopController.equipItem(buyItemDTO);
//            System.out.println("아이템을 착용하여 매력도가 " + userInfo.getCharm() + "가 되었다!");
//        }
//        System.out.println(buyItemDTO.getPrice() + "원 사용했다.");
//        userInfo.minusMoney(buyItemDTO.getPrice());
//        System.out.println(userInfo.getMoney() + "원 남았다.");


    }

    public void goToClothesShop(int shopType) {
        System.out.println("옷 가게에 입장했다 !");
        System.out.println("============================");
        System.out.println("중년의 주인장이 나타났다 ...");
        System.out.println("주인장 : 어떤 물건을 구입하시겠습니까?");
        System.out.println("============================");

        List<ShopAndItemDTO> clothesItemList = shopController.getItemShopItemList(shopType);

        // 옷가게 아이템 목록
        for (ShopAndItemDTO shopItem : clothesItemList) {
            for(int i = 0 ; i < shopItem.getShopItemList().size(); i++) {
                if(shopItem.getShopItemList().get(i).getCategory()==1) {
                    System.out.print("[" + shopItem.getShopItemList().get(i).getCode() + "] ");
                    System.out.println(shopItem.getShopItemList().get(i));
                }
            }
        }
    }

    public void goToGiftShop(int shopType) {
        System.out.println("선물 가게에 입장했다 !");
        System.out.println("============================");
        System.out.println("야생의 산신령이 나타났다 ...");
        System.out.println("야생의 산신령 : 어떤 물건이 네 물건이냐?");
        System.out.println("============================");

        List<ShopAndItemDTO> giftItemList = shopController.getItemShopItemList(shopType);

        // 선물가게 아이템 목록
        for (ShopAndItemDTO shopItem : giftItemList) {
            for(int i = 0 ; i < shopItem.getShopItemList().size(); i++) {
                if(shopItem.getShopItemList().get(i).getCategory()==2) {
                    System.out.print("[" + shopItem.getShopItemList().get(i).getCode() + "] ");
                    System.out.println(shopItem.getShopItemList().get(i));
                }
            }
        }
    }

//    public void showItemList(ItemDTO[] itemDTOList) {
//        for (int i = 0; i < itemDTOList.length; i++) {
//            System.out.println("[" + (i + 1) + "] " + itemDTOList[i]);
//        }
//
//    }

}
