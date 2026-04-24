/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurante;
import java.util.*;
/**
 *
 * @author PICHAU
 */
public class Cozinheiros implements Runnable { //Pegamos o método run emprestado da interface Runnable
    int id;
    String nomeCozinheiro;
    private FilaPedidos fila;
    private Logger log;
    
    //Método construtor
    public Cozinheiros(int id, String nome, FilaPedidos filaexterna, Logger log) {
        this.id = id;
        this.nomeCozinheiro = nome;
        this.fila = filaexterna;
        this.log = log;
    }
    
    @Override
    public void run() { 
        while (true) {
            Pedidos p = (Pedidos)this.fila.retirar(); //fiz o cast do objeto pra classe Pedidos e guardei numa variável p
            //ATENÇÃO: é só mudar o método escrever pra mágica acontecer!
            log.escreverSemTrava(nomeCozinheiro + " está preparando o pedido " + p.getId());
            p.setStatus("preparando");
            try {
            Thread.sleep((long) (Math.random() * 4000) + 1000 );
            //ATENÇÃO: é só mudar o método escrever pra mágica acontecer!
            log.escreverSemTrava(nomeCozinheiro + " finalizou o pedido " + p.getId());
            p.setStatus("pronto!");
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        /*
        Chama fila.retirar()
        sleep pra simular o tempo de preparo
        */
    }
}
