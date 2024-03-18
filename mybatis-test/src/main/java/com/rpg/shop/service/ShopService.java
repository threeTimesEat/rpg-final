package com.rpg.shop.service;

import com.rpg.item.dto.ItemDTO;
import com.rpg.shop.dao.ShopDAO;
import com.rpg.shop.dto.ShopAndItemDTO;
import com.rpg.util.common.Template;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ShopService {
    private ShopDAO shopDAO;

    public List<ShopAndItemDTO> getItemShopItemList(int shopType) {
        SqlSession sqlSession = Template.getSqlSession();
        shopDAO = sqlSession.getMapper(ShopDAO.class);

        List<ShopAndItemDTO> shopItemList = shopDAO.getItemShopItemList(shopType);

        sqlSession.close();
        return shopItemList;

    }

    public ItemDTO getBuyClothes(int itemIndex) {
        SqlSession sqlSession = Template.getSqlSession();
        shopDAO = sqlSession.getMapper(ShopDAO.class);
        return shopDAO.getBuyClothes(itemIndex);
    }

    public ItemDTO getBuyGift(int itemIndex) {
        SqlSession sqlSession = Template.getSqlSession();
        shopDAO = sqlSession.getMapper(ShopDAO.class);
        return shopDAO.getBuyGift(itemIndex);


    }

    public ItemDTO equipItem(ItemDTO buyItemDTO) {
        SqlSession sqlSession = Template.getSqlSession();
        shopDAO = sqlSession.getMapper(ShopDAO.class);

        return shopDAO.equipItem(buyItemDTO);
    }

    public ItemDTO buyItem(ItemDTO buyItemDTO) {
        SqlSession sqlSession = Template.getSqlSession();
        shopDAO = sqlSession.getMapper(ShopDAO.class);

        return shopDAO.buyItem(buyItemDTO);
    }
}
