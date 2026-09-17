/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testelayout;
import java.awt.*;
import java.awt.event.*; //-> biblioteca que trata eventos!
/**
 *
 * @author aluno
 */
public class Demoflowlayout extends Frame {
    
    static Button btn = new Button("Clique aqui pra ver algo bem massa!");
    /*
    Ele precisa ser declarado como estático devido ao método ser estático. 
    Variáveis de instância não existem até que um objeto seja de fato instanciado!
    */
    public static void Demoflowlayout() {
        Frame f = new Frame("FlowLayout");
        f.setSize(500, 400);
        f.setLayout (new FlowLayout());
        
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
                }
            });
        for (int i = 1; i<=10; i++){
            f.add(new Button("Botão " + i));  
            //PRECISO GUARDAR A REFERENCIA DESSES BOTÕES PRA CONSEGUIR LOCALIZA-LOS DEPOIS (usar Array)
            //O array será iniciado antes do loop, e durante o loop, antes de acabar, ele vai adicioanr ao array antes de repetir tudo;
        }
        
        f.add(btn);
        f.setVisible(true); //Renderiza a janela
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            System.out.println("O botão foi clicado");
            btn.setLabel("Clicado!");
        }
    });
    }
    
}

