/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgtry;

/**
 *
 * @author aluno
 */
public class SaldoInsuficienteException extends RuntimeException {
    private final double saldoAtual; //oq é final?
    private final double valorTentado;
    
    //método construtor
    public SaldoInsuficienteException(double saldoAtual, double valorTentado) {
        /*
        1- Oq é a palavra reservad super?
        2- String.format é um método, certo? O que ele faz?
        */
       super(String.format("Saldo insuficiente! Você tentou sacar R$ %.2f, mas tem apenas R$ %.2f", valorTentado, saldoAtual));
       this.saldoAtual = saldoAtual;
       this.valorTentado = valorTentado;
    }
    
    public double getSaldoAtual(){
        return saldoAtual;
    }
    public double getValorTentado(){
        return valorTentado;
    }
}
