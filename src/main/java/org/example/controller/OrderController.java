package org.example.controller;

import org.example.model.Order;
import org.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/order/")
public class OrderController {

    @Autowired
    private OrderService orderService;




    /**
     *
     * @Description     获取订单集合信息
     * @author: 李坤
     * @date: 2020/11/17 14:33
     * @param
     * @return: java.util.List<org.example.model.Order>
     */

    @GetMapping("findOrderList.do")
    public List<Order> findOrderList() {
       return orderService.findOrderList();
    }
}
