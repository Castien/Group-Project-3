package com.project.restaurant.dao;

import com.project.restaurant.entity.Product;

import java.util.List;

public interface RestaurantDAO {
    List<Product> findAll();
    Object findById(int theId);
    void saveOrUpdate(Product theEmployee);
    void deleteById(int theId);
}
