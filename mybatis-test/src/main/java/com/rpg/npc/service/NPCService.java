package com.rpg.npc.service;

import com.rpg.npc.dao.NpcDAO;
import com.rpg.npc.dto.NPCDTO;
import com.rpg.user.dao.UserDAO;
import com.rpg.user.dto.UserDTO;
import com.rpg.util.common.Template;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NPCService {

    //npc 목록 조회

    private NpcDAO NPCDAO;

    public List<NPCDTO> selectAllNpcList() {
        SqlSession sqlSession = Template.getSqlSession();
        NPCDAO = sqlSession.getMapper(NpcDAO.class);
        List<NPCDTO> npcList = NPCDAO.selectAllNpcList();

        sqlSession.close();

        return npcList;
    }

    public NPCDTO getNpcInfo(int code){
        SqlSession sqlSession = Template.getSqlSession();
        NPCDAO = sqlSession.getMapper(NpcDAO.class);

        NPCDTO npc = NPCDAO.getNpcInfo(code);

        sqlSession.close();

        return npc;

    }

    public Boolean updateNpcCharm(int code, int charm) {
        SqlSession sqlSession = Template.getSqlSession();
        NPCDAO = sqlSession.getMapper(NpcDAO.class);

        Map<String, String> npcInfoMap = new HashMap<>();
        npcInfoMap.put("code", Integer.toString(code));

        npcInfoMap.put("charm", Integer.toString(charm));

        boolean isUpdated = NPCDAO.updateNpcCharm(npcInfoMap) > 0;
        if (isUpdated)
            sqlSession.commit();
        else
            sqlSession.rollback();

        return isUpdated;
    }

}
