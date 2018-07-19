/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.againagain.view;

import Control.GameControl;
import Exeptions.GameControlException;
import java.util.Scanner;
import Model.Player;
/**
 *
 * @author Levi and Hidnel
 */
public class StartProgramView extends View{

    public StartProgramView() {
        
    }
    
    

    public String[] getInputs() {
         System.out.println("**** getInputs() called ***");
         
         String[] inputs = new String[1];
         System.out.println("Welcome to again and again: ");
         boolean valid = false;
         while (valid == false){
             System.out.println("Please enter your name: ");
             Scanner inFile = new Scanner(System.in);
             inputs[0] = inFile.nextLine();
             inputs[0] = inputs[0].trim();
             if (inputs[0].length() < 1){
                 System.out.println("You must enter a non-blank value");
                 continue;
             }
             valid = true;
         }
         return inputs;
         }     
    

    public boolean doAction(String[] inputs) {
        
        
        String playerName = inputs[0];
        try {
            
        
        Player player = GameControl.savePlayer(playerName);
        if (player == null){
            System.out.println("Could not create the player." + "Enter a different name");
                    return false;
        }
        } catch(GameControlException ie){
            System.out.println("Error reading input: " + ie.getMessage());
            return false;
        }
        System.out.println("================================================= "
                + "Welcome to the game " + playerName 
                + " We hope you have a lot of fun!"
                + "================================================= ");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
       
        System.out.println("\tinputs = " + inputs[0]);
        
        return true;
    }
    
}
