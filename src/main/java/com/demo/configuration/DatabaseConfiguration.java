package com.demo.configuration;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfiguration {

    @Bean
    public HikariDataSource datasource() {

        final HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName(org.hsqldb.jdbcDriver.class.getName());
        dataSource.setJdbcUrl("jdbc:hsqldb:mem:mydb");

        dataSource.setMaximumPoolSize(50);
        dataSource.setIdleTimeout(60000);
        dataSource.setAutoCommit(false);
        dataSource.addDataSourceProperty("user", "test");
        dataSource.addDataSourceProperty("password", "test");
        dataSource.addDataSourceProperty("cachePrepStmts", true);
        dataSource.addDataSourceProperty("prepStmtCacheSize", 50);
        dataSource.addDataSourceProperty("prepStmtCacheSqlLimit", 512);
        dataSource.addDataSourceProperty("useServerPrepStmts", true);

        return dataSource;
    }
}
