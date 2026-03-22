/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testelista1;
import java.util.*;
/**
 *
 * @author franr
 */
abstract public class Animal {
    abstract void fazersom();
    /*
    Nesse caso, tornamos a classe Animal como abstrata, o que faz com que seus métodos não possam
    ser chamados dentro da Main e que não seja possível instanciar objetos dentro dela.
    Portanto, animal se tornou apenas um "molde" pra me apontar as variáveis de instância e comportamentos
    que suas classes filhas irão herdar, e manipular;
    */
}

class Cachorro extends Animal {
    void fazersom() {
        System.out.println("Latir");
    }
}
