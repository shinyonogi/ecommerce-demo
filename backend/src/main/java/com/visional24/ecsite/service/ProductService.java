package com.visional24.ecsite.service;

import com.visional24.ecsite.model.entity.Product;
import com.visional24.ecsite.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) { this.productRepository = productRepository; }

    public Product saveProduct(Product product) { return productRepository.save(product); }

    public Optional<Product> findProductById(Long id) { return productRepository.findById(id); }

    public List<Product> findAllProducts() { return productRepository.findAll(); }

}
