package com.rpg.item.dto;

public class ClothesDTO extends ItemDTO {

    public ClothesDTO() {
    }

    public ClothesDTO(int code, int category, String name, int price, int charm) {
        super(code, category, name, price, charm);
    }

    @Override
    public String toString() {
        return "옷 : " +
                this.getName() + " / " +
                this.getPrice() + " / " +
                "매력도 + " + this.getCharm();
    }
}
