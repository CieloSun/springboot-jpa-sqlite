package com.cielo.sqlite.demo.service;

import com.cielo.sqlite.demo.entity.User;
import com.cielo.sqlite.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SQLiteService {
    @Autowired
    private UserRepository userRepository;

    public User testJPA() {
        userRepository.save(new User(0, "CieloSun", 24));
        return userRepository.getOne(0);
    }
}
