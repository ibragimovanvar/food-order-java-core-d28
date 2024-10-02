package com.generation.model;

import java.util.List;

public class Category extends NameImageExtender{
    private List<Product> products;

    public Category(String name, String image, List<Product> products) {
        super(name, image);
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return getName();
    }
}
