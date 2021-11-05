package com.project.shop.entity;

import javax.persistence.*;

@Entity
@Table(name = "cart")
public class Cart {
    @Id //Maps the primary key.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto increments the primary key

    @Column(name = "id")
    private int id;

    @Column(name = "last_total")
    private float lastTotal;

    @Column(name = "cart_lines")
    private int cartLines;

    @OneToOne
    private OrderItem orderItem;

    public Cart() {
    }

    public Cart(float lastTotal, int cartLines, OrderItem orderItem) {
        this.lastTotal = lastTotal;
        this.cartLines = cartLines;
        this.orderItem = orderItem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getLastTotal() {
        return lastTotal;
    }

    public void setLastTotal(float lastTotal) {
        this.lastTotal = lastTotal;
    }

    public int getCartLines() {
        return cartLines;
    }

    public void setCartLines(int cartLines) {
        this.cartLines = cartLines;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", lastTotal=" + lastTotal +
                ", cartLines=" + cartLines +
                ", orderItem=" + orderItem +
                '}';
    }

}

