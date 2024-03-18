package com.rpg.npc.dao;


import com.rpg.npc.dto.NPCDTO;
import com.rpg.util.common.Template;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface NpcDAO {

    List<NPCDTO> selectAllNpcList();

    NPCDTO getNpcInfo(int num);

    NPCDTO getNpcCharm(int charm);

    int updateNpcCharm(Map<String, String> npcInfoMap);



}
