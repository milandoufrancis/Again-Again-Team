/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.againagain.view;

import java.util.Scanner;

/**
 *
 * @author Levi
 */
public class BattleMenuView extends View {
    

    public String[] getInputs() {
        String[] inputs = new String[1];
        boolean valid = false;
        
        inputs[0] = getInput("A – Attack\n" +
                    "D – Defend\n" + 
                    "R - Run Away\n" +
                    "S - Item Storage\n" +
                    "I - Use Item\n");
        return inputs;
    }

    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        
        switch(menuItem) {
            
            case "A":
                this.console.println("You attack the enemy!");
                //Call the function that calculates damage here.
                break;
            case "D":
                this.console.println("You defend yourself for the next attack.");
                break;
            case "R":
                this.console.println("You ran away.");
                break;
            case "S":
                this.console.println("You opened your pack to look for a...\n");
                //Call a method that opens a sub menu for the items the player
                //has collected so far in the game.
                break;
            case "I":
                this.console.println("You use the item you have chosen.");
                break;

            default:
                this.console.println("Invalid menu item.");
        }
        return false;
    }
    
}
