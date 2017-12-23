package com.smi.am.dao;

import com.smi.am.dao.model.AmCounponsType;
import com.smi.am.dao.model.AmCounponsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmCounponsTypeMapper {
    int countByExample(AmCounponsTypeExample example);

    int deleteByExample(AmCounponsTypeExample example);

    int deleteByPrimaryKey(Integer ctId);

    int insert(AmCounponsType record);

    int insertSelective(AmCounponsType record);

    List<AmCounponsType> selectByExample(AmCounponsTypeExample example);

    AmCounponsType selectByPrimaryKey(Integer ctId);

    int updateByExampleSelective(@Param("record") AmCounponsType record, @Param("example") AmCounponsTypeExample example);

    int updateByExample(@Param("record") AmCounponsType record, @Param("example") AmCounponsTypeExample example);

    int updateByPrimaryKeySelective(AmCounponsType record);

    int updateByPrimaryKey(AmCounponsType record);
}