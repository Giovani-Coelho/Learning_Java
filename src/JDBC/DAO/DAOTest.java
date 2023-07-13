package JDBC.DAO;

public class DAOTest {
  public static void main(String[] args) {
    DAO dao = new DAO();

    String sql = "INSERT INTO users (name) VALUES (?)";
    dao.include(sql, "Ze Pequeno");
    dao.include(sql, "Muricoca");

    dao.closeConnection();
  }
}
