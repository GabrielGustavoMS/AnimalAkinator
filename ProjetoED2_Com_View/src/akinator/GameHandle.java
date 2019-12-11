/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akinator;

import impressao.Exibir;
import java.util.Scanner;

/**
 *
 * @author hight
 */
public class GameHandle {
   
    public GameHandle() {
       
    }
    
    public  void gamePlay(){
        //String nodes [] = {"o animal come carne?","O animal tem listras yes(sim)","O animal tem listras no(não)","Tigre","Leopardo","Zebra","Cavalo"};
                
        String nodes[] = {"O animal é selvagem ?","O animal come carne ? (Sim)","O animal é terrestre? (não)","O animal tem listras (sim sim)","O animal tem listras (sim não)","É um felino? (nao sim)","O animal tem listras (nao nao)","Tigre","Leopardo","Zebra","Cavalo","Gato","Cachorro","peixe palhaço","peixe cirurgião amarelo"};
        Tree b = new Tree();
        b.insertLevelOrder(nodes);
        b.emNivel(b.getRaiz());System.out.println("");
        startGame(b.getRaiz());
        
    }
    private  void startGame(NodeTree raiz){
        defineDirecao(raiz);
    }
    
    private NodeTree defineDirecao(NodeTree node) {
        if (node != null) {
            if (!(node.getFilhoDireito() == null && node.getFilhoEsquerdo() == null)) {
                if (Game.saida.avaliaResposta(node)) {                    
                     defineDirecao(node.getFilhoEsquerdo());
                } else {
                     defineDirecao(node.getFilhoDireito());
                }
            } else { 
                Game.saida.exibirResultado(node);
                
            }
        }
        return null;

    }

   
    
}
