package com.qfedu.shop.mapper;

import com.qfedu.shop.domain.Store_Brand;

public interface Store_BrandMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Store_Brand record);

    int insertSelective(Store_Brand record);

    Store_Brand selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Store_Brand record);

    int updateByPrimaryKey(Store_Brand record);
}