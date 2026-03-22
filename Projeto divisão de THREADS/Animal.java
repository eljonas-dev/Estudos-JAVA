/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poli;
import java.util.*;

public class Animal {
    int energia = 100;
    String nome;
    
    void iniciarfome() {
        new Thread(()->{
            Random rf = new Random();
            while (energia > 0) {
                try{
                    int tempo = rf.nextInt(4001) + 2000;
                    Thread.sleep(tempo);
                    energia = energia - 10;
                    if (energia < 50){
                        comer();
                    }
                }catch(InterruptedException e){
                    return;
                }
            }
        }).start();
    }
    void fazersom(){}

    void comer() {
        System.out.println(nome + ": Estou comendo!");
        energia += 40;
    }
}

class Cachorro extends Animal{
    void fazersom(){ //Estamos sobrescrevendo o método que vem da classe Animal por um método específico da subclasse;
        System.out.println(nome + ": Roff! Roff!");
    }
}

class Gato extends Animal{
    void fazersom(){
        System.out.println(nome + ": Miau");
    }
}
