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

        System.out.println("C - Check the damage caused by the trap.\n"
                + "F - Flee");
        inputs[0] = getInput("Enter the menu option").trim().toUpperCase();

        return inputs;

    }

    public boolean doAction(String[] inputs) {
        int health = 80;
        health = FightControl.trapControl(80, 6, 10);

        if (health <= 0) {
            System.out.println("You're dead!");
            return true;
        } else if (health > 0 && health < 5.0) {
            System.out.println("You're almost died!");
        } else {
            System.out.println("You're still alive");
        }
        System.out.println("Your health is " + health);

        switch (inputs[0]) {
            case "Q":
            case "F":
                return true;
            case "C":
                System.out.println("Your current health is : " + health);
                break;
            default:
                System.out.println("Please enter a menu item");
        }

        return false;
    }
}
