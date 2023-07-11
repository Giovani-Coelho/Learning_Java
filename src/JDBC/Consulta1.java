package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Consulta1 {
    public static void main(String[] args) throws SQLException {
        Connection conexao = BuildConnect.getConnection();

        String sql = "SELECT * FROM users";
        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);

        List<Pessoa> pessoas = new ArrayList<>();

        while(resultado.next()) {
            int cod = resultado.getInt("codigo");
            String nome = resultado.getString("name");
            pessoas.add(new Pessoa(cod, nome));
        }

        for(Pessoa p : pessoas) {
            System.out.println(p.getCod() + " ==> " + p.getName());
        }

        stmt.close();
        conexao.close();
    }
}
