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
public class SistemaPagamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        O primeiro foi declarado a partir da Interface Pagamento,
        portanto, ele só enxerga os métodos dentro de Pagamento;
        */
        Pagamento p1 = new PagarComPix();
        p1.processar(150.00);
        
        /*
        Esse segundo foi declarado a partir de MetodoPagamento, 
        portanto só enxerga os métodos dentro dele e de Pagamento, 
        que ele implementa, mas não os específicos
        da classe que foi instanciada
        */
        MetodoPagamento p2 = new PagarComPix();
        p2.validardados();
        p2.processar(450.00);
        
        /*
        O terceiro foi instnciado direto de PagarComPix, o que torna ele menos
        flexível e escalável, mas me dá acesso aos métodos exclusivos da subclasse 
        */
        PagarComPix p3 = new PagarComPix();
        p3.validardados("TESTE");
        p3.processar(129.99);
    }  
}

/*Ideias de implementação futuras 
1. colocar num while pra rodar infinitamente
2. colocar um scanner pro usuário digitar valores
3. Criar uma interface pra funcionalidades da loja de acordo com o número que digitar(adicionar ao carrinho, ver carrinho, cancelar)
4. A partir do número que o usuario digitar referente a função pagar, o número chamará o método referente a forma de pagamento usando
5.Usar ArrayLists pro carrinho
6. Salvar dados num arquivo txt através da api java.io

*/
