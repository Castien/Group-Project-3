package com.project.restaurant.service;

import com.project.restaurant.dao.CartDAO;
import com.project.restaurant.entity.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartServiceIMPL implements ShoppingCartService {

    // Injecting the parts dao layer
    private final CartDAO cartDAO;

    @Autowired
    public ShoppingCartServiceIMPL(CartDAO cartDAO) {
        this.cartDAO = cartDAO;
    }
    @Override
    public List<Cart> findAll() {
        return cartDAO.findAll();
    }

    @Override
    public Object findById(int cartId) {
        return cartDAO.findById(cartId);
    }

    @Override
    public void saveOrUpdate(Cart theCart) {
        cartDAO.saveOrUpdate(theCart);
    }

    @Override
    public void deleteById(int cartId) {
        cartDAO.deleteById(cartId);
    }
}
