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


