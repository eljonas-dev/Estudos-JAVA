/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2aula4;
import java.util.*;
/**
 *
 * João Victor dos Santos, Luis Tiago Ferreira
 */
public class Ex2aula4 {

    public static void main(String[] args) {
     System.out.print("Operadores aceitos são: +, -, * e /");
     System.out.println("Dois números serão aceitos, exemplo: 5-4");
     System.out.println("Digite a expressão: ");
     Scanner sc = new Scanner(System.in);
     String[] partes = input.split("(?=[-+*/])|(?<=[-+*/])");        
    }
    
}

/*
import java.util.Scanner;

public class Ex2aula4 {

    public static void main(String[] args) {
        System.out.println("Operadores aceitos são: +, -, * e /");
        System.out.println("Dois números serão aceitos, exemplo: 5-4");
        System.out.print("Digite a expressão: ");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // <-- pega o texto do usuário

        String[] partes = input.split("(?=[-+*/])|(?<=[-+*/])");

        System.out.println("Número 1: " + partes[0]);
        System.out.println("Operador: " + partes[1]);
        System.out.println("Número 2: " + partes[2]);
    }
}

