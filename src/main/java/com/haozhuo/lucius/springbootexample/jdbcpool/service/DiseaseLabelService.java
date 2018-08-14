package com.haozhuo.lucius.springbootexample.jdbcpool.service;

import com.haozhuo.lucius.springbootexample.jdbcpool.model.DiseaseLabel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Lucius on 8/13/18.
 */
@Component
public class DiseaseLabelService {
    @Autowired
    @Qualifier("dataetlJdbc") //选择jdbc连接池
    JdbcTemplate jdbcTemplate;

    public List<DiseaseLabel> getAllDiseaseLabels() {
        return jdbcTemplate.query("select * from disease_label limit 10;", new DiseaseLabelExtractor());
    }
}
