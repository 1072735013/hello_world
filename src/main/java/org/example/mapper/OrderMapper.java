package org.example.mapper;


import org.example.model.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper {



    /**
     *
     * @Description     获取订单集合信息
     * @author: 李坤
     * @date: 2020/11/17 14:33
     * @param
     * @return: java.util.List<org.example.model.Order>
     */
    List<Order> findOrderList();
}
