package com.generation.database;

import com.generation.enums.Role;
import com.generation.model.*;

import java.util.ArrayList;
import java.util.List;

public class ModelDatabase {

    public static List<Product> products = new ArrayList<>();
    public static List<Category> categories = new ArrayList<>();
    public static List<Restaurant> restaurants = new ArrayList<>();
    public static List<Order> orders = new ArrayList<>();
    public static List<User> users = new ArrayList<>();

    public static User userExist(String username, String parol){
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(parol)) {
                return user;
            }
        }

        return null;
    }

    static {
        users.addAll(
                List.of(new User("anvaribragimov", "anvar123",
                                new Basket(List.of()), Role.ADMIN),
                        new User("abduqosim", "abduqosim123",
                                new Basket(List.of()), Role.USER),
                        new User("abdushukur", "abdushukur123",
                                new Basket(List.of()), Role.COURIER))
        );

        List<Product> chickenProds = List.of(
                new Product("Basket Chicken", "image.png", 129000),
                new Product("KFC Some meal", "image.png", 100000),
                new Product("ST77 Big Box", "image.png", 30000),
                new Product("WOK Some meal", "image.png", 120000),
                new Product("Basket Chicken 99", "image.png", 99000)
        );
        List<Product> someProds = List.of(
                new Product("Basket", "image.png", 129000),
                new Product("KFC Some meal", "image.png", 100000),
                new Product("ST77 Big Box meal", "image.png", 30000),
                new Product("WOK Some meal", "image.png", 120000),
                new Product("Basket Chicken 99 meal", "image.png", 99000)
        );

        products.addAll(chickenProds);
        products.addAll(someProds);
        categories.addAll(
                List.of(
                        new Category("Tovuqli mahsulotlar", "image.jpg", chickenProds),
                        new Category("Mol go'shtli mahsulotlar", "image.jpg", someProds)
                )
        );

        restaurants.addAll(
                List.of(
                        new Restaurant("Street 77 & Wok", "image.pneg", categories),
                        new Restaurant("KFC", "image.pneg", categories)
                )
        );

    }
}
