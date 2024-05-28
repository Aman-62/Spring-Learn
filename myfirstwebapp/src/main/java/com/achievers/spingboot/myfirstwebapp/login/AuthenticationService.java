package com.achievers.spingboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean Authenticate(String username, String password) {

        boolean isValidUsername = username.equalsIgnoreCase("rahul");
        boolean isValidPassword = password.equalsIgnoreCase("user1234");

        return isValidUsername && isValidPassword;
    }

}