package com.visional24.ecsite.model.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderDetailTest {

    private OrderDetail testOrderDetail;
    private Order mockOrder;
    private Product mockProduct;

    @BeforeEach
    public void setup() {
        mockOrder = new Order();
        mockProduct = new Product();
        testOrderDetail = new OrderDetail(mockOrder, mockProduct, 10, 100);
    }

    @Test
    public void testOrderDetailInitialization() {
        assertEquals(mockOrder.getId(), testOrderDetail.getOrder());
        assertEquals(mockProduct.getId(), testOrderDetail.getProduct());
        assertEquals(10, testOrderDetail.getQuantity());
        assertEquals(100.0, testOrderDetail.getPrice());
    }

    @Test
    public void testSettersAndGetters() {
        Order newMockOrder = new Order();
        Product newMockProduct = new Product();

        testOrderDetail.setOrder(newMockOrder);
        testOrderDetail.setProduct(newMockProduct);
        testOrderDetail.setQuantity(20);
        testOrderDetail.setPrice(200.0);

        assertEquals(newMockOrder.getId(), testOrderDetail.getOrder());
        assertEquals(newMockProduct.getId(), testOrderDetail.getProduct());
        assertEquals(20, testOrderDetail.getQuantity());
        assertEquals(200.0, testOrderDetail.getPrice());
    }

}
