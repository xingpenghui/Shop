package com.qfedu.shop.mapper;

import com.qfedu.shop.domain.DetailGrade;

public interface DetailGradeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DetailGrade record);

    int insertSelective(DetailGrade record);

    DetailGrade selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DetailGrade record);

    int updateByPrimaryKey(DetailGrade record);
}