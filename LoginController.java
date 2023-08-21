package com.gcu.ecommerce.login.controller;

import com.gcu.ecommerce.login.model.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    // This method handles GET requests to "/login" and prepares the login form.
    @GetMapping("/login")
    public String showLoginForm(Model model) {
        // Create a new instance of the LoginForm and add it to the model for the view.
        model.addAttribute("loginForm", new LoginForm());
        // Return the name of the Thymeleaf template (HTML file) to render the login form.
        return "login";
    }

    // This method handles POST requests to "/login" and processes the login form submission.
    @PostMapping("/login")
    public String processLogin(@ModelAttribute LoginForm loginForm) {
        // Implement the logic to process the login form data here.
        // For demonstration purposes, we're printing the username and password.
        System.out.println("Username: " + loginForm.getUsername());
        System.out.println("Password: " + loginForm.getPassword());
        // After processing, redirect the user to the home page ("/").
        return "redirect:/";
    }
}


