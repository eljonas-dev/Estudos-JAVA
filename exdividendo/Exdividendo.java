
package com.mycompany.exdividendo;
/**
 *
 * @author franr
 * */
public class Exdividendo {
    public static void main(String[] args) {
        Empresa brav3 = new Empresa();
        
        brav3.nome = "BRAV3";
        brav3.preco = 17.90;
        brav3.div = 0;
        brav3.lpa = 2.09;
        brav3.vpa = 26.70;
        System.out.println("O valor de Dividend Yeld da empresa BRAV3 é: " + brav3.CalculaDy(brav3.div, brav3.preco));
        System.out.println("A relação do preço da ação da empresa BRAV3 e seu lucro acumulado é " + brav3.CalculaPl(brav3.preco, brav3.lpa));
        System.out.println("O valor da empresa BRAV3 em bolsa dividido pelo seu patrimônio líquido é" + brav3.CalculaPvp(brav3.preco, brav3.vpa));
        
        Empresa itsa4 = new Empresa();
        itsa4.nome = "ITSA4";
        itsa4.preco = 13.16;
        itsa4.div = 1.05;
        itsa4.lpa = 1.42;
        itsa4.vpa = 8.24;
        System.out.println("O valor de DividendYeld da empresa ITSA4 é: " + itsa4.CalculaDy(itsa4.div, itsa4.preco));
        System.out.println("A relação do preço da ação da empresa ITSA4 e seu lucro acumulado é " + itsa4.CalculaPl(itsa4.preco, itsa4.lpa));
        System.out.println("O valor da empresa ITSA4 em bolsa dividido pelo seu patrimônio líquido é" + itsa4.CalculaPvp(itsa4.preco, itsa4.vpa));       

        Empresa wege3 = new Empresa();
        wege3.nome = "WEGE3";
        wege3.preco = 46.11;
        wege3.div = 2.38;
        wege3.lpa = 1.52;
        wege3.vpa = 4.42;
        System.out.println("O valor de DividendYeld da empresa WEGE3 é: " + wege3.CalculaDy(wege3.div, wege3.preco));  
        System.out.println("A relação do preço da ação da empresa WEGE3 e seu lucro acumulado é " + wege3.CalculaPl(wege3.preco, wege3.lpa));
        System.out.println("O valor da empresa WEGE3 em bolsa dividido pelo seu patrimônio líquido é" + wege3.CalculaPvp(wege3.preco, wege3.vpa));    
                
    }
}

