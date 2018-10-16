package com.qfedu.shop.manager;

import com.qfedu.shop.domain.Items;
import com.qfedu.shop.mapper.ItemsMapper;
import com.qfedu.shop.mapper.OrdersMapper;
import com.qfedu.shop.service.OrderService;
import com.qfedu.shop.utils.ResultUtil;
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
            itemsMapper.deleteByOId(id);
            ordersMapper.deleteById(id);
            return ResultUtil.setOK("订单删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("订单删除失败");

        }

    }

    @Override
    public R add(List<Items> list,String username) {
        if(null == list) {
            throw new RuntimeException("订单为空无法添加");
        }
        try {
            ordersMapper.add(username);

            int oid = ordersMapper.getId();

            for (Items item : list ) {
                item.setOid(oid);
                itemsMapper.add(item);
            }

            return ResultUtil.setOK("订单添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("订单删除失败");
        }

    }

    @Override
    public List<Items> findAll(String username) {

        if(username == null) {
            throw new RuntimeException("请登录否则无法查订单");
        }

        List<Items> list = itemsMapper.findAll(username);

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
