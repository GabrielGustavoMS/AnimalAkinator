/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impressao;

import akinator.NodeTree;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import view.Janela;

/**
 *
 * @author hight
 */
public class GerenciadorDaView {

    private boolean pausarEAguardarResposta;

    private Janela j;

    public GerenciadorDaView() {
        pausarEAguardarResposta = true;
        j = new Janela("Animal akinator");
    }

    private void atualizaJanela() {
        j.getFrame().repaint();
        j.getFrame().setVisible(true);
    }

    boolean avaliaResposta(NodeTree no) {
        atualizaJanela();
        j.getLbl1().setText((String) no.getValue());
        atualizaJanela();
        return j.getRespostaDoUsuario();
    }

    public void exibirResultado(NodeTree no) {
        j.getLbl1().setText((String)no.getValue());
         atualizaJanela();
         JLabel lbl = new JLabel();
         //Armazena url da imagem.
        String url = "/akinator/img/"+no.getValue()+".jpg";
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        j.getNode().add(lbl);
        lbl.setLayout(null);
        lbl.setSize(300,160);
        lbl.setLocation(0,210);
        
        icon.setImage(icon.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), 1));
                lbl.setIcon(icon);
        atualizaJanela();
    }
}
