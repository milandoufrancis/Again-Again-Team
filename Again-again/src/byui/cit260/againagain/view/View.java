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
public abstract class View implements ViewInterface {

    public View() {
    }

    public void display() {
        boolean endView = false;
        do {
            String[] inputs = getInputs();
            if (inputs[0].length() < 1 || inputs[0].toUpperCase().equals("Q")) {
                return;
            }
            endView = doAction(inputs);
        } while (endView != true);

    }

    public String getInput(String promptMessage) {
        String input = "";
        boolean valid = false;
        System.out.println(promptMessage); 

        while (!valid) {
            System.out.println();
            Scanner inFile = new Scanner(System.in);
            input = inFile.nextLine();
            input = input.trim().toUpperCase();

            if (input.length() < 1) {
                System.out.println("You must enter a value.");
                continue;
            }
            valid = true;

        }
    return input;
    }
}
