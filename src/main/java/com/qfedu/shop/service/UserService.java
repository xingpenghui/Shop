package com.qfedu.shop.service;

import com.qfedu.shop.domain.User;
import com.qfedu.shop.vo.R;

/**
 * Description:
 *
 * @author fujianglong
 * @create 2018-10-15 21:02
 */
public interface UserService {

    // 注册
    R save(User user);

    // 校验是否存在
    R checkPhoneOrEmail(String name, String email);

    // 登录
    User login(User user);



}
