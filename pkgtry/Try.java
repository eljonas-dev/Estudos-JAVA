/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Exceções são sempre OBJETOS, derivados da classe jav.lang.Throwable
 * 
 * Dessa classe pai temos a seguinte hierarquia
 * 
 * Throwable ---> Error --> Problemas graves da própria JVM, que a aplicação não consegue se recuperar
 *          |
 *          -----> Exception ---> Condições de erro que podem ser tratadas e recuperadas
 * 
 * podemos criar as nossas próprias exceções!
 */
package pkgtry;

public class Try {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ContaBancaria conta = new ContaBancaria();
       
       try {
           System.out.println("Tentando realizar saque...");
           conta.sacar(150.00);
       } catch (SaldoInsuficienteException e) { //porque "e"?
           //Captura o erro que declaramos na classe ContaBancaria
           System.out.println("[ALERTA DE NEGÓCIO]: " + e.getMessage()); //oq getMessage faz?
       } catch(Exception e) {
           //Qualquer erro genérico não previsto
           System.out.println("[ERRO INESPERADO: " + e.getMessage());
           
       } finally {
           //Vai ocorrer independente se deu erro ou não
           System.out.println("Operação finalizada no terminal");
       }
    }
    
}
