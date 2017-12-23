package com.smi.am.dao;

import com.smi.am.dao.model.AmCoupons;
import com.smi.am.dao.model.AmCouponsExample;
import com.smi.am.dao.model.AmCouponsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmCouponsMapper {
    int countByExample(AmCouponsExample example);

    int deleteByExample(AmCouponsExample example);

    int deleteByPrimaryKey(String cCouponsid);

    int insert(AmCouponsWithBLOBs record);

    int insertSelective(AmCouponsWithBLOBs record);

    List<AmCouponsWithBLOBs> selectByExampleWithBLOBs(AmCouponsExample example);

    List<AmCoupons> selectByExample(AmCouponsExample example);

    AmCouponsWithBLOBs selectByPrimaryKey(String cCouponsid);

    int updateByExampleSelective(@Param("record") AmCouponsWithBLOBs record, @Param("example") AmCouponsExample example);

    int updateByExampleWithBLOBs(@Param("record") AmCouponsWithBLOBs record, @Param("example") AmCouponsExample example);

    int updateByExample(@Param("record") AmCoupons record, @Param("example") AmCouponsExample example);

    int updateByPrimaryKeySelective(AmCouponsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AmCouponsWithBLOBs record);

    int updateByPrimaryKey(AmCoupons record);
}