/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.againagain.view;

import Control.FightControl;
import Exeptions.FightControlException;
import Model.Actor;
import Model.Location;
import Model.Player;
import again.again.AgainAgain;
import java.awt.Point;

/**
 *
 * @author My Laptop
 */
public class AttackHitView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        inputs[0] = getInput("How hard do you want to hit the enemy? ");
        //+ "F - Flee\n"
        //+ "A - Attack");

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        try {
            // actor = get the actor who is attacking
            Actor actor = AgainAgain.getGame().getPlayer().getActor();
            Point coordinates = actor.getCoordinates();
            Location[][] locations = AgainAgain.getGame().getMap().getLocations();
            Location location = locations[coordinates.x][coordinates.y];
            
            Actor enemy = location.getEnemy();
            
            if (enemy == null) {
                this.console.println("There is no enemy in this location.");
                return true;
            }
            
            // weaponStrength = convert the attack strengh input to a number
            int strength = Integer.parseInt(inputs[0]);

            int result = FightControl.attackEnemy(actor, enemy, strength);
            if (result == 1){
                System.out.println("You defeated the enemy");
                return true;
                
            }
            else if(result == -1){
               this.console.println("You've been defeated by the enemy");
                return true; 
            }
            else {
                this.console.println("No winner!!");
                return true; 
            }
                
            
        } catch (FightControlException ie) {
            this.console.println("Error reading input: " + ie.getMessage());
            return false;
        }
     catch (NumberFormatException ie) {
    
        this.console.println("Error reading input: " + ie.getMessage());
            return false;
    }
}
}