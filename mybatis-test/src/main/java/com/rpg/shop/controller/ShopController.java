package com.rpg.shop.controller;

import com.rpg.item.dto.ItemDTO;
import com.rpg.shop.dto.ShopAndItemDTO;
import com.rpg.shop.service.ShopService;
import com.rpg.user.controller.UserController;
import com.rpg.user.dto.UserDTO;
import com.rpg.user.service.UserService;
import com.rpg.user.view.UserPrint;

import java.util.List;

public class ShopController {
    private final int USER_CODE = 1;
    private ShopService shopService=new ShopService();
    private UserDTO userDTO=new UserDTO();
    private UserService userService=new UserService();
    private UserController userController=new UserController();
    private UserPrint userPrint=new UserPrint();

    public List<ShopAndItemDTO> getItemShopItemList(int shopType) {
        return shopService.getItemShopItemList(shopType);
    }

    public ItemDTO getBuyClothes(int itemIndex) {
        return shopService.getBuyClothes(itemIndex);
    }

    public ItemDTO getBuyGift(int itemIndex) {
        return shopService.getBuyGift(itemIndex);
    }

    public ItemDTO equipItem(ItemDTO buyItemDTO) {
        return shopService.equipItem(buyItemDTO);
    }

    public ItemDTO buyItem(ItemDTO buyItemDTO) {
        return shopService.buyItem(buyItemDTO);
    }

    public UserDTO getUserInfo() {
        UserDTO userInfo = userController.getUserInfo(USER_CODE);
        if (userInfo == null) {
            System.out.println("유저 정보가 없습니다.");
        }
        userPrint.printUserInfo(userInfo, userController.getUserEquippedItem(userInfo.getEquippedItemCode()), userController.getUserItemList(userInfo.getBagCode()));
        return userInfo;
    }

}
