package com.cielo.sqlite.demo.controller;

import com.cielo.sqlite.demo.entity.User;
import com.cielo.sqlite.demo.service.SQLiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
public class TestController {
    @Autowired
    private SQLiteService sqLiteService;

    @GetMapping("test")
    public String test() throws SQLException {
        return sqLiteService.test();
    }

    @GetMapping("jpa")
    public User testJPA(){
        return sqLiteService.testJPA();
    }
}
