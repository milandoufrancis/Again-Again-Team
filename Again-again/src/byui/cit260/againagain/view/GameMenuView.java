/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.againagain.view;

import Control.GameControl;
import Control.MapControl;
import Model.Game;
import Model.Item;
import Model.Location;
import again.again.AgainAgain;

/**
 *
 * @author My Laptop
 */
class GameMenuView extends View {

    @Override
    public String[] getInputs() {
        //System.out.println("get inputs called");
        //String[]  inputs = new String[1];
        //inputs[0] = getInput("TEST");
        String[] inputs = new String[1];
        boolean valid = false;
        inputs[0] = getInput("V - This command helps you to display map.\n"
                + "I - this helps to view the list of items\n"
                + "J - to view a list of actors\n"
                
               + "S - moves the actor\n" 
          
                + "Q - Quit game\n");
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        //System.out.println("doaction called");
        //String menuItem = inputs[0];

        switch (inputs[0]) {
            case "V":// to view location
                MapControl.displayMap();
                break;
            case "S": // to move the actor
                MoveActorView actorMove = new MoveActorView();
                actorMove.display();
                break;

            case "I":// list of items
                this.viewItem();
                break;

            case "J":
                this.viewActors();
                break;
            case "Y":
                Item[] items = GameControl.doInsertionSort(Item.values());
                for (Item item : items){
                    System.out.println(item.getItemName() + " " +  item.getItemType());
                }
                
            case "Q":
                System.out.println("Quit the game");
                return true;

            default:
                System.out.println("Invalid menu item.");
        }
        return false;

    }

    

    private void viewItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewActors() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
