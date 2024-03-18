package com.rpg.item.dto;

public class ItemDTO {

    private int code;
    private int category;
    private String name;
    private int price;
    private int charm;

    public ItemDTO() {
    }

    public ItemDTO(int code, int category, String name, int price, int charm) {
        this.code = code;
        this.category = category;
        this.name = name;
        this.price = price;
        this.charm = charm;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCharm() {
        return charm;
    }

    public void setCharm(int charm) {
        this.charm = charm;
    }

//    @Override
//    public String toString() {
//        return "ItemDTO{" +
//                "code=" + code +
//                ", category=" + category +
//                ", name='" + name + '\'' +
//                ", price=" + price +
//                ", charm=" + charm +
//                '}';
//    }

    @Override
    public String toString() {
        return "이름 : " + name  + " / " +
               "가격 : " + price + " / " +
               "매력 : " + charm + " ";
    }

}
