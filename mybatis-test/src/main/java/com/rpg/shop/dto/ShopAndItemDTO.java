package com.rpg.shop.dto;

import com.rpg.item.dto.ItemDTO;

import java.util.List;

public class ShopAndItemDTO {

    private int shopCode;
    private int itemCode;
    private List<ItemDTO> shopItemList;

    public ShopAndItemDTO() {
    }

    public ShopAndItemDTO(int shopCode, int itemCode, List<ItemDTO> shopItemList) {
        this.shopCode = shopCode;
        this.itemCode = itemCode;
        this.shopItemList = shopItemList;
    }

    public int getShopCode() {
        return shopCode;
    }

    public void setShopCode(int shopCode) {
        this.shopCode = shopCode;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public List<ItemDTO> getShopItemList() {
        return shopItemList;
    }

    public void setShopItemList(List<ItemDTO> shopItemList) {
        this.shopItemList = shopItemList;
    }

    @Override
    public String toString() {
        return "ShopAndItemDTO{" +
                "shopCode=" + shopCode +
                ", itemCode=" + itemCode +
                ", shopItemList=" + shopItemList +
                '}';
    }
}
