/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.againagain.view;

import Control.FightControl;
import java.util.Scanner;

/**
 *
 * @author My Laptop
 */
public class TrapMenuView extends View {
    

    public String[] getInputs() {
        String[] inputs = new String[1];
        boolean valid = false;

        inputs[0] = getInput("4 - Check the damage caused by the trap.\n"
                    + "V - Escape to next room.\n" 
                    + "Q - Quit");
            Scanner inFile = new Scanner(System.in);
            inputs[0] = inFile.nextLine();
            inputs[0] = inputs[0].trim().toUpperCase();

           
        return inputs;
        
    }

    public boolean doAction(String[] inputs) {
        double health = 80.0;
        health = FightControl.trapControl(80.0, 6.0, 10.0);
        
        if (health <= 0){
            System.out.println("You're dead!");
            return true;
        }else if(health > 0 && health < 5.0){
            System.out.println("You're almost died!");
        }else{
            System.out.println("You're still alive");
        }
        String menuItem = inputs[0];
        switch (menuItem) {
            case "4":
                System.out.println("Check the damage caused by the trap.\n");
                break;
           
            case "V":
            case "Q":
                System.out.println("Quit");
                return true;

            default:
                System.out.println("Invalid menu item.");
        
    }
        return false;
}
}