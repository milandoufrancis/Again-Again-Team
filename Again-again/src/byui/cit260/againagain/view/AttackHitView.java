/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.againagain.view;

import Control.FightControl;
import Exeptions.FightControlException;
import Model.Actor;
import Model.Enemy;
import Model.Player;

/**
 *
 * @author My Laptop
 */
public class AttackHitView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        inputs[0] = getInput("Your are in the ennemy room, are you willing to attack?\n"
                + "F - Flee\n"
                + "A - Attack");
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        try {
            FightControl.takeDamage(10, 20, 5);
        }catch (FightControlException ie){
            System.out.println(ie.getMessage());
            return false;
        }
            
       
        Actor player = new Actor();
        Enemy enemy = new Enemy();

        player.setActorDamage(1);
        player.setActorHealth(60);
        player.setDefence(1);

        enemy.setDefence(1);
        enemy.setEnemyHP(60);
        enemy.setEnemyDamage(1);

        switch (inputs[0]) {
            case "F":
                return true;

            case "A":
                 try {
            player.setActorHealth(FightControl.takeDamage(player.getActorHealth(), player.getDefence(), enemy.getEnemyDamage()));
                enemy.setEnemyHP(FightControl.takeDamage(enemy.getEnemyHP(), enemy.getDefence(), player.getActorDamage()));
        }catch (FightControlException ie){
            System.out.println(ie.getMessage());
            return false;
        }
               
                break;

            default:
                System.out.println("Please select a valid option");

        }
        if (player.getActorHealth() <= 0){
            System.out.println("You're dead");
            return true;
        }else if(enemy.getEnemyHP() <= 0){
            System.out.println("The enemy is dead");
            return true;
        }else{
            System.out.println("Your HP: " + player.getActorHealth());
            System.out.println("Enemy HP: " + enemy.getEnemyHP());
        }
        return false;
    }
}


