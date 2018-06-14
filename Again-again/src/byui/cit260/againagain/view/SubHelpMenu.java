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
public class SubHelpMenu {
    void displaySubHelpMenuView() {
        boolean endView = false;
        do {
            String[] inputs = getInputs();
            if (inputs[0].length() < 1 || inputs[0].toUpperCase().equals("Q")) {
                return;
            }
            endView = doAction(inputs);
        } while (endView != true);
    
}
    private boolean doAction(String[] inputs) {
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

    private String[] getInputs() {
        String[] inputs = new String[1];
        boolean valid = false;

        while (!valid) {
            System.out.println("H - This command will help you to bring up the help menu.\n"
                    + "N - This command is used to display the map on the screen\n" 
                    + "X - You can press X to exit the game, even when you're fighting with the boss.\n"
                    + "1 - Everytime you access a room, you will be asked to make a choice, and 1 represents Yes\n" 
                    + "2 - Everytime you access a room, you will be asked to make a choice, and 2 represents No\n" 
                    + "Q - Quit");
            Scanner inFile = new Scanner(System.in);
            inputs[0] = inFile.nextLine();
            inputs[0] = inputs[0].trim().toUpperCase();

            if (inputs[0].length() < 1) {
                System.out.println("You must enter a value.");
                continue;
            }
            valid = true;

        }
        return inputs;
    }
        
    }


