package com.project.restaurant.entity;

import javax.persistence.*;


@Entity //This tells Java this is an entity being mapped to a database table.
@Table(name = "products") //Name of the database table being mapped to the class.
public class Product {
    @Id //Maps the primary key.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto increments the primary key

    @Column(name = "id") //Maps Primary Key to table column 'id'
    private int id;

    @Column(name = "product_name") //Maps productName field to table column 'product_name'
    private String productName;

    @Column(name = "product_description") //Maps productDescription field to table column 'product_description'
    private String productDescription;

    @Column(name = "product_price") //Maps productPrice field to table column 'product_price'
    private float productPrice;

    //default no arg constructor
    public Product() {
    }

    //constructor with parameters
    public Product(String productName, String productDescription, float productPrice) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    //toString method
    @Override
    public String toString() {
        return "Meal{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
