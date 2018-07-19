/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.againagain.view;

import Control.GameControl;
import Exeptions.GameControlException;
import Model.Game;
import again.again.AgainAgain;

/**
 *
 * @author Levi
 */
public class SaveGameView extends View{
    public String[] getInputs() {
       String[] inputs = new String[1];
       
       this.console.println("Y - Save the game");
       inputs[0] = getInput("Where do you want to save your game?");
       return inputs;
    }

    public boolean doAction(String[] inputs) {
       String filePath = inputs[0];
       Game currentGame = AgainAgain.getGame();
    
       try {
           GameControl.saveGame(currentGame, filePath);}
           catch(GameControlException ie){
               ErrorView.display(this.getClass().getName(),
                       "Error reading input: " + ie.getMessage());
               return false;        
       }
    this.console.println("Game successfully saved!");
    return true;
    }
    
}
