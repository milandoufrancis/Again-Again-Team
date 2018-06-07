/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package again.again;

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean doAction(String[] inputs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
