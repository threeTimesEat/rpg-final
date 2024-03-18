package com.rpg.shop.dto;

public class ShopDTO {
    private int shopCode;
    private int itemCode;

    public ShopDTO() {
    }

    public ShopDTO(int shopCode, int itemCode) {
        this.shopCode = shopCode;
        this.itemCode = itemCode;
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

    @Override
    public String toString() {
        return "shopDTO{" +
                "shopCode=" + shopCode +
                ", itemCode=" + itemCode +
                '}';
    }
}
