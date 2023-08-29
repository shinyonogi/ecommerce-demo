package com.visional24.ecsite.model.entity;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ProductTest {

    @Test
    public void testProductInitialization() {
        long testId = 1;
        String testProductName = "Test Product";
        double testPrice = 2000;
        String testDescription = "This is a Test Product";
        Product testProduct = new Product(testId, testProductName, testPrice, testDescription);

        assertThat(testProduct.getId()).isEqualTo(testId);
        assertThat(testProduct.getName()).isEqualTo(testProductName);
        assertThat(testProduct.getPrice()).isEqualTo(testPrice);
        assertThat(testProduct.getDescription()).isEqualTo(testDescription);
    }

    @Test
    public void testGetAndSetProductName() {
        Product testProduct = new Product();
        String testProductName = "Test Product";
        testProduct.setName(testProductName);

        assertThat(testProduct.getName()).isEqualTo(testProductName);
    }

    @Test
    public void testGetAndSetProductPrice() {
        Product testProduct = new Product();
        double testPrice = 3000;
        testProduct.setPrice(testPrice);

        assertThat(testProduct.getPrice()).isEqualTo(testPrice);
    }

    @Test
    public void testGetAndSetProductDescription() {
        Product testProduct = new Product();
        String testDescription = "This is a Test Product";
        testProduct.setDescription(testDescription);

        assertThat(testProduct.getDescription()).isEqualTo(testDescription);
    }

    @Test
    public void testEqualsAndHashCode() {
        Product product1 = new Product();
        product1.setId(1L);
        product1.setName("Test Product");

        Product product2 = new Product();
        product2.setId(1L);
        product2.setName("Test Product");

        assertThat(product1).isEqualTo(product2);
        assertThat(product1.hashCode()).isEqualTo(product2.hashCode());
    }


}
