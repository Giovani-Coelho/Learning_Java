package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BuildConnect {
    public static Connection getConnection() {
        try {
            final String url = "jdbc:mysql://localhost:3306/javaDB";
            final String user = "root";
            final String password = "exbom123";

            return DriverManager.getConnection(url,user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
