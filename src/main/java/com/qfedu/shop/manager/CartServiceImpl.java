package com.qfedu.shop.manager;

import com.qfedu.shop.domain.Cart;
import com.qfedu.shop.domain.Goods;
import com.qfedu.shop.mapper.CartMapper;
import com.qfedu.shop.service.CartService;
import com.qfedu.shop.utils.ResultUtil;
import com.qfedu.shop.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 描述:
 * 购物车实现类
 *
 * @author szp
 * @create 2018-10-15 21:41
 */
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartMapper cartMapper;


    @Override
    public R deleteFromCart(Integer id) {

        if (null == id) {
            throw new RuntimeException("没有id无法删除");
        }

        try {
            cartMapper.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
             throw new RuntimeException("购物车删除失败");
        }

        return ResultUtil.setOK("删除成功");
    }

    @Override
    public List<Goods> show(String username) {

        if (null == username) {
            throw new RuntimeException("请登录再来购物车");
        }
        List<Goods> list = null;

        try {
            list = cartMapper.findAll(username);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("购物车无法查询");
        }
        
        return list;
    }

    @Override
    public List<Goods> search(String username,String gname) {

        Map<String,String> map = new HashMap<>();

        if (null == username) {
            throw new RuntimeException("请登录再来购物车");
        }
        if (null == gname || gname.equals("")) {
            map.put("gname",null);
        }
        if(gname != null) {
            map.put("gname","%"+ gname +"%");
        }
        map.put("username",username);

        List<Goods> list = null;

        try {
            list = cartMapper.findByName(map);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("购物车无法查询");
        }

        return list;
    }

    @Override
    public R shopping(Cart cart) {

        if(null == cart) {
            throw new RuntimeException("无法添加空的");
        }

        try {
            cartMapper.add(cart);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("添加失败");
        }

        return ResultUtil.setOK("添加成功");
    }

    @Override
    public R updateCount(Cart record) {
        if(null == record) {
            throw new RuntimeException("数目修改失败");
        }

        try {
            cartMapper.updateById(record);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("数目修改失败");
        }

        return ResultUtil.setOK("数目修改成功");
    }
}
