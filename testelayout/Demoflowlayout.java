
package testelayout;
import java.awt.*;
import java.awt.event.*; //-> biblioteca que trata eventos!
import java.util.ArrayList;
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
        ArrayList<Button> botoesPares = new ArrayList<>();
        ArrayList<Button> botoesImpares = new ArrayList<>();
        
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
                }
            });
        for (int i = 1; i<=10; i++){
            //Crio um objeto novoBotao genérico que vai receber o dígito da identação como nome
            Button novoBotao = new Button("Botão " + i);
            
            //Guarda esse objeto na minha lista (no Array)
            //Pra isso ele vai verificar se ele é par ou impar pra decidir em qual grupo ele vai guardar
            if (i % 2 == 0) {
                botoesPares.add(novoBotao);
            }
            else {
                botoesImpares.add(novoBotao);
            }
            
            //Adiciona esse objeto no meu frame(pra ele aparecer na tela)
            f.add(novoBotao);
             
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
            
            for (Button botao : botoesPares) {
                botao.setBackground(Color.red);
            }
            
            for(Button botao : botoesImpares) {
                botao.setBackground(Color.green);
            }
        }
    });
    }
}
