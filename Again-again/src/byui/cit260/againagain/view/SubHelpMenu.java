/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.againagain.view;

import java.util.Scanner;

/**
 *
 * @author My Laptop
 */
public class SubHelpMenu extends View {
    
  
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];

        switch (menuItem) {
            case "H":
                System.out.println("This command will help you to bring up the help menu.");
                break;
            case "N":
                System.out.println("This command is used to display the map on the screen\n");
                break;
            case "X":
                System.out.println("You can press X to exit the game, even when you're fighting with the boss.");
                break;
            case "1":
                System.out.println("Everytime you access a room, you will be asked to make a choice, and 1 represents Yes" );
                break;
            case "2":
                System.out.println("Everytime you access a room, you will be asked to make a choice, and 2 represents No");
                break;
            case "Q":
                System.out.println("Quit");
                return true;

            default:
                System.out.println("Invalid menu item.");
        }

        return false;
}

    public String[] getInputs() {
        String[] inputs = new String[1];
        boolean valid = false;

        inputs[0] = getInput("H - This command will help you to bring up the help menu.\n"
                    + "N - This command is used to display the map on the screen\n" 
                    + "X - You can press X to exit the game, even when you're fighting with the boss.\n"
                    + "1 - Everytime you access a room, you will be asked to make a choice, and 1 represents Yes\n" 
                    + "2 - Everytime you access a room, you will be asked to make a choice, and 2 represents No\n" 
                    + "Q - Quit");
            
        return inputs;
    }
        
    }


