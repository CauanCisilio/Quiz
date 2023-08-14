package Conexao;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import jogo.Main;

public class CadastraResultado extends Conexao {
    Conexao conexao = new Conexao();
    Connection conn = conexao.conectaBD();
    public void Cadastra(Conexao conexao){
        String SQL = "INSERT INTO jogos (nome,  pontos) VALUES (?, ?)"; 
        try {
            PreparedStatement pstm = conn.prepareStatement(SQL);
            pstm.setString(1,conexao.getNome());           
            pstm.setInt(2, conexao.getPontos());
             
            pstm.executeUpdate();
            
            pstm.close();
            conn.close();
            
        } catch (SQLException e) {   
            e.printStackTrace();
        }
        
    }
}
