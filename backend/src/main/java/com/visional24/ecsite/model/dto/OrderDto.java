package com.visional24.ecsite.model.dto;

import java.time.LocalDate;
import java.util.List;

public class OrderDto {

    private String customerName;
    private String address;
    private String email;
    private LocalDate orderDate;
    private double totalPrice;
    private List<OrderDetailDto> orderDetails;

    public OrderDto(String customerName, String address, String email, LocalDate orderDate, double totalPrice, List<OrderDetailDto> orderDetails) {
        this.customerName = customerName;
        this.address = address;
        this.email = email;
        this.orderDate = orderDate;
        this.totalPrice = totalPrice;
        this.orderDetails = orderDetails;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public List<OrderDetailDto> getOrderDetails() {
        return orderDetails;
    }
}
