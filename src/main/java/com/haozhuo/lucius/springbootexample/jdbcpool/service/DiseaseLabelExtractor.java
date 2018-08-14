package com.haozhuo.lucius.springbootexample.jdbcpool.service;

import com.haozhuo.lucius.springbootexample.jdbcpool.model.DiseaseLabel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Lucius on 8/13/18.
 */
public class DiseaseLabelExtractor implements RowMapper<DiseaseLabel> {
    @Override
    public DiseaseLabel mapRow(ResultSet rs, int i) throws SQLException {
        DiseaseLabel diseaseLabel = new DiseaseLabel();
        diseaseLabel.setId(rs.getLong("id"));
        diseaseLabel.setKeyword(rs.getString("keyword"));
        diseaseLabel.setLabel(rs.getString("label"));
        return diseaseLabel;
    }
}
