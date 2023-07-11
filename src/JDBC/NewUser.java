package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NewUser {
    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o nome: ");
        String name = input.nextLine();

        Connection connection = BuildConnect.getConnection();

        String sql = "INSERT INTO users (name) VALUES (?)";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, name);

        stmt.execute();

        System.out.println(name);

        input.close();
    }
}
