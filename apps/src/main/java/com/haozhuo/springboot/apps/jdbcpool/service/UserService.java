package com.haozhuo.springboot.apps.jdbcpool.service;

import com.haozhuo.springboot.apps.jdbcpool.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Lucius on 8/13/18.
 */
@Component
public class UserService {
    //reportnormJdbc是Primary的，默认使用reportnormJdbc
    //@Qualifier("reportnormJdbc")
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<User> getAllUsers() {
        return jdbcTemplate.query("select * from user", new UserExtractor());
    }
}
