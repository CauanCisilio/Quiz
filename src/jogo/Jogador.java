package jogo;

import Conexao.Conexao;
import javax.swing.JOptionPane;

/*
    aplicação criada com o intuito de simular um Quiz com 10 perguntas no total

    Nessa classe temos um metodo do tipo inteiro *pontuação* que é resposável por 
*/
public class Jogador extends Conexao{  
    private int pontos;
    private String nome;
    public int getPontos() {
        return this.pontos;
    }

    
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(){
        this.nome = nome;
    }
    
     public int pontucao( String nome){
        
        char primeiraPergunta = JOptionPane.showInputDialog("1 - Qual é a capital da França?\n" +
            
            "\nA - Londres"+
            "\nB - Berlim"+
            "\nC - Paris"+
            "\nD - Roma").charAt(0);      
            if(primeiraPergunta == 'A'|| primeiraPergunta == 'a'){
                JOptionPane.showMessageDialog(null, "Resposta correta");
                setPontos(getPontos() + 1);
            }
                
          
        char segundaPergunta = JOptionPane.showInputDialog("2 - Qual é a capital do Brasil?"+          
                "\nA - São Paulo"+
                "\nB - Brasília"+
                "\nC - Rio de Janeiro"+
                "\nD - Belo Horizonte").charAt(0);
                
        if(segundaPergunta== 'B'|| segundaPergunta == 'b'){
                JOptionPane.showMessageDialog(null, "Resposta correta");
                setPontos(getPontos() + 1);
            }
        
         char terceiraPergunta = JOptionPane.showInputDialog("3 - Qual é a capital do Japão?"+          
                 "\nA - Tóquio"+
                "\nB - Quioto"+
                "\nC - Osaka"+
                "\nD - Pequim").charAt(0);
        
        if(terceiraPergunta== 'A'|| terceiraPergunta == 'a'){
                JOptionPane.showMessageDialog(null, "Resposta correta");
                setPontos(getPontos() + 1);
            }
        char quartaPergunta = JOptionPane.showInputDialog( "4 - Qual é a capital da Rússia?"+      
                "\nA - São Petersburgo"+
                "\nB - Moscou"+
                "\nC - Kiev"+
                "\nD - Varsóvia").charAt(0);        
        if(quartaPergunta== 'B'|| quartaPergunta == 'b'){
                JOptionPane.showMessageDialog(null, "Resposta correta");
                setPontos(getPontos() + 1);
            }
        char quintaPergunta = JOptionPane.showInputDialog( "5 - Qual é a capital da Ucrania?"+      
                "\nA - Kiev"+
                "\nB - Helsinque"+
                "\nC - Georgia"+
                "\nD - Varsóvia").charAt(0);   
        if(quintaPergunta== 'A'|| quintaPergunta == 'a'){
                JOptionPane.showMessageDialog(null, "Resposta correta");
                setPontos(getPontos() + 1);
        }
        JOptionPane.showMessageDialog(null,nome+" sua pontuação foi de "+getPontos()+" pontos");
        return this.getPontos();
     }   
    
}
