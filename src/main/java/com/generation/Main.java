package com.generation;

import com.generation.database.ModelDatabase;
import com.generation.model.Category;
import com.generation.model.Product;
import com.generation.model.Restaurant;
import com.generation.model.User;

import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner forTxt = new Scanner(System.in);
    static Scanner forNum = new Scanner(System.in);
    static User loggedUser = null;
    public static void main(String[] args) {

        while (true) {
            System.out.print("Username kiriting: ");
            String username = forTxt.next();
            System.out.print("Parol kiriting: ");
            String password = forTxt.next();
            User user = ModelDatabase.userExist(username, password);
            if(user == null) System.out.println("Bunday foydalanuvchi topilmadi");
            else loggedUser = user;
            while (loggedUser != null){
                System.out.println("1. Restoranlarni ko'rish");
                System.out.println("2. Exit");
                System.out.print("--->");
                int choice = forNum.nextInt();
                switch (choice) {
                    case 1 -> {
                        for (int i = 0; i < ModelDatabase.restaurants.size(); i++) {
                            System.out.println(i + 1 + " - " + ModelDatabase.restaurants.get(i));
                        }
                        System.out.print("----------->");
                        int restaurantChoice = forNum.nextInt();
                        List<Category> categories =
                                ModelDatabase.restaurants.get(restaurantChoice - 1).getCategories();
                        System.out.println("Kategoriyalardan birini tanlang -------");
                        for (int i = 0; i < categories.size(); i++) {
                            System.out.println(i + 1 + ". " + categories.get(i));
                        }
                        System.out.print("----------->");
                        int categoryChoice = forNum.nextInt();
                        List<Product> products =
                                categories.get(categoryChoice - 1).getProducts();
                        for (int i = 0; i < products.size(); i++) {
                            System.out.println(i + 1 + ". " + products.get(i));
                        }
                        System.out.print("----------->");
                        int productChoice = forNum.nextInt();
                    }
                    case 2 -> {
                        loggedUser = null;
                        System.out.println("Siz chiqib ketdiz!");
                    }
                }
            }
        }

    }
}