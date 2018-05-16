/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package again.again;

import Model.Game;
import Model.Item;
import Model.Player;

/**
 *
 * @author My Laptop
 */
public class AgainAgain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player player = new Player();
        player.setCurrentFile("yes");
        player.setName("bob");
        
      Game game = new Game();
      game.setPlayer(player);
      
      System.out.println(game.toString());
      System.out.println(Item.Sword.toString());
      
      
    }
    
}
