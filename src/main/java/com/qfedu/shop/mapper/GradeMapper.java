package com.qfedu.shop.mapper;

import com.qfedu.shop.domain.Grade;

public interface GradeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Grade record);

    int insertSelective(Grade record);

    Grade selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Grade record);

    int updateByPrimaryKey(Grade record);
}