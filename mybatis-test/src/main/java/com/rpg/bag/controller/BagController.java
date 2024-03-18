package com.rpg.bag.controller;

import com.rpg.bag.dto.BagAndItemDTO;
import com.rpg.bag.dto.BagDTO;
import com.rpg.bag.service.BagService;
import com.rpg.bag.view.BagPrint;

import java.util.List;

public class BagController {

    // Service와 Print 객체 선언

    private final BagService bagService;
    private final BagPrint bagPrint;
    public BagController() {
        bagService = new BagService();
        bagPrint = new BagPrint();
    }

    public void selectBagItemList() {

        // 전체 제품 목록을 조회하는 메소드

        List<BagAndItemDTO> bagItemList = bagService.selectBagItemList();

        if(bagItemList != null) {
            bagPrint.printBagItemList(bagItemList);
        } else {
            bagPrint.printErrorMessage("selectBagItemList");
        }

    }


}
