/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemapagamento;

/**
 *
 * @author aluno
 */
public interface Pagamento {
    public void processar(double valor);
}

abstract class MetodoPagamento implements Pagamento {
   protected String status = "Processando";
  abstract public void validardados(); 
}

class PagarComPix extends MetodoPagamento {
    public void processar(double valor){
        System.out.println("Gerando QR Code par pagamento no valor de: R$" + valor );
        this.status = "Dados validados!";
    }
    public void validardados() {
        System.out.println("Verificando chave pix e conexão com o banco");
    }
    public void validardados(String cupom) {
        System.out.println("Verificando cumpom..." + cupom);
    }
}

/**
 * O que está acontecendo aqui é que primeiro criamos uma interface onde vai haver o método que vamos implementar pras classes.
 * A vantagem de usara interface é que podemos implementar um mesmo método pra diferentes famílias (classes)
 * Estamos definindo um método de processar pagamento que vai ser comum a quaquer método que o usuário utilizar.
 * 
 * Definimos uma classe abstrata chamada MetodoPagamento, que será a superclasse de qualquer tipo de pagamento que for implementado,
 * o que faz um código mais adaptável, porque se eu tiver que adicionar um método de pagamento novo não preciso mexer em código já funcional.
 * Essa classe foi definida como abstrata, o que não permitirá que sejam instanciados objetos dentro dessa classe. Ela serve só como um meio
 * de transmitir métodos via herança, o que deixa o código mais seguro e estruturado.
 * Dentro dessa classe temos o método processar (que veio da interface) + o método validardados que foi definido nessa classe.
 * Também definimos uma variável de instância status que está como protegida, o que é diferente do private porque permite que ela seja acessada
 * apenas pelos membros da família, ou seja, pelas suas subclasses.
 * 
 * Logo depois, criamos a nossa primeira classe funcional, que é a PagarComPix, que sobrescreve (overwrite) o corpo do método processar que herdou da
 * interface. Ele também sobrescreve, e us auma sobrecarga, para o método validardados que herdou da classe pai, tendo uma versão sem parâmetros e depois
 * outra versão caso seja inserido algum parâmetro (que no caso é o código do cupom)
 */