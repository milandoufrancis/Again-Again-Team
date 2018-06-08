/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.againagain.view;

/**
 *
 * @author Levi
 */
public class StartProgramView {

    public StartProgramView() {
        
    }
    
    public void DisplayStartProgramView() {
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
         inputs[0] = "testInput";
         
         return inputs;
    }

    private boolean doAction(String[] inputs) {
    
        System.out.println("**** doAction() called ***");
        System.out.println("\tinputs = " + inputs[0]);
        
        return true;
    }
    
}
