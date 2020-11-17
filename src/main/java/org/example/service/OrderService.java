package org.example.service;

import org.example.model.Order;

import java.util.List;

public interface OrderService {

    /**
     *
     * @Description     获取订单集合信息
     * @author: 李坤
     * @date: 2020/11/17 14:33
     * @param
     * @return: java.util.List<org.example.model.Order>
     */
    public List<Order> findOrderList();
}
