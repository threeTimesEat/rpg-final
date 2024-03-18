package com.rpg.bag.service;

import com.rpg.bag.dao.BagDAO;
import com.rpg.bag.dto.BagAndItemDTO;
import com.rpg.bag.dto.BagDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.rpg.util.common.Template.getSqlSession;

public class BagService {

    private static BagDAO mapper;   //DAO 객체 선언

    public List<BagAndItemDTO> selectBagItemList() {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(BagDAO.class);

        List<BagAndItemDTO> bagItemList = mapper.selectBagItemList();

        sqlSession.close();
        return bagItemList;

    }
}
