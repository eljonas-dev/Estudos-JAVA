/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamelauncher;

/**
 *
 * @author franr
 */
public class Player {
    int number = 0; 
    
    public void guess(){
    number = (int) (Math.random() * 10);
    System.out.println("Estou pensando em..." + number);
    }
}
