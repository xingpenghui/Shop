package com.qfedu.shop.mapper;

import com.qfedu.shop.domain.Goods_Img;

public interface Goods_ImgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goods_Img record);

    int insertSelective(Goods_Img record);

    Goods_Img selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goods_Img record);

    int updateByPrimaryKey(Goods_Img record);
}