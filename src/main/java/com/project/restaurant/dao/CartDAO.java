package com.project.restaurant.dao;

import com.project.restaurant.entity.Cart;

import java.util.List;

public interface CartDAO {
    List<Cart> findAll();
    Object findById(int theID);
    void saveOrUpdate(Cart theCart);
    void deleteById(int theId);
}
