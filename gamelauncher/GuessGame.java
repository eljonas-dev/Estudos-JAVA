/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamelauncher;

/**
 *
 * @author franr
 */
public class GuessGame {
    //criamos três variáveis de instância que vão receber três objetos da classe Player
    Player p1;
    Player p2;
    Player p3;
    
    public void startGame() {
        //aqui instanciamos 3 objetos da classe Player, usando as variáveis que criamos antes
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        
        //declaramos três variáveis para armazenar os palpites de cada jogador ao adivinhar o número
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;
        
        //Aqui ele armazena um valor verdadeiro ou falso de acordo com a resposta do jogador, pra saber se acertou ou não
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        
        //Usamos um método que gera números randômicamente e colocamos dentro de uma variável targetNumber
        int targetNumber = (int) (Math.random()*10);
        System.out.println("Estou pensando num número entre 0 e 9...");
        
        //While com uma condição perfeita pra ele rodar infinitamente
        while (true) {
            System.out.println("O número a adivinhar é " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();
            //chamou o método da classe Player pra rodar um número aleatório dentro de number
            
            //Pegou os resultados de number dentro da classe Player e colocou dentro das variáveis guess
            //Basicamente tiramos a bolinha de um copo pra colocar em outro. Nenhum valor foi alterado, só mudamos o local onde tá guardado;
            guessp1 = p1.number;
            System.out.println("O jogador 1 forneceu o palpite " + guessp1);
            guessp2 = p2.number;
            System.out.println("O jogador 2 forneceu o palpite " + guessp2);
            guessp3 = p3.number;
            System.out.println("O jogador 3 forneceu o palpite " + guessp3);
            
            //Com esses valores que acabamos de guardar nas variáveis guess, vamos testar isso numa condição pra definir se tá certo ou errado e como reagir
            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }
            //Vai imprimir os resultados booleanos e mostrar quem ta certo ou errado
            //se alguém acertar, ele quebra o loop com o break e o jogo acaba
            if (p1isRight || p2isRight || p3isRight){
                System.out.println("Temos um vencedor!");
                System.out.println("O jogador 1 acertou? " + p1isRight);
                System.out.println("O jogador 2 acertou? " + p2isRight);
                System.out.println("O jogador 3 acertou? " + p3isRight);
                System.out.println("Fim do jogo!");
                break;
            }
            else { //Se ninguém acertar, ele não faz nada, e continua dentro do while;
                System.out.println("Ninguém acertou... Portanto vamos continuar o jogo!");
            }
        }
        
        
    }
}

