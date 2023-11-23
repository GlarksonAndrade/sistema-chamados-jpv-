package sistemachamados.usuariosDB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriadorTabelaUsuarios {

    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();
        String sql = """
                CREATE TABLE IF NOT EXISTS usuarios(
                id SERIAL PRIMARY KEY,
                Nome VARCHAR(50) NOT NULL,
                Email VARCHAR(100) UNIQUE NOT NULL,
                Salt VARCHAR(50) NOT NULL,
                Hash Varchar(60) NOT NULL,
                isAdmin BOOLEAN NOT NULL
                                
                );
                                
                """;
        Statement stmt = conexao.createStatement();
        stmt.execute(sql);
        System.out.println("Tabela de usuários criada com sucesso!");
        conexao.close();
    }



}
