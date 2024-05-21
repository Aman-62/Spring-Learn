package com.achievers.spingboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    // * MVC -> Model, View, Controller

    // localhost:8080/say-hello
    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello, World!";
    }

    // localhost:8080/say-hello-html
    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {

        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>My First HTML Page</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My First Web Application with Spring boot");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }

    // "src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp"
    // "src/main/resources/META-INF/resources/WEB-INF/jsp/welcome.jsp"
    // "src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp"
    // "src/main/resources/META-INF/resources/WEB-INF/jsp/todo.jsp"
    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }
}
