/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testelista2;
import java.util.*;
/**
 *
 * @author franr
 */
public class TesteLista2 {

    public static void main(String[] args) {
        List<Animal> meusanimais = new ArrayList<>(); 
        
        Animal beto = new Cachorro();
        beto.fazersom();
        
        Cachorro nepo = new Cachorro();
        nepo.fazersom();
        nepo.comer();
        nepo.enterrarosso();
        System.out.println("----------------------Testando a LISTA! -------------------------");
        
        //meusanimais.add(new Gato());
        
        for (int i = 0; i < 9; i++) {
            meusanimais.add(new Cachorro());
        }
        
        System.out.println(meusanimais);
        // TODO code application logic here
        
        for (Animal a: meusanimais) { //Aqui está sendo usado um for-each. 
            a.fazersom();
            /**
             * Ele cria uma variável a, onde vai guardar cada um dos objetos dentro da Lista meusanimais.
             * Isso é um rótulo momentâneo que colocamos pra conseguir nos referir à lista por completo.
             * por isso quando chamamos o método a.fazersom() ele executa o método de cada um dos objetos ao mesmo tempo;
             * (É algo padrão do for-each, era assim também no C#)
             */
        }
        
    }
}
