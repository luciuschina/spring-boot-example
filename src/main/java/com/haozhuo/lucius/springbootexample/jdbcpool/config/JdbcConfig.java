package com.haozhuo.lucius.springbootexample.jdbcpool.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by Lucius on 8/13/18.
 * 使用了HikariCP连接池
 */
@Configuration
public class JdbcConfig {

    @Bean(name = "reportnormJdbc")
    @Primary
    public JdbcTemplate reportnormJdbcTemplate() {
        return new JdbcTemplate(reportnormDataSource());
    }

    @Bean
    @Primary
    @ConfigurationProperties("datasource.reportnorm")
    public DataSourceProperties reportnormDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @Primary
    @ConfigurationProperties("datasource.reportnorm")
    public DataSource reportnormDataSource() {
        return reportnormDataSourceProperties().initializeDataSourceBuilder().build();
    }

    @Bean(name = "dataetlJdbc")
    public JdbcTemplate dataetlJdbcTemplate() {
        return new JdbcTemplate(dataetlDataSource());
    }

    @Bean
    @ConfigurationProperties("datasource.dataetl")
    public DataSourceProperties dataetlDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @ConfigurationProperties("datasource.dataetl")
    public DataSource dataetlDataSource() {
        return dataetlDataSourceProperties().initializeDataSourceBuilder().build();
    }


//    /**
//     * commons dbcp2 连接池
//     * @return
//     */
//    @Bean
//    @ConfigurationProperties("datasource.dataetl")
//    public BasicDataSource dataetlDataSource() {
//        return DataSourceBuilder.create().type(BasicDataSource.class).build();
//    }
}
