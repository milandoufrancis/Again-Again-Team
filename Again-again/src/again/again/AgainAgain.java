/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package again.again;

import Model.Game;
import Model.Item;
import Model.Player;
import Model.Map;
import Model.TrapLocation;
import Model.Stats;

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
        
        Map map = new Map();
        map.setDescription("You are here");
        
        
      Game game = new Game();
      game.setPlayer(player);
      
      System.out.println(game.toString());
      System.out.println(Item.Sword.toString());
      System.out.println(map.toString());
      System.out.println(TrapLocation.toString());
      
    }
    
}
