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
public class Clientes implements Runnable{ //Pegamos o método run emprestado da interface Runnable
    int id;
    String nomeCliente;
    private FilaPedidos fila; //Preciso de um método construtor pra ele saber que essa fila é a mesma que tá na outra classe
    
    //Método construtor
    public Clientes(int id, String nome, FilaPedidos filaexterna) {
        this.id = id;
        this.nomeCliente = nome;
        this.fila = filaexterna; //guarda a referência da fila principal
    }
    
    @Override
    public void run() { //Loop de vida do cliente
        for (int i = 0; i < 3; i ++) { //cada cliente faz 5 pedidos
            try {
            Thread.sleep((long)(Math.random() * 4000) + 1000); //Vai aguardar um tempo aleatório entre 1 e 5 segundos
            Pedidos p = new Pedidos();
            fila.adicionar(p);
            System.out.println(this.nomeCliente + " fez um pedido!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            /*Sleep pra simular o tempo que leva pra chegar no restaurante
            Criar um novo objeto Pedidos
            Chama o método adicionar da fila. 
            */   
        }
    }
}
