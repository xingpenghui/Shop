package com.qfedu.shop.mapper;


import com.qfedu.shop.domain.Items;

import java.util.List;
import java.util.Map;

public interface ItemsMapper {

    int deleteById(Integer id);

    int add(Items record);

    List<Items> findAll(String username);

    List<Items> findByGname(Map<String,String> map);

    //Integer state,String username
    List<Items> findByState(Map<String,String> map);
}