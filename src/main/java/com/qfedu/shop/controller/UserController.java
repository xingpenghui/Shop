package com.qfedu.shop.controller;

import com.qfedu.shop.common.ResultUtil;
import com.qfedu.shop.domain.User;
import com.qfedu.shop.service.UserService;
import com.qfedu.shop.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author fujianglong
 * @create 2018-10-15 21:41
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userregister.do")
    public R userregister(User user) {
        String phone = user.getPhone();
        String email = user.getEmail();
        try {
            R r = userService.checkPhoneOrEmail(phone, email);
            if (r.getCode() == 200) {
                userService.save(user);
                return ResultUtil.setOK("注册成功");
            } else {
                return ResultUtil.setERROR("注册失败");
        }
    } catch (Exception e) {
            throw new RuntimeException("注册异常");
        }

    }

    @RequestMapping("/userlogin.do")
    public R userlogin(User user) {
        if (user == null || user.equals("")) {
            throw new RuntimeException("信息为空无法登录");
        }
        try {
            userService.login(user);
            return ResultUtil.setOK("登录成功");
        } catch (Exception e) {
            throw new RuntimeException("登录失败");
        }

    }

}
