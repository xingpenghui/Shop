package com.qfedu.shop.mapper;

import com.qfedu.shop.domain.Goods_gradeInfo;

public interface Goods_gradeInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goods_gradeInfo record);

    int insertSelective(Goods_gradeInfo record);

    Goods_gradeInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goods_gradeInfo record);

    int updateByPrimaryKey(Goods_gradeInfo record);
}