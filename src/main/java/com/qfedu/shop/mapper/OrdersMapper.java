package com.qfedu.shop.mapper;


import com.qfedu.shop.domain.Items;
import com.qfedu.shop.domain.Orders;
import java.util.List;
import java.util.Map;

public interface OrdersMapper {

    int deleteById(Integer id);

    int add(String username);

    int getId();
}