package com.qfedu.shop.service;/**
 * 描述：
 */

import com.qfedu.shop.domain.Cart;
import com.qfedu.shop.domain.Goods;
import com.qfedu.shop.vo.R;

import java.util.List;
import java.util.Map;

/**
 * 描述:
 *    购物车
 * @author szp
 * @create 2018-10-15 21:38
 */
public interface CartService {

    /**
     * 删除某个购物车物件
     * @param id
     * @return
     */
    R deleteFromCart(Integer id);

    /**
     * 查询购物车
     * @param username
     * @return
     */
    List<Goods> show(String username);

    /**
     * 搜索
     * @param
     * @return
     */
    List<Goods> search(String username,String gname);

    /**
     * 添加到购物车
     * @param cart
     * @return
     */
    R shopping(Cart cart);

    /**
     * 修改个数
     * @param record
     * @return
     */
    R updateCount(Cart record);


}
