package fr.orsys.kanban.dao;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class HikariCPDataSource {

    private static final HikariConfig HIKARI_CONFIG;
    private static final HikariDataSource DATA_SOURCE;

    static {
        HIKARI_CONFIG = new HikariConfig("/application.properties");
        DATA_SOURCE = new HikariDataSource(HIKARI_CONFIG);
    }

    private HikariCPDataSource() {}

    public static Connection getConnection() throws SQLException {
        return DATA_SOURCE.getConnection();
    }

}
