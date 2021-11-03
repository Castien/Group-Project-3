package com.project.shop.service;

import com.project.shop.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Object findById(int productId);
    void saveOrUpdate(Product theProduct);
    void deleteById(int productId);
}
