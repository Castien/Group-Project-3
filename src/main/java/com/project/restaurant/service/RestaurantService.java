package com.project.restaurant.service;

import com.project.restaurant.entity.Product;

import java.util.List;

public interface RestaurantService {
    List<Product> findAll();
    Object findById(int productId);
    void saveOrUpdate(Product theProduct);
    void deleteById(int productId);
}
