package com.smi.am.dao;

import com.smi.am.dao.model.AmUser;
import com.smi.am.dao.model.AmUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmUserMapper {
    int countByExample(AmUserExample example);

    int deleteByExample(AmUserExample example);

    int deleteByPrimaryKey(Integer uId);

    int insert(AmUser record);

    int insertSelective(AmUser record);

    List<AmUser> selectByExample(AmUserExample example);

    AmUser selectByPrimaryKey(Integer uId);

    int updateByExampleSelective(@Param("record") AmUser record, @Param("example") AmUserExample example);

    int updateByExample(@Param("record") AmUser record, @Param("example") AmUserExample example);

    int updateByPrimaryKeySelective(AmUser record);

    int updateByPrimaryKey(AmUser record);
}