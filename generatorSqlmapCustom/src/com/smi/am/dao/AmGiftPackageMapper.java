package com.smi.am.dao;

import com.smi.am.dao.model.AmGiftPackage;
import com.smi.am.dao.model.AmGiftPackageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmGiftPackageMapper {
    int countByExample(AmGiftPackageExample example);

    int deleteByExample(AmGiftPackageExample example);

    int deleteByPrimaryKey(Integer gpId);

    int insert(AmGiftPackage record);

    int insertSelective(AmGiftPackage record);

    List<AmGiftPackage> selectByExampleWithBLOBs(AmGiftPackageExample example);

    List<AmGiftPackage> selectByExample(AmGiftPackageExample example);

    AmGiftPackage selectByPrimaryKey(Integer gpId);

    int updateByExampleSelective(@Param("record") AmGiftPackage record, @Param("example") AmGiftPackageExample example);

    int updateByExampleWithBLOBs(@Param("record") AmGiftPackage record, @Param("example") AmGiftPackageExample example);

    int updateByExample(@Param("record") AmGiftPackage record, @Param("example") AmGiftPackageExample example);

    int updateByPrimaryKeySelective(AmGiftPackage record);

    int updateByPrimaryKeyWithBLOBs(AmGiftPackage record);

    int updateByPrimaryKey(AmGiftPackage record);
}