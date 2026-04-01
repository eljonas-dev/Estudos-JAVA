package spaceinvader; // Define o pacote do projeto

import javax.swing.*; // Importa componentes gráficos (JPanel, Timer, etc.)
import java.awt.*; // Importa classes de desenho (Graphics, Color, Dimension)
import java.awt.event.*; // Importa eventos (ActionListener, ActionEvent)

public class TelaJogo extends JPanel implements ActionListener { // Classe que é um painel e responde a eventos

    private int playerX = 375; // Posição horizontal inicial da nave (centro da tela)
    private Timer timer; // Timer que controla a atualização do jogo

    public TelaJogo() { // Construtor da classe

        this.setPreferredSize(new Dimension(800, 600)); // Define o tamanho do painel (largura x altura)
        this.setBackground(Color.BLACK); // Define a cor de fundo como preta
        this.setFocusable(true); // Permite que o painel receba eventos de teclado

        timer = new Timer(16, this); // Cria um timer que dispara a cada 16ms (~60 FPS)
        timer.start(); // Inicia o timer
    }

    public void paintComponent(Graphics g) { // Método responsável por desenhar na tela
        super.paintComponent(g); // Limpa a tela antes de redesenhar

        g.setColor(Color.GREEN); // Define a cor do desenho como verde
        g.fillRect(playerX, 550, 50, 30); // Desenha a nave como um retângulo
    }

    public void actionPerformed(ActionEvent e){ // Método chamado a cada "tick" do timer
        repaint(); // Solicita a atualização da tela (chama paintComponent)
    }
}