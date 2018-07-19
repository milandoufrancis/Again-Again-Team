/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.againagain.view;

import Control.MapControl;
import Exeptions.MapControlException;
import Model.Actor;
import Model.Location;
import Model.Player;
import again.again.AgainAgain;

/**
 *
 * @author My Laptop
 */
public class MoveActorView extends View {

    @Override
    public String[] getInputs() {
        //inputs = new String array two elements long
        String[] inputs = new String[2];
        boolean valid = false;
        MapControl.displayMap();

        //Print instructions to move an actor
        System.out.println("w - moves the actor right\n"
                + "A - moves the actor up\n"
                + "S - moves the actor down\n"
                + "D - moves the actor to the left\n"
                + "Q - Quit game\n");

        inputs[0] = getInput("");

        //input[1] = getInput("");
        //save a reference to input2 in the inputs array
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        //row = get first value in inputs array
         int row = -1;
        int column = -1;
         switch (inputs[0]){
             case "W":
                 //right
                 row = AgainAgain.getGame().getPlayer().getActor().getCoordinates().x;
                 column = AgainAgain.getGame().getPlayer().getActor().getCoordinates().y+1;
                 break;
             case "A":
                 //up
                 row = AgainAgain.getGame().getPlayer().getActor().getCoordinates().x-1;
                 column = AgainAgain.getGame().getPlayer().getActor().getCoordinates().y;
                 break;
             case "S":
                 //down
                 row = AgainAgain.getGame().getPlayer().getActor().getCoordinates().x+1;
                 column = AgainAgain.getGame().getPlayer().getActor().getCoordinates().y;
                 break;
             case "D":
                 //left
                row = AgainAgain.getGame().getPlayer().getActor().getCoordinates().x;
                 column = AgainAgain.getGame().getPlayer().getActor().getCoordinates().y-1;
                 break; 
             case "Q":
                 return true;
                         
                          
                                 
                 
                 
                 
         }
        String rows = inputs[0];
        //column = get second value in inputs array
        String columns = inputs[1];
       
 
        //player = get the player from the main class
        Player player = AgainAgain.getPlayer();
        //actor = get the Actor in the player object
        Actor actor = player.getActor();
        Location newLocation;
        try {
            //newLocation = moveActor(actor, row, column)
            newLocation = MapControl.moveActor(actor, row, column);
        } catch (MapControlException ex) {
            //Print error passed with the exception
            System.out.println("Error reading input: " + ex.getMessage());
            return false;
        }
        //Print the description of the scene in the
        //newLocation
        System.out.println(newLocation.getDescription());
        return false; //to loop the view 
    

}
}
