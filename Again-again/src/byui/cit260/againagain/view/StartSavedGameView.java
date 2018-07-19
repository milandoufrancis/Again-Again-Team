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
public class StartSavedGameView extends View{

    public String[] getInputs() {
       String[] inputs = new String[1];
       this.console.println("Z - Start the saved game");
       inputs[0] = getInput("Enter the name of the game you want to play");
       return inputs;
    }
    
    public boolean doAction(String[] inputs) {
        String filePath = inputs[0];
       Game currentGame = AgainAgain.getGame();
       try {GameControl.getGame(filePath);}
         catch(GameControlException ie){
               ErrorView.display(this.getClass().getName(),
                       "Error reading input: " + ie.getMessage());
               return false;        
    }
      GameMenuView gameMenuView = new GameMenuView();
   return true; 
       }
    }
