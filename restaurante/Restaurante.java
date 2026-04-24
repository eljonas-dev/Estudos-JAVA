/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.restaurante;
import java.util.*;
/**
 *
 * @author PICHAU
 */
public class Restaurante {

    public static void main(String[] args) {
        FilaPedidos fila = new FilaPedidos();
        
        //Criando os clientes
        Clientes c1 = new Clientes(1, "João", fila);
        Clientes c2 = new Clientes(2, "Maria", fila);
        Clientes c3 = new Clientes(3, "José", fila);
        Clientes c4 = new Clientes(4, "Ana", fila);
        Clientes c5 = new Clientes(5, "Pedro", fila);
        Clientes c6 = new Clientes(6, "Carla", fila);
        Clientes c7 = new Clientes(7, "Lucas", fila);
        Clientes c8 = new Clientes(8, "Beatriz", fila);
        Clientes c9 = new Clientes(9, "Tiago", fila);
        Clientes c10 = new Clientes(10, "Julia", fila);
        Clientes c11 = new Clientes(11, "Marcos", fila);
        Clientes c12 = new Clientes(12, "Fernanda", fila);
        Clientes c13 = new Clientes(13, "Ricardo", fila);
        Clientes c14 = new Clientes(14, "Patricia", fila);
        Clientes c15 = new Clientes(15, "Roberto", fila);
        
        //Criando os cozinheiros
        Cozinheiros coz1 = new Cozinheiros(1, "Chef Jacquin", fila);
        Cozinheiros coz2 = new Cozinheiros(2, "Chef Paola", fila);
        Cozinheiros coz3 = new Cozinheiros(3, "Chef Fogaça", fila);
        Cozinheiros coz4 = new Cozinheiros(4, "Chef Alex Atala", fila);
        Cozinheiros coz5 = new Cozinheiros(5, "Chef Helena Rizzo", fila);
        
        //Fazendo a parada rodar
        new Thread(c1).start();
        new Thread(c2).start();
        new Thread(c3).start();
        new Thread(c4).start();
        new Thread(c5).start();
        new Thread(c6).start();
        new Thread(c7).start();
        new Thread(c8).start();
        new Thread(c9).start();
        new Thread(c10).start();
        new Thread(c11).start();
        new Thread(c12).start();
        new Thread(c13).start();
        new Thread(c14).start();
        new Thread(c15).start();
        
        new Thread(coz1).start();
        new Thread(coz2).start();
        new Thread(coz3).start();
        new Thread(coz4).start();
        new Thread(coz5).start();
    }
}
