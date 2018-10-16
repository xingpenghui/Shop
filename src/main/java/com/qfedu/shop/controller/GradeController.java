package com.qfedu.shop.controller;

import org.apache.shiro.SecurityUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 * 等级接口
 *
 * @author 绅士桑
 * @create 2018-10-15 20:40
 */
@RestController
public class GradeController {

    /*//查询左菜单
    @GetMapping("gradelist.do")
    public List<MenuVo> menus(){
        User user= (User) SecurityUtils.getSubject().getSession().getAttribute("user");
        return userService.queryMenu(user.getId());
    }*/

}
