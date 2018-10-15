package com.qfedu.shop.mapper;

import com.qfedu.shop.domain.Brand_Goods;

public interface Brand_GoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Brand_Goods record);

    int insertSelective(Brand_Goods record);

    Brand_Goods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Brand_Goods record);

    int updateByPrimaryKey(Brand_Goods record);
}