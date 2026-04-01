/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvader;
import javax.swing.JFrame;
/**
 *
 * @author aluno
 */
public class Jogo extends JFrame {
    /*
    Abaixo foi declarado um método construtor. Ele define o comportamente de um objeto no momento exato em que é instanciado.
    pra definirmos um método construtor, ele deve ter o mesmo nome da classe (inclusive com maiúsculas), porém sem nenhum tipo de 
    retorno (nem mesmo void).
    */
    public Jogo() {
        this.add(new TelaJogo()); //adiciona o painel onde o jogo roda
        this.setTitle("Space Invader");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); //Ajusta a janela ao tamanho do painel
        this.setVisible(true);
        this.setLocationRelativeTo(null); //Centraliza na tela
    }
}
