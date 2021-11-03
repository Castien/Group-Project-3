package com.project.shop.dao;

import com.project.shop.entity.Product;

import java.util.List;

public interface ProductDAO {
    List<Product> findAll();
    Object findById(int theID);
    void saveOrUpdate(Product theProduct);
    void deleteById(int theId);
}
