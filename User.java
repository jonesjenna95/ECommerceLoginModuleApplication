package com.gcu.ecommerce.login.model;

public class User {

    // This field stores the username of the user.
    private String username;

    // This field stores the password of the user.
    private String password;

    // Constructor to create a new User instance with the provided username and password.
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter method to retrieve the username of the user.
    public String getUsername() {
        return username;
    }

    // Setter method to set the username of the user.
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter method to retrieve the password of the user.
    public String getPassword() {
        return password;
    }

    // Setter method to set the password of the user.
    public void setPassword(String password) {
        this.password = password;
    }
}

