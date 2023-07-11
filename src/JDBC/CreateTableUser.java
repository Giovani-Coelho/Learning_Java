package JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableUser {
    public static void main(String[] args) throws SQLException {
        Connection connection = BuildConnect.getConnection();

        String sql = "CREATE TABLE IF NOT EXISTS users (" +
                "codigo INT AUTO_INCREMENT PRIMARY KEY," +
                "name VARCHAR(80) NOT NULL" +
                ")";

        Statement stmt = connection.createStatement();
        stmt.execute(sql);

        System.out.println("Table created!");
        connection.close();
    }
}
