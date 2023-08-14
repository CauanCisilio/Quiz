package jogo;

import Conexao.CadastraResultado;
import Conexao.Conexao;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String [] args){       
       Conexao conexao = new Conexao();
       CadastraResultado cadastrar = new CadastraResultado();       
       Jogador jogo = new Jogador();
       //nick do jogador
       String nome = JOptionPane.showInputDialog("Escreva aqui seu nick");
       jogo.pontucao(nome);
       //aqui definimos essa variavel para pegar os pontos que o jogador fez durante o quiz
       int pontos = jogo.getPontos();
       
       
       // passando valores para as variáveis
       conexao.setNome(nome);
       conexao.setPontos(pontos);
       
       cadastrar.Cadastra(conexao);
       
    }
}
