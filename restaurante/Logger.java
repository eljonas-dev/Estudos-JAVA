/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurante;
import java.io.*;
import java.util.*;
/**
 *
 * @author PICHAU
 */
public class Logger {
    private String arquivo = "log_restaurante.txt";
    
    //Método com o sychronized
    public synchronized void escreverComTrava(String texto) {
        gravarNoArquivo(texto);
    }
    
    //"Mesmo método" sem o synchronized
    public void escreverSemTrava(String texto) {
        gravarNoArquivo(texto);
    }
    
    private void gravarNoArquivo(String texto) {
        try {
            FileWriter fw = new FileWriter(arquivo, true); //(onde vai salvar, vai gravar no final)
            PrintWriter pw = new PrintWriter(fw);
            pw.println(texto);
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
