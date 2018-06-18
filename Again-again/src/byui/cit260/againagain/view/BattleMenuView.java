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
public class BattleMenuView {
    void displayBattleMenuView() {
        boolean endView = false;
        do {
            String[] inputs = getInputs();
            if (inputs[0].length() < 1 || inputs[0].toUpperCase().equals("Q")) {
                return;
            }
            endView = doAction(inputs);
        } while (endView != true);

    }

    private String[] getInputs() {
        String[] inputs = new String[1];
        boolean valid = false;
        
        while (!valid) {
            System.out.println("A – Attack\n" +
                    "D – Defend\n" + 
                    "R - Run Away\n" +
                    "S - Item Storage\n" +
                    "I - Use Item\n");
            Scanner inFile = new Scanner(System.in);
            inputs[0] = inFile.nextLine();
            inputs[0] = inputs[0].trim().toUpperCase();
            
            if (inputs[0].length() < 1) {
                System.out.println("Are you in that much a rush to die?\n" + 
                        "Do something!");
                continue;
            }
            valid = true;
        }
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        
        switch(menuItem) {
            
            case "A":
                System.out.println("You attack the enemy!");
                //Call the function that calculates damage here.
                break;
            case "D":
                System.out.println("You defend yourself for the next attack.");
                break;
            case "R":
                System.out.println("You ran away.");
                break;
            case "S":
                System.out.println("You opened your pack to look for a...");
                //Call a method that opens a sub menu for the items the player
                //has collected so far in the game.
                break;
            case "I":
                System.out.println("You use the item you have chosen.");
                break;

            default:
                System.out.println("Invalid menu item.");
        }
        return false;
    }
    
}
