package com.gcu.ecommerce.login.service;

import com.gcu.ecommerce.login.model.User;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class AuthService {

    // This map stores valid user information for authentication.
    private static final Map<String, User> validUsers = new HashMap<>();

    // Static initialization block to add a test user to the validUsers map.
    static {
        // Add the test user with username "testuser" and password "testpassword"
        validUsers.put("testuser", new User("testuser", "testpassword"));
    }

    // This method authenticates a user by checking their username and password.
    public boolean authenticateUser(String username, String password) {
        // Retrieve the User instance associated with the provided username.
        User user = validUsers.get(username);

        // Check if the user exists and the provided password matches the stored password.
        if (user != null) {
            // Print the entered and stored passwords for debugging purposes.
            System.out.println("Entered password: " + password);
            System.out.println("Stored password: " + user.getPassword());

            // Return true if the passwords match, indicating successful authentication.
            return user.getPassword().equals(password);
        }

        // Return false if the user does not exist or the passwords do not match.
        return false;
    }
}

