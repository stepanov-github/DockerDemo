package ru.home.dockerdemo.repository;

import org.springframework.stereotype.Repository;
import ru.home.dockerdemo.service.Authorities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> list = new ArrayList<>();
        if (user.equals("admin") && password.equals("admin")) {
            Collections.addAll(list, Authorities.READ, Authorities.WRITE);
        } else if (user.equals("user") && password.equals("user")) {
            Collections.addAll(list, Authorities.READ);
        }
        return list;
    }
}
