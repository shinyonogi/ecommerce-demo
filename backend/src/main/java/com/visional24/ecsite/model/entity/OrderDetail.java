package com.visional24.ecsite.model.entity;

import jakarta.persistence.*;


@Entity
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;
    private int quantity;
    private double price;

    public OrderDetail() {}

    public OrderDetail(Order order, Product product, int quantity, double price) {
        this.order = order;
        this.product = product;
        this.quantity = quantity;
        this.price = price;

        System.out.println("Order Detail Initialized");
    }

    // gerOrder() and getProduct() Method return their IDs!

    public long getId() { return id; }

    public long getOrder() { return order.getId(); }

    public void setOrder(Order order) { this.order = order; }

    public long getProduct() { return product.getId(); }

    public void setProduct(Product product) { this.product = product; }

    public void setId(long id) { this.id = id; }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

}

