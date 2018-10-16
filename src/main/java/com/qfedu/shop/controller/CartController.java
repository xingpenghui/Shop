package com.qfedu.shop.controller;

import com.qfedu.shop.domain.Cart;
import com.qfedu.shop.domain.Goods;
import com.qfedu.shop.service.CartService;
import com.qfedu.shop.utils.ResultUtil;
import com.qfedu.shop.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * 描述:
 * 购物车handler
 *
 * @author szp
 * @create 2018-10-16 9:13
 */
@RestController
public class CartController {

    @Autowired
    private CartService cartService;

    @RequestMapping("shopping.do")
    public R shopping(Cart cart){

        try {
            cartService.shopping(cart);
            return ResultUtil.setOK("添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.setERROR("添加购物车失败");
        }

    }

    @RequestMapping("deleteShopping.do")
    public R delete(Integer id){

        try {
            cartService.deleteFromCart(id);
            return ResultUtil.setOK("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.setERROR("购物车删除失败");
        }

    }

    @RequestMapping("updateCount.do")
    public R updateCount(Cart cart){

        try {
            cartService.updateCount(cart);
            return ResultUtil.setOK("数目修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.setERROR("数目修改失败");
        }

    }

    @RequestMapping("showAll.do")
    public Object show(HttpServletRequest request){

        try {
            List<Goods> list = cartService.show((String) request.getSession().getAttribute("username"));
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.setERROR("购物车查找失败");
        }

    }

    @RequestMapping("searchCart.do")
    public Object searchCart(HttpServletRequest request,String gname){

        try {
            List<Goods> list = cartService.search((String) request.getSession().getAttribute("username"),gname);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.setERROR("购物车查找失败");
        }

    }

}
