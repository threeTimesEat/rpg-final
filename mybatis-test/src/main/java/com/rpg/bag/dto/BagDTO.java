package com.rpg.bag.dto;

public class BagDTO {
    private int bagCode;
    private int itemCode;

    public BagDTO() {
    }

    public BagDTO(int bagCode, int itemCode) {
        this.bagCode = bagCode;
        this.itemCode = itemCode;
    }

    public int getBagCode() {
        return bagCode;
    }

    public void setBagCode(int bagCode) {
        this.bagCode = bagCode;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

//    @Override
//    public String toString() {
//        return "BagDTO{" +
//                "bagCode=" + bagCode +
//                ", itemCode=" + itemCode +
//                '}';
//    }

    @Override
    public String toString() {
        return "소지품 [" +
                "bagCode=" + bagCode +
                ", itemCode=" + itemCode +
                ']';
    }
}
