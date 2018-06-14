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
class HelpMenuView {

    void displayHelpMenuView() {
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
            case "G":
                System.out.println("The goal of the game is to fight the last bosss and get out of the dangeon.");
                break;
            case "M":
                System.out.println("Moves the character up,down,left, and right outside of battle\n");
                break;
            case "A":
                System.out.println("By pressing A you can perform an attack on the enemy.");
                break;
            case "S":
                System.out.println("to access Item storage");
                break;
            case "R":
                System.out.println("Player will be taken back to the previous room they came from; the room will remain the same as you left it");
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
            System.out.println("G - The goal of the game is to fight the last bosss and get out of the dangeon.\n"
                    + "M - Moves the character up,down,left, and right outside of battle\n" 
                    + "A - By pressing A you can perform an attack on the enemy.\n"
                    + "S - to access Item storage\n" 
                    + "R - Player will be taken back to the previous room they came from; the room will remain the same as you left it\n" 
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
