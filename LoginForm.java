package com.gcu.ecommerce.login.model;

import javax.validation.constraints.NotBlank;

public class LoginForm {

    // This field is used to store the username entered in the login form.
    @NotBlank(message = "Username is required")
    private String username;

    // This field is used to store the password entered in the login form.
    @NotBlank(message = "Password is required")
    private String password;

    // Getter method for retrieving the username.
    public String getUsername() {
        return username;
    }

    // Setter method for setting the username.
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter method for retrieving the password.
    public String getPassword() {
        return password;
    }

    // Setter method for setting the password.
    public void setPassword(String password) {
        this.password = password;
    }
}

