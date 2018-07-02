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
class HelpMenuView extends View{


    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];

        switch (menuItem) {
            case "H":
                System.out.println("This command brings up the help menu.");
                break;
            case "G":
                System.out.println("The goal of the game is to fight the last bosss and get out of the dangeon.");
                break;
            case "M":
                System.out.println("Asks the player which directions to move\n");
                break;
            case "U":
                System.out.println("Moves the player up when asked to move\n");
            case "D":
                System.out.println("Moves the player down when asked to move\n");
            case "L":
                System.out.println("Moves the player left when asked to move\n");
            case "R":
                System.out.println("Moves the player right when asked to move\n");
            case "1":
                System.out.println("Everytime you access a room, you will be asked to make a choice; 1 represents Yes\n");
                break;
            case "2":
                System.out.println("Everytime you access a room, you will be asked to make a choice; 2 represents No\n");
                break;
            case "N":
                System.out.println("This command is used to display the map on the screen\n");
                break;
            case "S":
                System.out.println("to access Item storage\n");
                break;
             case "X":
                System.out.println("You can press X to exit the game to the main menu");
                break;
            case "Q":
                System.out.println("Quit the game");
                return true;

            default:
                System.out.println("Invalid menu item.");
        }

        return false;
    }

    public String[] getInputs() {
        String[] inputs = new String[1];
        boolean valid = false;
     
            inputs[0] = getInput("G - The goal of the game is to fight the last bosss and get out of the dungeon.\n"
                    + "M - Moves the character up,down,left, and right outside of battle\n" 
                    + "A - By pressing A you can perform an attack on the enemy.\n"
                    + "S - to access Item storage\n" 
                    + "R - Player will be taken back to the previous room they came from; the room will remain the same as you left it\n" 
                    + "Q - Quit");
           
        return inputs;
    }
}
