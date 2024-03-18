package com.rpg.bag.dao;

import com.rpg.bag.dto.BagAndItemDTO;
import com.rpg.bag.dto.BagDTO;

import java.util.List;

public interface BagDAO {
    List<BagAndItemDTO> selectBagItemList();
}
