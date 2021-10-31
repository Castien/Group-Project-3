package com.project.restaurant.service;

import com.project.restaurant.dao.RestaurantDAO;
import com.project.restaurant.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceIMPL implements RestaurantService{


    // Injecting the dao layer
    private final RestaurantDAO restaurantDAO;

    @Autowired
    public RestaurantServiceIMPL(RestaurantDAO restaurantDAO) {
        this.restaurantDAO = restaurantDAO;
    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Object findById(int productId) {
        return null;
    }

    @Override
    public void saveOrUpdate(Product theProduct) {

    }

    @Override
    public void deleteById(int productId) {

    }
}
