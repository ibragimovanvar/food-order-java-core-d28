package com.generation.model;

import com.generation.enums.OrderStatus;

import java.util.List;

public class Order {
    private List<Product> products;
    private Integer price;
    private OrderStatus status;

    public Order(List<Product> products, Integer price, OrderStatus status) {
        this.products = products;
        this.price = price;
        this.status = status;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
