package com.visional24.ecsite.model.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderTest {

    private Order testOrder;

    @BeforeEach
    public void setUp() {
        testOrder = new Order("John Doe", "123 Street", "john@example.com", LocalDate.now(), 100.50);
    }

    @Test
    public void testConstructor() {
        assertEquals("John Doe", testOrder.getCustomerName());
        assertEquals("123 Street", testOrder.getAddress());
        assertEquals("john@example.com", testOrder.getEmail());
        assertEquals(100.50, testOrder.getTotalPrice());
    }

    @Test
    public void testSettersAndGetters() {
        testOrder.setCustomerName("Jane Smith");
        testOrder.setAddress("456 Lane");
        testOrder.setEmail("jane@example.com");
        testOrder.setTotalPrice(200.75);

        assertEquals("Jane Smith", testOrder.getCustomerName());
        assertEquals("456 Lane", testOrder.getAddress());
        assertEquals("jane@example.com", testOrder.getEmail());
        assertEquals(200.75, testOrder.getTotalPrice());
    }

    @Test
    public void testOrderDetailsAssociation() {
        OrderDetail mockOrderDetail1 = new OrderDetail();
        OrderDetail mockOrderDetail2 = new OrderDetail();

        testOrder.setOrderDetails(Arrays.asList(mockOrderDetail1, mockOrderDetail2));

        assertTrue(testOrder.getOrderDetails().contains(mockOrderDetail1));
        assertTrue(testOrder.getOrderDetails().contains(mockOrderDetail2));
    }

}
