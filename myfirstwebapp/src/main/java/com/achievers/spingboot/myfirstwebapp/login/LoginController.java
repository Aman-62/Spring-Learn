package com.achievers.spingboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    // http://localhost:8080/login

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String goToLogin() {
        // model.put("name", name);
        // System.out.println("Name: " + name);
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String goToWelcomePage() {
        return "welcome";
    }
}
