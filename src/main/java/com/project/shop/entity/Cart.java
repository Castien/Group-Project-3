package com.project.shop.entity;

import javax.persistence.*;

@Entity
@Table(name = "cart")
public class Cart {
    @Id //Maps the primary key.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto increments the primary key

    @Column(name = "cart_id")
    private int id;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "item_price")
    private float itemPrice;

    @Column(name = "cart_total")
    private float cartTotal;

    @Column(name = "item_quantity")
    private int itemQuantity;


    public Cart() {
    }

    public Cart(String itemName, float itemPrice, float cartTotal, int itemQuantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.cartTotal = cartTotal;
        this.itemQuantity = itemQuantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public float getCartTotal() {
        return cartTotal;
    }

    public void setCartTotal(float cartTotal) {
        this.cartTotal = cartTotal;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", cartTotal=" + cartTotal +
                ", itemQuantity=" + itemQuantity +
                '}';
    }
}

