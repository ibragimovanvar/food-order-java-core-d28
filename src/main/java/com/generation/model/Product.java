package com.generation.model;

public class Product extends NameImageExtender{
    private Integer price;

    public Product(String name, String image, Integer price) {
        super(name, image);
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return getName() + " - " + getPrice();
    }
}
