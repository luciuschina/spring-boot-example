package com.haozhuo.lucius.springbootexample.jdbcpool.service;

import com.haozhuo.lucius.springbootexample.jdbcpool.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Lucius on 8/13/18.
 * Create UserExtractor class for parsing result set to User model using RowMapper interface as below
 */
public class UserExtractor implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int i) throws SQLException {
        User user = new User();
        user.setId(rs.getLong("user_id"));
        user.setIdcard(rs.getString("idcard"));
        user.setUsername(rs.getString("username"));
        return user;
    }
}
