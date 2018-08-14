package com.haozhuo.lucius.springbootexample.jdbcpool.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Lucius on 8/13/18.
 *
 CREATE TABLE `disease_label` (
 `id` INT(11) NOT NULL AUTO_INCREMENT,
 `label` VARCHAR(50) NOT NULL,
 `keyword` VARCHAR(50) NOT NULL,
 PRIMARY KEY (`id`),
 UNIQUE INDEX `Index 2` (`label`)
 )
 COLLATE='utf8_general_ci'
 ENGINE=InnoDB
 AUTO_INCREMENT=885;
 *
 */

@Getter
@Setter
public class DiseaseLabel {
    private Long id;
    private String label;
    private String keyword;
}
