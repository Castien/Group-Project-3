package com.project.shop.controller;

import com.project.shop.entity.Cart;
import com.project.shop.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Allow calls from React
@CrossOrigin(origins = { "http://localhost:3000"})
@RestController
public class CartController {

    private final CartService cartService;

    //Constructor Injection - tells the spring framework to wire up dependencies for the cartService.
    @Autowired
    public CartController(@Qualifier("cartServiceIMPL") CartService cartService) {
        this.cartService = cartService;
    }

    //This is a GET request that will read a list of all the Carts.
    //http://localhost:8080/retrieveAllCarts
    @GetMapping("/retrieveAllCarts")
    public List<Cart> findAll() {
        return cartService.findAll();
    }

    //This is a GET request that will read a list of all the parts.
    //http://localhost:8080/retrieveCartByID/1
    @GetMapping("/retrieveCartByID/{cartId}")
    public String findByID(@PathVariable int cartId) {
        cartService.findById(cartId);
        return "Cart id : " + cartId;
    }

    //This is a POST request to add a new cart.
    //http://localhost:8080/addCart
    @PostMapping("/addCart")
    public Cart addCart(@RequestBody Cart theCart) {
        //also, just in case they pass an id in JSON .... set id to 0
        //this is to force a save of new item .... instead of update
        theCart.setId(0);

        //This will call the cartImpl.save method to save a new cart
        //through the cartService
        cartService.saveOrUpdate(theCart);
        return theCart;
    }

    //This is a PUT request to update an existing cart.
    //http://localhost:8080/updateCart
    @PutMapping("/updateCart")
    public Cart updateCart(@RequestBody Cart updateCart) {
        //Notice theCart.setId(0); this will execute an update instead of a create
        cartService.saveOrUpdate(updateCart);
        return updateCart;
    }

    //This is a DELETE request to delete an existing cart.
    //http://localhost:8080/deleteCart/1
    @DeleteMapping("/deleteCart/{cartId}")
    public String deleteCart(@PathVariable int cartId) {
        //This will execute the deleteByID.
        cartService.deleteById(cartId);
        return "Deleted cart id : " + cartId;
    }

}
