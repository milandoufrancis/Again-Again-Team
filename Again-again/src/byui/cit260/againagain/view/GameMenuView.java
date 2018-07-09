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
class GameMenuView extends View{

    @Override
    public String[] getInputs() {
        //System.out.println("get inputs called");
        //String[]  inputs = new String[1];
        //inputs[0] = getInput("TEST");
        String[] inputs = new String[1];
        boolean valid = false;
        inputs[0] = getInput("V - This command helps you to display map.\n"
                + "I - this helps to view the list of items\n" 
                    + "J - to view a list of actors\n");
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        //System.out.println("doaction called");
        //String menuItem = inputs[0];

        switch (inputs[0]) {
            case "V":// to view location
                this.displayMap();
                break;
                
            case "I":// list of items
                this.viewItem();
                break;
                
            case "J":
                this.viewActors();
                break;
                
            case "Q":
                System.out.println("Quit the game");
                return true;

            default:
                System.out.println("Invalid menu item.");
        }
        return true;
        
    }
    
public void displayMap() {
    System.out.println("*** displayMap function called ***");
}

public void viewItem() {
    System.out.println("*** viewItem function called ***");
}

public void viewActors() {
    System.out.println("*** viewActors function called ***");
}
    
    
}
