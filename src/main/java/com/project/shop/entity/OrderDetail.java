package com.project.shop.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "order_detail")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderItem orderItem;

    @Column(name = "order_total")
    private double orderTotal;

    @Column(name = "order_count")
    private int orderCount;

    @Column(name = "order_date")
    private Date orderDate;

    public OrderDetail() {
    }

    public OrderDetail(OrderItem orderItem, double orderTotal, int orderCount, Date orderDate) {
        this.orderItem = orderItem;
        this.orderTotal = orderTotal;
        this.orderCount = orderCount;
        this.orderDate = orderDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", orderItem=" + orderItem +
                ", orderTotal=" + orderTotal +
                ", orderCount=" + orderCount +
                ", orderDate=" + orderDate +
                '}';
    }

}
