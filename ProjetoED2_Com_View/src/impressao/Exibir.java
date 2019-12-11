/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impressao;

import akinator.NodeTree;

/**
 *
 * @author hight
 */
public class Exibir {
    private modosDeExibicao saida;
    private GerenciadorDaView g;
    private GerenciadorDeSaidaTerminal t;
    
    public Exibir(modosDeExibicao saida) {
        this.saida = saida;
        if (saida == modosDeExibicao.JANELA) {
            g = new GerenciadorDaView();
        } else {
            t = new GerenciadorDeSaidaTerminal();
        }
    }
    public enum modosDeExibicao {
        TERMINAL, JANELA;
    }
    
    public boolean avaliaResposta(NodeTree node) {
        if (this.saida == modosDeExibicao.TERMINAL) {
            return t.avaliaResposta(node);
        }
        return g.avaliaResposta(node);
    }
    public void exibirResultado(NodeTree no){
        if (this.saida == modosDeExibicao.TERMINAL) {
             t.exibirResultado(no);
        }else{
            g.exibirResultado(no);
        }
    }
}
