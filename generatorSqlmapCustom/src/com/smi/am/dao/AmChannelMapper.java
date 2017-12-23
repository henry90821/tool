package com.smi.am.dao;

import com.smi.am.dao.model.AmChannel;
import com.smi.am.dao.model.AmChannelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmChannelMapper {
    int countByExample(AmChannelExample example);

    int deleteByExample(AmChannelExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(AmChannel record);

    int insertSelective(AmChannel record);

    List<AmChannel> selectByExample(AmChannelExample example);

    AmChannel selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") AmChannel record, @Param("example") AmChannelExample example);

    int updateByExample(@Param("record") AmChannel record, @Param("example") AmChannelExample example);

    int updateByPrimaryKeySelective(AmChannel record);

    int updateByPrimaryKey(AmChannel record);
}