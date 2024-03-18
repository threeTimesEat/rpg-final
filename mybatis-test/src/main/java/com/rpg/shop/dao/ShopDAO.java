package com.rpg.shop.dao;

import com.rpg.shop.dto.ShopAndItemDTO;
import com.rpg.item.dto.ItemDTO;
import com.rpg.user.dto.UserDTO;

import java.util.List;

public interface ShopDAO {
    List<ShopAndItemDTO> getItemShopItemList(int shopType);
//    ItemDTO[] getItemShopItemList(int shopType);

    ItemDTO getBuyGift(int itemIndex);

    ItemDTO getBuyClothes(int itemIndex);

    ItemDTO equipItem(ItemDTO buyItemDTO);

    ItemDTO buyItem(ItemDTO buyItemDTO);
}
