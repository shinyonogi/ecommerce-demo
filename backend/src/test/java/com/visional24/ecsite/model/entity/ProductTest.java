package com.visional24.ecsite.model.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ProductTest {

    private Product testProduct;

    @BeforeEach
    public void setup() {
        long testId = 1;
        String testProductName = "Test Product";
        double testPrice = 2000;
        String testDescription = "This is a Test Product";
        testProduct = new Product(testId, testProductName, testPrice, testDescription);
    }

    @Test
    public void testProductInitialization() {
        assertThat(testProduct.getId()).isEqualTo(1);
        assertThat(testProduct.getName()).isEqualTo("Test Product");
        assertThat(testProduct.getPrice()).isEqualTo(2000);
        assertThat(testProduct.getDescription()).isEqualTo("This is a Test Product");
    }

    @Test
    public void testGetAndSetProductName() {
        String testProductName = "Test Product 2";
        testProduct.setName(testProductName);

        assertThat(testProduct.getName()).isEqualTo(testProductName);
    }

    @Test
    public void testGetAndSetProductPrice() {
        double testPrice = 3000;
        testProduct.setPrice(testPrice);

        assertThat(testProduct.getPrice()).isEqualTo(testPrice);
    }

    @Test
    public void testGetAndSetProductDescription() {
        String testDescription = "This is a Test Product 2";
        testProduct.setDescription(testDescription);

        assertThat(testProduct.getDescription()).isEqualTo(testDescription);
    }

    @Test
    public void testEqualsAndHashCode() {
        Product testProduct1 = new Product();
        testProduct1.setId(1L);
        testProduct1.setName("Test Product");

        Product testProduct2 = new Product();
        testProduct2.setId(1L);
        testProduct2.setName("Test Product");

        assertThat(testProduct1).isEqualTo(testProduct2);
        assertThat(testProduct1.hashCode()).isEqualTo(testProduct2.hashCode());
    }

}
