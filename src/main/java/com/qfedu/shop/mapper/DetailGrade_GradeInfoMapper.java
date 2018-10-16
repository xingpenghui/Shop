package com.qfedu.shop.mapper;

import com.qfedu.shop.domain.DetailGrade_GradeInfo;

public interface DetailGrade_GradeInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DetailGrade_GradeInfo record);

    int insertSelective(DetailGrade_GradeInfo record);

    DetailGrade_GradeInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DetailGrade_GradeInfo record);

    int updateByPrimaryKey(DetailGrade_GradeInfo record);
}