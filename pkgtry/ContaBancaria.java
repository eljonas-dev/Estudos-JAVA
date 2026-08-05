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
public class ContaBancaria {
    private double saldo = 100.00;
    public void sacar(double valor){
        if (valor > saldo) {
            throw new SaldoInsuficienteException(saldo, valor);
        }
        
        saldo -= valor;
        System.out.println("Saque realizado com sucesso! Novo saldo: R$ " + saldo);
    }
}
