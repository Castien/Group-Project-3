package com.project.shop.entity;

import javax.persistence.*;

@Entity
@Table(name = "order_item")
public class OrderItem {
    @Id //Maps the primary key.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto increments the primary key
    private int id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderDetail orderDetail;

    private float total;

    @OneToOne
    private Product product;

    @Column (name = "product_count")
    private int productCount;

    @Column (name = "buying_price")
    private float buyingPrice;

    public OrderItem() {
    }

    public OrderItem(OrderDetail orderDetail, float total, Product product, int productCount, float buyingPrice) {
        this.orderDetail = orderDetail;
        this.total = total;
        this.product = product;
        this.productCount = productCount;
        this.buyingPrice = buyingPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OrderDetail getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(OrderDetail orderDetail) {
        this.orderDetail = orderDetail;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public float getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(float buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", orderDetail=" + orderDetail +
                ", total=" + total +
                ", product=" + product +
                ", productCount=" + productCount +
                ", buyingPrice=" + buyingPrice +
                '}';
    }
}
