package com.qfedu.shop.mapper;


import com.qfedu.shop.domain.Cart;
import com.qfedu.shop.domain.Goods;

import java.util.List;
import java.util.Map;

public interface CartMapper {

    int deleteById(Integer id);

    List<Goods> findAll(String username);

    List<Goods> findByName(Map<String,String> maps);

    int add(Cart cart);

    int updateById(Cart record);

}