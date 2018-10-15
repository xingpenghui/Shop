package com.qfedu.shop.mapper;

import com.qfedu.shop.domain.GradeInfo;

public interface GradeInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GradeInfo record);

    int insertSelective(GradeInfo record);

    GradeInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GradeInfo record);

    int updateByPrimaryKey(GradeInfo record);
}