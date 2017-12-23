package com.smi.am.dao;

import com.smi.am.dao.model.AmCounponsDetails;
import com.smi.am.dao.model.AmCounponsDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmCounponsDetailsMapper {
    int countByExample(AmCounponsDetailsExample example);

    int deleteByExample(AmCounponsDetailsExample example);

    int deleteByPrimaryKey(String cdDetailid);

    int insert(AmCounponsDetails record);

    int insertSelective(AmCounponsDetails record);

    List<AmCounponsDetails> selectByExample(AmCounponsDetailsExample example);

    AmCounponsDetails selectByPrimaryKey(String cdDetailid);

    int updateByExampleSelective(@Param("record") AmCounponsDetails record, @Param("example") AmCounponsDetailsExample example);

    int updateByExample(@Param("record") AmCounponsDetails record, @Param("example") AmCounponsDetailsExample example);

    int updateByPrimaryKeySelective(AmCounponsDetails record);

    int updateByPrimaryKey(AmCounponsDetails record);
}