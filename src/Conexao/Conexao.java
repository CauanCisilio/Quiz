package Conexao;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.Date;
import javax.swing.JOptionPane;

public class Conexao {
    private String nome;
 
    private int pontos;
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getPontos(){
        return (int) this.pontos; 
    }
    public void setPontos(int pontos){
        this.pontos=pontos;
    }
    
    Connection conn;
    
    public Connection conectaBD(){
        String url = "jdbc:postgresql://localhost:5432/partidas";
        String user = "postgres";
        String password = "postgres";
        try {           
            Class.forName("org.postgresql.Driver");//localiza o driver
            conn = DriverManager.getConnection(url,user,password);
            //JOptionPane.showMessageDialog(null,"Conectado com sucesso");
        }
        
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao se conectar ao banco de dados");
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) { //caso não encontrar a JDBC é feita o tratament
            JOptionPane.showMessageDialog(null, "Driver não encontrado");
            e.printStackTrace();
        }
        return conn;
    }
    
}
