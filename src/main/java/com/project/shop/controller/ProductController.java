package com.project.shop.controller;

import com.project.shop.entity.Product;
import com.project.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Allow calls from React
@CrossOrigin(origins = { "http://localhost:3000"})
@RestController
public class ProductController {

    private final ProductService productService;

    //Constructor Injection - tells the spring framework to wire up dependencies for the productService.
    @Autowired
    public ProductController(@Qualifier("productServiceIMPL") ProductService productService) {
        this.productService = productService;
    }

    //This is a GET request that will read a list of all the Products.
    //http://localhost:8080/retrieveAllProducts
    @GetMapping("/retrieveAllProducts")
    public List<Product> findAll() {
        return productService.findAll();
    }

    //This is a GET request that will read a list of all the parts.
    //http://localhost:8080/retrieveProductByID/1
    @GetMapping("/retrieveProductByID/{productId}")
    public String findByID(@PathVariable int productId) {
        productService.findById(productId);
        return "Product id : " + productId;
    }

    //This is a POST request to add a new product.
    //http://localhost:8080/addProduct
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product theProduct) {
        //also, just in case they pass an id in JSON .... set id to 0
        //this is to force a save of new item .... instead of update
        theProduct.setId(0);

        //This will call the productImpl.save method to save a new product
        //through the productService
        productService.saveOrUpdate(theProduct);
        return theProduct;
    }

    //This is a PUT request to update an existing product.
    //http://localhost:8080/updateProduct
    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product updateProduct) {
        //Notice theProduct.setId(0); this will execute an update instead of a create
        productService.saveOrUpdate(updateProduct);
        return updateProduct;
    }

    //This is a DELETE request to delete an existing product.
    //http://localhost:8080/deleteProduct/1
    @DeleteMapping("/deleteProduct/{productId}")
    public String deleteProduct(@PathVariable int productId) {
        //This will execute the deleteByID.
        productService.deleteById(productId);
        return "Deleted product id : " + productId;
    }

}
