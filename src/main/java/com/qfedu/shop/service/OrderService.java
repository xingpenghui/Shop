package com.qfedu.shop.service;/**
 * 描述：
 */

import com.qfedu.shop.domain.Items;
import com.qfedu.shop.vo.R;

import java.util.List;
import java.util.Map;

/**
 * 描述:
 *    订单信息
 * @author szp
 * @create 2018-10-16 11:24
 */
public interface OrderService {
    /**
     * 删除某个订单信息
     * @param id
     * @return
     */
    R deleteById(Integer id);

    /**
     * 下单
     * @param record
     * @return
     */
    R add(Items record);

    /**
     * 查看所有订单
     * @param username
     * @return
     */
    List<Items> findAll(String username);

    /**
     * 根据商品搜索
     * @param
     * @return
     */
    List<Items> findByGname(String username,String pname);

    /**
     * 根据订单状态搜索
     * @param state
     * @param username
     * @return
     */
    List<Items> findByState(Integer state,String username);

}
