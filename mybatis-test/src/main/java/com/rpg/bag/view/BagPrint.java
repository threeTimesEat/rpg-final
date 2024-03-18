package com.rpg.bag.view;

import com.rpg.bag.dto.BagAndItemDTO;
import com.rpg.bag.dto.BagDTO;

import java.util.Arrays;
import java.util.List;

public class BagPrint {
    public void printBagItemList(List<BagAndItemDTO> bagItemList) {

        // 전체 소지품 목록 출력하는 메소드
        for (BagAndItemDTO bagItem : bagItemList) {
            for(int i = 0 ; i < bagItem.getBagItemList().size(); i++) {
                if(bagItem.getBagItemList().get(i).getCategory()==1) {
                    System.out.println("착용 중인 아이템 =============");
                    System.out.println(bagItem.getBagItemList().get(i));
                } else {
                    System.out.println("소지품 ======================");
                    System.out.println(bagItem.getBagItemList().get(i));
                }
            }
        }

    }

    public void printErrorMessage(String errorCode) {

        // 에러메시지를 출력하는 메소드

        String errorMessage = "";
        switch (errorCode) {
            case "selectBagItemList":
                errorMessage = "소지품 보기를 실패하였습니다.";
                break;
        }
        System.out.println(errorMessage);
    }
}
