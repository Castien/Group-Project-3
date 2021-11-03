package com.project.shop.service;

import com.project.shop.entity.Cart;

import java.util.List;

public interface CartService {
    List<Cart> findAll();
    Object findById(int cartId);
    void saveOrUpdate(Cart theCart);
    void deleteById(int cartId);
}