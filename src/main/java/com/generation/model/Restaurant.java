package com.generation.model;

import java.util.List;

public class Restaurant extends NameImageExtender{
    private List<Category> categories;

    public Restaurant(String name, String image, List<Category> categories) {
        super(name, image);
        this.categories = categories;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return getName();
    }
}
