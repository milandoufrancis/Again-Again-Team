/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.againagain.view;

import again.again.AgainAgain;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author My Laptop
 */
public abstract class View implements ViewInterface {
    private String message;
    protected final BufferedReader Keyboard = AgainAgain.getInFile();
    protected final PrintWriter console = AgainAgain.getOutFile();

    public View() {
    }

    public void display() {
        boolean endView = false;
        do {
            String[] inputs = getInputs();
            if (inputs[0].length() < 1 || inputs[0].toUpperCase().equals("Q")) {
                return;
            }
            endView = this.doAction(inputs);
        } while (endView != true);

    }

    public String getInput(String promptMessage) {
        String input = null;
        boolean valid = false;
        this.console.println(promptMessage); 
try {
        while (!valid) {
            //System.out.println();
            //Scanner inFile = new Scanner(System.in);
            input = this.Keyboard.readLine();
            input = input.trim();
            
            if (input.length() < 1) {
               System.out.println("You must enter a value.");
                continue; 
            }
            break;
        }
} catch (Exception e) {
    System.out.println("Error reading input: " + e.getMessage());
}
return input;
    }
            //input = inFile.nextLine();
            //input = input.trim().toUpperCase();

            //if (input.length() < 1) {
                //System.out.println("You must enter a value.");
                //continue;
           // }
            //valid = true;

       // }
    //return input;
    //}
}
