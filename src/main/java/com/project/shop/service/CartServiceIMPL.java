package com.project.shop.service;

import com.project.shop.dao.CartDAO;
import com.project.shop.entity.CartActive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceIMPL implements CartService {

    // Injecting the parts dao layer
    private final CartDAO cartDAO;

    @Autowired
    public CartServiceIMPL(CartDAO cartDAO) {
        this.cartDAO = cartDAO;
    }

    @Override
    public List<CartActive> findAll() {
        return cartDAO.findAll();
    }

    @Override
    public Object findById(int cartId) {
        return cartDAO.findById(cartId);
    }

    @Override
    public void saveOrUpdate(CartActive theCart) {
        cartDAO.saveOrUpdate(theCart);
    }

    @Override
    public void deleteById(int cartId) {
        cartDAO.deleteById(cartId);
    }

}
