package com.visional24.ecsite.service;

import com.visional24.ecsite.exception.OrderNotCreatedException;
import com.visional24.ecsite.exception.ProductNotFoundException;
import com.visional24.ecsite.model.entity.Order;
import com.visional24.ecsite.model.entity.OrderDetail;
import com.visional24.ecsite.model.dto.OrderDetailDto;
import com.visional24.ecsite.model.dto.OrderDto;
import com.visional24.ecsite.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private OrderRepository orderRepository;
    private ProductService productService;

    @Autowired
    public OrderService(OrderRepository orderRepository, ProductService productService) {
        this.orderRepository = orderRepository;
        this.productService = productService;
    }

    public Order createOrder(OrderDto orderDto) {
        Order order = new Order(orderDto.getCustomerName(), orderDto.getAddress(), orderDto.getEmail(), orderDto.getOrderDate(), orderDto.getTotalPrice());
        List<OrderDetail> orderDetails = new ArrayList<>();
        for(OrderDetailDto orderDetailDto : orderDto.getOrderDetails()) {
            if(productService.findProductById(orderDetailDto.getProductId()).isPresent()) {
                OrderDetail orderDetail = new OrderDetail(order, productService.findProductById(orderDetailDto.getProductId()).get(), orderDetailDto.getQuantity(), orderDetailDto.getPrice());
                orderDetails.add(orderDetail);
            }else {
                throw new ProductNotFoundException("Product could not be found. Therefore Order could not be created");
            }
        }
        order.setOrderDetails(orderDetails);

        try {
            return orderRepository.save(order);
        }catch (Exception e) {
            throw new OrderNotCreatedException("Order could not be created/saved");
        }
    }

    public Optional<Order> getOrderById(Long id) { return orderRepository.findById(id); }

    public List<Order> getAllOrder() { return orderRepository.findAll(); }

}
