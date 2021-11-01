package com.project.restaurant.service;

import com.project.restaurant.dao.ProductDAO;
import com.project.restaurant.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceIMPL implements RestaurantService {

    // Injecting the parts dao layer
    private final ProductDAO productDAO;

    @Autowired
    public RestaurantServiceIMPL(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }
    @Override
    public List<Product> findAll() {
        return productDAO.findAll();
    }

    @Override
    public Object findById(int productId) {
        return productDAO.findById(productId);
    }

    @Override
    public void saveOrUpdate(Product theProduct) {
        productDAO.saveOrUpdate(theProduct);
    }

    @Override
    public void deleteById(int productId) {
        productDAO.deleteById(productId);
    }
}
