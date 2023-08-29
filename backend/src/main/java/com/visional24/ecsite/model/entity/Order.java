package com.visional24.ecsite.model.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String customerName;
    private String address;
    private String email;
    private LocalDate orderDate;
    private double totalPrice;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "order")
    private List<OrderDetail> orderDetails = new ArrayList<>();

    public Order() {}

    public Order(String customerName, String address, String email, LocalDate orderDate, double totalPrice) {
        this.customerName = customerName;
        this.address = address;
        this.email = email;
        this.orderDate = orderDate;
        this.totalPrice = totalPrice;

        System.out.println("Order Initialized");
    }

    public long getId() { return id; }

    public String getCustomerName() { return customerName; }

    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public LocalDate getOrderDate() { return orderDate; }

    public void setOrderDate(LocalDate orderDate) { this.orderDate = orderDate; }

    public double getTotalPrice() { return totalPrice; }

    public void setTotalPrice(double totalPrice) { this.totalPrice = totalPrice; }

    public List<OrderDetail> getOrderDetails() { return orderDetails; }

    public void setOrderDetails(List<OrderDetail> orderDetails) { this.orderDetails = orderDetails;}

}
