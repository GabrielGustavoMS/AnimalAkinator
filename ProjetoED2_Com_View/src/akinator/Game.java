/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akinator;

import impressao.Exibir;


/**
 *
 * @author hight
 */
public class Game {
    private GameHandle game;
    static Exibir saida;
    public Game() {
        this.game = new GameHandle();
    }
    public void startGame(){
        game.gamePlay();
    }
    
    public static void main(String[] args) {
            
        saida = new Exibir(Exibir.modosDeExibicao.JANELA);
        
       
    
        Game game = new Game();
        game.startGame();
        
        
    }
    

    
    
}
