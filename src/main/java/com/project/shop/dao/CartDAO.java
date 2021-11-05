package com.project.shop.dao;

import com.project.shop.entity.Cart;
import com.project.shop.entity.CartActive;
import com.project.shop.entity.OrderDetail;

import java.util.List;

public interface CartDAO {
    List<CartActive> findAll();
    Object findById(int theID);
    void saveOrUpdate(CartActive theCart);
    void deleteById(int theId);

    // fetch the CartActive based on cartId and productId
    public CartActive getByCartAndProduct(int cartId, int productId);

    // updating the cart
    boolean updateCart(CartActive cart);

    // adding order details
    boolean addOrderDetail(OrderDetail orderDetail);

}
