package com.project.shop.service;

import com.project.shop.entity.CartActive;

import java.util.List;

public interface CartService {
    List<CartActive> findAll();
    Object findById(int cartId);
    void saveOrUpdate(CartActive theCart);
    void deleteById(int cartId);
}