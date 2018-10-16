package com.qfedu.shop.manager;

import com.qfedu.shop.domain.Items;
import com.qfedu.shop.mapper.ItemsMapper;
import com.qfedu.shop.mapper.OrdersMapper;
import com.qfedu.shop.service.OrderService;
import com.qfedu.shop.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述:
 * 订单信息
 *
 * @author szp
 * @create 2018-10-16 11:39
 */
@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    private ItemsMapper itemsMapper;

    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public R deleteById(Integer id) {

        if(null == id) {
            throw new RuntimeException("订单ID为空无法删除");
        }

        try {
            itemsMapper.deleteById(id);
            ordersMapper.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return null;
    }

    @Override
    public R add(Items record) {
        return null;
    }

    @Override
    public List<Items> findAll(String username) {
        return null;
    }

    @Override
    public List<Items> findByGname(String username, String pname) {
        return null;
    }

    @Override
    public List<Items> findByState(Integer state, String username) {
        return null;
    }
}
