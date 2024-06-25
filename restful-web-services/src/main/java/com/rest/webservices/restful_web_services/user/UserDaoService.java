package com.rest.webservices.restful_web_services.user;

import java.time.LocalDate;
// import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class UserDaoService {
    // JPA/Hibernate > Database
    // UserDaoService > Static List

    private static List<User> users = new java.util.ArrayList<>();

    private static int userId = 0;

    static {
        users.add(new User(++userId, "Ajay", LocalDate.now().minusYears(24)));
        users.add(new User(++userId, "Vishal", LocalDate.now().minusYears(30)));
        users.add(new User(++userId, "Rahul", LocalDate.now().minusYears(26)));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        user.setId(++userId);
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        Predicate<User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().get();
    }
}
