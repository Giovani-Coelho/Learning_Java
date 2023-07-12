package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteUser {
  public static void main(String[] args) throws SQLException {
    Scanner input = new Scanner(System.in);
    Connection connection = BuildConnect.getConnection();

    System.out.print("Digite o codigo do usuario: ");
    int cod = input.nextInt();

    String sql = "DELETE FROM users WHERE codigo = ?";
    PreparedStatement stmt = connection.prepareStatement(sql);
    stmt.setInt(1, cod);

    // retorna a quantidade de linhas afetadas.
    if(stmt.executeUpdate() > 0) {
      System.out.println("Deleted User!");
    } else {
      System.out.println("User not found.");
    }

    connection.close();
    input.close();
  }
}
