package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateUser {
  public static void main(String[] args) throws SQLException {
    Scanner input = new Scanner(System.in);
    Connection connection = BuildConnect.getConnection();

    System.out.print("Digite o codigo do usuario: ");
    int cod = input.nextInt();

    String sqlSelect = "SELECT codigo, name FROM users WHERE codigo = ?";
    PreparedStatement stmt = connection.prepareStatement(sqlSelect);
    stmt.setInt(1, cod);
    ResultSet result = stmt.executeQuery();

    if(result.next()) {
      System.out.print("Digite o novo nome: ");
      String name = input.next();

      String sqlUpdate = "UPDATE users SET name = ? WHERE codigo = ?";
      stmt.close();
      stmt = connection.prepareStatement(sqlUpdate);
      stmt.setString(1, name);
      stmt.setInt(2, cod);

      stmt.executeUpdate();
    } else {
      System.out.println("User not found!");
    }
  }
}
