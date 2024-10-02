package com.generation.model;

import com.generation.enums.Role;

public class User {
    private String username;
    private String password;
    private Basket basket;
    private Role role;

    public User(String username, String password, Basket basket, Role role) {
        this.username = username;
        this.password = password;
        this.basket = basket;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
