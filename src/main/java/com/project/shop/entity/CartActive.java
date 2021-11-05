package com.project.shop.entity;

import javax.persistence.*;

@Entity
@Table(name = "cart_active")
public class CartActive {
    @Id //Maps the primary key.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto increments the primary key
    @Column(name = "id")
    private int id;

    @OneToOne
    private Product product;

    @Column(name = "cart_id")
    private int cartID;

    @Column(name = "item_price")
    private float itemPrice;

    @Column(name = "item_quantity")
    private int itemQuantity;

    @Column(name = "cart_total")
    private float cartTotal;

    public CartActive() {
    }

    public CartActive(Product product, int cartID, float itemPrice, int itemQuantity, float cartTotal) {
        this.product = product;
        this.cartID = cartID;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
        this.cartTotal = cartTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public float getCartTotal() {
        return cartTotal;
    }

    public void setCartTotal(float cartTotal) {
        this.cartTotal = cartTotal;
    }

    @Override
    public String toString() {
        return "CartActive{" +
                "id=" + id +
                ", product=" + product +
                ", cartID=" + cartID +
                ", itemPrice=" + itemPrice +
                ", itemQuantity=" + itemQuantity +
                ", cartTotal=" + cartTotal +
                '}';
    }
}