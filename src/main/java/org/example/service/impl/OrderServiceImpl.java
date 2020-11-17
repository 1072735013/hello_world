package org.example.service.impl;

import org.example.mapper.OrderMapper;
import org.example.model.Order;
import org.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;



    @Override
    public List<Order> findOrderList() {

        return orderMapper.findOrderList();



    }
}
