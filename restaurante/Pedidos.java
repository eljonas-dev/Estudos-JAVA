/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurante;
import java.util.*;
/**
 *
 * @author PICHAU
 */
public class Pedidos {
    private int id;
    private String nomePrato;
    private float tempoCriacao;
    private String status;
    
    //Sistema de contagem de pedidos (pra identificar pelo Id)
    private static int contadorGeral = 1; //usamos static pra que todos os objetos tenham o mesmo contador
    
    public Pedidos() { //Método construtor de pedidos
        this.id = contadorGeral;
        proximoId();
    }
    
    private synchronized static void proximoId() {
        contadorGeral++;
    }
    
    //Setters
    public void setId (int id) {
        this.id = id;
    }
    public void setNomePrato (String nomePrato) {
        this.nomePrato = nomePrato;
    }
    public void setTempoCriacao (float tempoCriacao) {
        this.tempoCriacao = tempoCriacao;
    }
    public void setStatus (String status) {
        this.status = status;
    }
    //Getters
    public int getId() {
        return this.id;
    }
    public String getNomePrato() {
        return this.nomePrato;
    }
    public float getTempoCriacao() {
        return this.tempoCriacao;
    }
    public String getStatus() {
        return this.status;
    }
}
