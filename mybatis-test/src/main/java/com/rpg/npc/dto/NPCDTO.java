package com.rpg.npc.dto;

public class NPCDTO {

    private int code;
    private String name;
    private int charm;

    public NPCDTO() {}

    public NPCDTO(int code, String name, int charm) {
        this.code = code;
        this.name = name;
        this.charm = charm;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLike() {
        return charm;
    }

    public void setLike(int charm) {
        this.charm = charm;
    }

    @Override
    public String toString() {
        return "[" + code + "]" +
                " 이름 : " + name + " / " +
                "호감도 : " + charm;
    }

}
