/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Player;

/**
 *
 * @author Levi
 */
public class GameControl {

    public static Player savePlayer(String playerName) {
        System.out.println("*** savePlayer() called ***");
        return new Player();
    }
}
