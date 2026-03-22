/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testelista1;
import java.util.*;
/**
 *
 * @author franr
 */
public class TesteLista1 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Com POLIMORFISMO :D
        Animal c = new Cachorro();
        c.fazersom(); 
        /**
         * Nesse caso, estamos criando um cachorro mas tratando-o a partir da sua classe genérica
         * na prática isso me dá as seguintes diferenças:
         *  1. Não tem acesso aos métodos específicos da classe Cachorro, apenas métodos que existam em Animal;
         *  2. Consigo fazer um código genérico pra vários tipos de animais, e ainda assim ter resultados diferentes com o mesmo método
         */
        
        //Sem POLIMORFISMO :(
        Cachorro b = new Cachorro();
        b.fazersom();
        /** 
         * Aqui eu tenho acesso a todos os métodos da classe Animal (herança) + os métodos da classe Cachorro
         * porém, o código se torna menos flexível, me deixando preso à essa classe
         */
    }
}


