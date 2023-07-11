package JDBC;

import java.sql.*;
import java.util.Scanner;

public class ConsultaWhere {
    public static void main(String[] args) throws SQLException {
        Connection connection = BuildConnect.getConnection();
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        String name = input.nextLine();

        String sql = "SELECT * FROM users WHERE name like ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, "%" + name + "%");
        ResultSet result = stmt.executeQuery();

        while(result.next()) {
            int id = result.getInt("codigo");
            String nome = result.getString("name");
            System.out.println(id + " " + nome);
        }

        stmt.close();
        connection.close();
    }
}
