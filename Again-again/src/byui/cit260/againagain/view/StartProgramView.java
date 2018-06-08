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
public class StartProgramView {

    public StartProgramView() {
        
    }
    
    public void display() {
        boolean endOfView = false;
        do {
            String[] inputs = getInputs();
            if(inputs[0].length() < 1 || inputs[0].equals("Q")) {
                return;
            }
            endOfView = doAction(inputs);
        }
        while (endOfView != true);
    }

    private String[] getInputs() {
         System.out.println("**** getInputs() called ***");
         
         String[] inputs = new String[1];
         System.out.println("Welcome to again and again: ");
         boolean valid = false;
         while (valid == false){
             System.out.println("Please enter your name: ");
             Scanner inFile = new Scanner(System.in);
             inputs[0] = inFile.nextLine();
             inputs[0] = inputs[0].trim();
             if (inputs[0].length() < 1){
                 System.out.println("You must enter a non-blank value");
                 continue;
             }
             valid = true;
         }
         return inputs;
         }     
    

    private boolean doAction(String[] inputs) {
    
        System.out.println("**** doAction() called ***");
        System.out.println("\tinputs = " + inputs[0]);
        
        return true;
    }
    
}
