package com.qfedu.shop.mapper;

import com.qfedu.shop.domain.Goods_Parameter;

public interface Goods_ParameterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goods_Parameter record);

    int insertSelective(Goods_Parameter record);

    Goods_Parameter selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goods_Parameter record);

    int updateByPrimaryKey(Goods_Parameter record);
}