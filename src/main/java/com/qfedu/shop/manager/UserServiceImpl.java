package com.qfedu.shop.manager;

import com.qfedu.shop.common.PassUtil;
import com.qfedu.shop.common.ResultUtil;
import com.qfedu.shop.domain.User;
import com.qfedu.shop.mapper.UserMapper;
import com.qfedu.shop.service.UserService;
import com.qfedu.shop.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * Description:
 *
 * @author fujianglong
 * @create 2018-10-15 21:05
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    // 注册用户
    @Override
    public R save(User user) {
        user.setPassword(PassUtil.md5(user.getPassword()));

        return ResultUtil.setRes(userMapper.insertSelective(user));
    }

    // 校验电话号码和邮件是否可用
    @Override
    public R checkPhoneOrEmail(String phone, String email) {

        User user = new User();
        User user1 = new User();
        if (phone != null) {
            user = userMapper.selectByPhone(phone);
            if (user == null) {
                // 可用
                return ResultUtil.setOK("该号码可用");
            } else {
                return ResultUtil.setERROR("该好码已被注册");
            }
        } else {
            user1 = userMapper.selectByEmail(email);
            if (user1 == null) {
                // 可用
                return ResultUtil.setOK("该邮箱可用");
            } else {
                return ResultUtil.setERROR("该邮箱已被注册");
            }
        }

    }

    @Override
    public User login(User user) {
        String name = user.getUsername();
        String email = user.getEmail();
        String password = user.getPassword();
        String phone = user.getPhone();
        if (name != null) {
            User user1 = userMapper.selectByName(name);
            if (Objects.equals(user1.getPassword(), PassUtil.md5(password))) {
                return user1;
            }
        } else if (email != null) {
            User user2 = userMapper.selectByEmail(email);
            if (Objects.equals(user2.getPassword(), PassUtil.md5(password))) {
                return user2;
            }
        } else if (phone != null) {
            User user3 = userMapper.selectByPhone(phone);
            if (Objects.equals(user3.getPassword(), PassUtil.md5(password))) {
                return user3;
            }
        }
        return null;
    }
}
