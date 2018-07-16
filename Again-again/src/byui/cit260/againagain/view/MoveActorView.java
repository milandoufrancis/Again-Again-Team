/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.againagain.view;

/**
 *
 * @author My Laptop
 */
public class MoveActorView extends View{

    @Override
    public String[] getInputs() {
        //inputs = new String array two elements long
        String[] inputs = new String[2];
        boolean valid = false;

 //Print instructions to move an actor
 System.out.println("w - moves the actor up\n"
                + "A - moves the actor to the left\n"
                + "S - moves the actor to the right\n"
                + "D - moves the actor down\n"
                + "Q - Quit game\n");
 
 inputs[0] = getInput("");
 
 //input[1] = getInput("");
 //save a reference to input2 in the inputs array
 return inputs; 
    }

    @Override
    public boolean doAction(String[] inputs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
   
    
}
