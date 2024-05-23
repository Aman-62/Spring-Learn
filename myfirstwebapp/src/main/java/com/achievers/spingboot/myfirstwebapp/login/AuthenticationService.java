package com.achievers.spingboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean Authenticate(String username, String password) {

        boolean isValidUsername = username.equalsIgnoreCase("testUser");
        boolean isValidPassword = password.equalsIgnoreCase("1234User");

        return isValidUsername && isValidPassword;
    }

}