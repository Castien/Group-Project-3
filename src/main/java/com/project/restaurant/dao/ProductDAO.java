package com.project.restaurant.dao;

import com.project.restaurant.entity.Product;

import java.util.List;

public interface ProductDAO {
    List<Product> findAll();
    Object findById(int theID);
    void saveOrUpdate(Product theProduct);
    void deleteById(int theId);
}
