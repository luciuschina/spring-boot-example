package com.haozhuo.lucius.springbootexample.jdbcpool.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Lucius on 8/13/18.
 *
 CREATE TABLE `user` (
 `user_id` INT(11) NOT NULL AUTO_INCREMENT,
 `username` VARCHAR(50) NULL DEFAULT NULL,
 `idcard` VARCHAR(100) NULL DEFAULT NULL,
 PRIMARY KEY (`user_id`),
 UNIQUE INDEX `Index 2` (`idcard`)
 )
 COLLATE='utf8_general_ci'
 ENGINE=InnoDB
 AUTO_INCREMENT=5;
 *
 */

@Getter
@Setter
public class User {
    private Long id;
    private String username;
    private String idcard;
}
