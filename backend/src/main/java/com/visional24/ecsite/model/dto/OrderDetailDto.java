package com.visional24.ecsite.model.dto;

public class OrderDetailDto {

    private long productId;
    private int quantity;
    private double price;

    public OrderDetailDto(int productId, int quantity, double price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public long getProductId() { return productId; }

    public int getQuantity() { return quantity; }

    public double getPrice() { return price;}

}
