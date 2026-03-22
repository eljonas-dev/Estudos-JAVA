/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exdividendo;

/**
 *
 * @author franr
 */
public class Empresa {
    String nome;
    double preco;
    double div;
    double lpa;
    double vpa;
    
    //(Dividendos por ação / Preço da ação) * 100
    public double CalculaDy(double a, double b) {
        double dy = (a / b)*100; 
        return dy;
    }
    //Preço da ação / lucro por ação
    public double CalculaPl(double b, double c) {
       double pl = b / c;
       return pl;
               
    }
    
    //Preço da Ação / Valor Patrimonial por Ação
    public double CalculaPvp(double d, double e) {
        double pvp = d / e;
        return pvp;
    }
}
