package com.visional24.ecsite.controller;

import com.visional24.ecsite.model.entity.Order;
import com.visional24.ecsite.model.entity.dto.OrderDto;
import com.visional24.ecsite.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/orders")
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) { this.orderService = orderService; }

    @PostMapping
    public Order createOrder(@RequestBody OrderDto orderDto) { return orderService.createOrder(orderDto); }

    @GetMapping("/{orderId}")
    public Optional<Order> getOrderById(@PathVariable Long orderId) { return orderService.getOrderById(orderId); }

    @GetMapping
    public List<Order> getAllOrders() { return orderService.getAllOrder(); }

}
