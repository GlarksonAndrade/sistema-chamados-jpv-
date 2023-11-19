package BancoUsuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaUsuarios {

    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();
        String sql = """
                CREATE TABLE IF NOT EXISTS usuarios(
                id SERIAL PRIMARY KEY,
                Nome VARCHAR(50) NOT NULL,
                Email VARCHAR(100) NOT NULL,
                Login Varchar(50) NOT NULL,
                Senha Varchar(100) NOT NULL
                                
                                
                );
                                
                """;
        Statement stmt = conexao.createStatement();
        stmt.execute(sql);
        System.out.println("Tabela criada com sucesso!");
        conexao.close();
    }



}
