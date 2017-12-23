package com.smi.am.dao;

import com.smi.am.dao.model.AmActivityArea;
import com.smi.am.dao.model.AmActivityAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmActivityAreaMapper {
    int countByExample(AmActivityAreaExample example);

    int deleteByExample(AmActivityAreaExample example);

    int deleteByPrimaryKey(Integer aId);

    int insert(AmActivityArea record);

    int insertSelective(AmActivityArea record);

    List<AmActivityArea> selectByExample(AmActivityAreaExample example);

    AmActivityArea selectByPrimaryKey(Integer aId);

    int updateByExampleSelective(@Param("record") AmActivityArea record, @Param("example") AmActivityAreaExample example);

    int updateByExample(@Param("record") AmActivityArea record, @Param("example") AmActivityAreaExample example);

    int updateByPrimaryKeySelective(AmActivityArea record);

    int updateByPrimaryKey(AmActivityArea record);
}