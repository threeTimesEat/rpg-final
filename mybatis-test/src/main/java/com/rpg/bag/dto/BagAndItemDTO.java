package com.rpg.bag.dto;


import com.rpg.item.dto.ItemDTO;

import java.util.List;

public class BagAndItemDTO {

    private int bagCode;
    private int itemCode;
    private List<ItemDTO> bagItemList;

    public BagAndItemDTO() {
    }

    public BagAndItemDTO(int bagCode, int itemCode, List<ItemDTO> bagItemList) {
        this.bagCode = bagCode;
        this.itemCode = itemCode;
        this.bagItemList = bagItemList;
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

    public List<ItemDTO> getBagItemList() {
        return bagItemList;
    }

    public void setBagItemList(List<ItemDTO> bagItemList) {
        this.bagItemList = bagItemList;
    }

//    @Override
//    public String toString() {
//        return "BagAndItemDTO{" +
//                "bagCode=" + bagCode +
//                ", itemCode=" + itemCode +
//                ", bagItemList=" + bagItemList +
//                '}';
//    }

    @Override
    public String toString() {
        return "" + bagItemList;
    }
}
