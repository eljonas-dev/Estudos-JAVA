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
public class FilaPedidos {
    private LinkedList fila = new LinkedList();
    
    public synchronized void adicionar(Object p)  {
        fila.addLast(p);
        notifyAll(); //Avisa todas as threads que um pedido foi adicionado
    }
    public synchronized Object retirar() {
        while (fila.isEmpty()) { //Verifica se a fila está vazia ou se há algum pedido
            try { wait(); } catch (InterruptedException e) {} //Dorme até ser notificado
        }
        return fila.removeFirst(); //Remove o primeiro da fila.
    }
    /*
    O synchronized serve pra impedir que duas ou mais threads acabem alterando a lista ao mesmo tempo, o que impede de
    dar um bug. Ele permite que uma thread termine a sua ação antes da próxima interagir com a lista.
    */
}
