package com.haozhuo.lucius.springbootexample.jdbcpool.web;


import com.haozhuo.lucius.springbootexample.jdbcpool.model.DiseaseLabel;
import com.haozhuo.lucius.springbootexample.jdbcpool.model.User;
import com.haozhuo.lucius.springbootexample.jdbcpool.service.DiseaseLabelService;
import com.haozhuo.lucius.springbootexample.jdbcpool.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Lucius on 8/13/18.
 */
@RequestMapping(value = "/jdbcpool")
@RestController
public class JdbcPoolController {
    @Autowired
    UserService userService;
    @Autowired
    DiseaseLabelService diseaseLabelService;

    @GetMapping("/user/list")
    public List<User> listUser() {
        return userService.getAllUsers();
    }

    @GetMapping("/disease/list")
    public List<DiseaseLabel> listDisease() {
        return diseaseLabelService.getAllDiseaseLabels();
    }

}
