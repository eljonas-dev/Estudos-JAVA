/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testelista2;

/**
 *
 * @author franr
 */
class Animal {
    void fazersom(){}
    void comer() {
        System.out.println("Estou comendo!");
    }
}

class Cachorro extends Animal{
    void fazersom(){ //Estamos sobrescrevendo o método que vem da classe Animal por um método específico da subclasse;
        System.out.println("Roff! Roff!");
    }
    void enterrarosso() {
        System.out.println("Enterrando um osso!"); //Só quem é Cachorro tem acesso!
    }
}

class Gato extends Animal{
    void fazersom(){
        System.out.println("Miau");
    }
}

class Boi extends Animal{
    void fazersom(){
        System.out.println("Muuuuu!");
    }
}