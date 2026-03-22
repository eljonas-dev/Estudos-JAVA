/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poli;
import java.util.*;
/**
 *
 * @author franr
 */
public class Poli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Cachorro> meuscaes = new ArrayList<>(); 
        List<Gato> meusgatos = new ArrayList<>();
        List<Animal> todosanimais = new ArrayList<>();
        
        for (int i = 0; i < 8; i++) {
            Gato novogato = new Gato();
            novogato.nome = ("Gato " + (i+1));
            meusgatos.add(novogato);
            
        }
        
        for (int i = 0; i < 9; i++) {
            
            Cachorro novocachorro = new Cachorro();
            novocachorro.nome = ("Cachorro " + (i+1));
            meuscaes.add(novocachorro);  
        }
        
        todosanimais.addAll(meuscaes);
        todosanimais.addAll(meusgatos);
        
        System.out.println(meuscaes);
        
        Thread barulhog = new Thread(()-> {
            for (Gato b: meusgatos){
                //System.out.println(b.nome);
                b.fazersom();
                
                try{
                    Thread.sleep(5000);
                }catch (InterruptedException e){
                    
                    return;
                }
            }
        });
        
        Thread barulhoc = new Thread(()-> { //Usamos uma expressão lambda;
            for (Cachorro a: meuscaes) { //Aqui está sendo usado um for-each. 
            a.fazersom();
            //System.out.println(a.nome);
            /**
             * Ele cria uma variável a, onde vai guardar cada um dos objetos dentro da Lista meusanimais.
             * Isso é um rótulo momentâneo que colocamos pra conseguir nos referir à lista por completo.
             * por isso quando chamamos o método a.fazersom() ele executa o método de cada um dos objetos ao mesmo tempo;
             * (É algo padrão do for-each, era assim também no C#)
             */
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                System.out.println("Bah! A tarefa foi interrompida tche :O");
                return; 
            }//fim do catch
            }//fim do loop
        });//Fim do thread barulhoc
        
            for (Animal c: todosanimais) {
                c.iniciarfome();
            }
        barulhoc.start();
        barulhog.start();


    } 
}
