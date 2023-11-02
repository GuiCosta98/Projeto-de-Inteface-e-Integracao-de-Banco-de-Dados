package br.com.activex.conexao;

import java.sql.Connection; // responsável pela conexao
import java.sql.DriverManager; // responsavel pelo gerenciamento do driver
import java.sql.SQLException; // responsavel gerar os erros relacionados a conexao 

public class Conexao {

    private String statusConexao = "Não conectado!";

    public Connection getConexao() {

        Connection conexao = null;

        try {

            String nomeDriver = "com.mysql.cj.jdbc.Driver";
            Class.forName(nomeDriver);

            String servidor = "localhost";
            String schema = "db_carros";

            String url = "jdbc:mysql://" + servidor + "/" + schema;

            String usuario = "root";
            String senha = "";

            conexao = (Connection) DriverManager.getConnection(url, usuario, senha);

            if (conexao != null) {

                statusConexao = "Conectado!";

            } else {

                statusConexao = "Não conectado";

            }

            return conexao;

        } catch (ClassNotFoundException e) {

            System.out.println("Driver de conexão não encontrado!");
            return null;

        } catch (SQLException e) {

            System.out.println("Falha na conexão!");
            System.out.println(e.getMessage());
            return null;

        }

    }

    public String getStatusConexao() {

        return statusConexao;

    }

    public boolean fechaConexao() {

        try {

            getConexao().close();
            statusConexao = "Conexão Fechada";
            return true;

        } catch (SQLException e) {

            System.out.println(e.getMessage());
            return false;

        }

    }
    
    public Connection reiniciaConexao() {
        
        fechaConexao();
        return getConexao();
        
    }
    
    

}
