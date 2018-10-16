package com.qfedu.shop.mapper;

import com.qfedu.shop.domain.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectById(Integer id);

    User selectByName(String name);

    User selectByEmail(String email);

    User selectByPhone(String phone);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}