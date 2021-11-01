package com.project.restaurant.service;

import com.project.restaurant.entity.Cart;

import java.util.List;

public interface ShoppingCartService {
    List<Cart> findAll();
    Object findById(int cartId);
    void saveOrUpdate(Cart theCart);
    void deleteById(int cartId);
}