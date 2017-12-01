package bancopoo;

import java.sql.*;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String args[]){
        
        Connection conexao = null; 
        String url = "jdbc:mysql://localhost/aula"; //caminho para acesso ao MySQL e o database aula
        String usuario = "root"; //usu�rio de acesso ao mysql
        String senha = ""; 
        
	// realizando a conexao com o banco de dados
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexao com o banco de dados realizada com sucesso");            
        } catch (SQLException e) {
            System.out.println("Erro na conexao com o banco: "+e);
        }        
    
	//quando a conexao for realizada, � poss�vel executar os comandos SQL
	//abaixo segue o c�digo para a inser��o na tabela chamada 'usuario'

        do {
            PreparedStatement stmt = null; //� usado para criar um objeto que representa a instru��o SQL que ser� executada
            String login = JOptionPane.showInputDialog("Digite o login: ");
            if(login.equals("0"))
                break;
            String password = JOptionPane.showInputDialog("Digite a senha: ");

            String insercao = "insert into usuarios (login, senha) values (?,?)";

            try{
                stmt = conexao.prepareStatement(insercao);
                stmt.setString(1, login);
                stmt.setString(2, password);
                stmt.execute();            
                stmt.close();

            }catch(SQLException e){
                System.out.println("Erro na insercao dos dados: "+e);
            }
        }while (true);
        
        String consulta = "SELECT * FROM usuarios";
        try {
            PreparedStatement stmt = null;
            stmt = conexao.prepareStatement(consulta);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                System.out.println(rs.getString("login"));
            }
        }
        catch (SQLException sql) {
            System.out.println("ERRO NA PESQUISA");
        }
        
        
        
        do {
            PreparedStatement stmt = null; //� usado para criar um objeto que representa a instru��o SQL que ser� executada
            String login = JOptionPane.showInputDialog("Digite o login para deletar um usuário: ");
            if(login.equals("0"))
                break;

            String deletar = "delete from usuarios where login ='" + login + "'";

            try{
                stmt = conexao.prepareStatement(deletar);
                stmt.execute();            
                stmt.close();
 
            }catch(SQLException e){
                System.out.println("Erro na insercao dos dados: "+e);
            }
        }while (true);
        
        do {
            PreparedStatement stmt = null; //� usado para criar um objeto que representa a instru��o SQL que ser� executada
            String login = JOptionPane.showInputDialog("Digite o login para atualizar a senha: ");
            if(login.equals("0"))
                break;
            String update = "update usuarios set senha=? where login ='" + login + "'";
            String novaSenha = JOptionPane.showInputDialog("Digite a nova senha");
            try{
                stmt = conexao.prepareStatement(update);
                stmt.setString(1, novaSenha);
                stmt.execute();            
                stmt.close();
 
            }catch(SQLException e){
                System.out.println("Erro na atualização dos dados: "+e);
            }
        }while (true);
        System.out.println("__________________________________");
        consulta = "SELECT * FROM usuarios";
        try {
            PreparedStatement stmt = null;
            stmt = conexao.prepareStatement(consulta);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                System.out.println(rs.getString("login") + " " + senha);
            }
        }
        catch (SQLException sql) {
            System.out.println("ERRO NA PESQUISA");
        }
    }
}