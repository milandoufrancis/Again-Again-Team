/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Player;
import again.again.AgainAgain;

/**
 *
 * @author Levi
 */
public class GameControl {

    public static Player savePlayer(String playerName) {
       if(playerName == null || playerName.length() < 1){
           return null;
           
       }
       
       Player player = new Player();
       player.setName(playerName);
       AgainAgain.setPlayer(player);
        return player;
    }
    
    public static void createNewGame(Player player){
        System.out.println("createnewgame called");
    }
    
}
