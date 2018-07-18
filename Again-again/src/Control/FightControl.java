/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Exeptions.FightControlException;
import Model.Actor;
import java.util.Random;

/**
 *
 * @author My Laptop
 */
public class FightControl {
    public static int takeDamage(int Health, int Defense, int Weapon)throws FightControlException{
        if (Health <= 0 || Health > 100){
            throw new FightControlException("The health cannot be negative, or greater than hundred");
        }
        
        if (Defense < 2 || Defense > 80){
            throw new FightControlException("The defense cannot be negagite, equal to zero and greater than 80");
        }
        
        if (Weapon < 0 || Weapon > 40){
            throw new FightControlException("The weapon cannot be negagite, equal to zero and greater than 40");
        }
        
        int Attack = Health - (Weapon / Defense);
        
        if (Attack < 0){
            throw new FightControlException("The dattack cannot be negagite, equal to zero");
        }
        return Attack;
    }

    public static int attackEnemy(Actor attacker, Actor enemy, int strengh) throws FightControlException{
        
        if (attacker == null || enemy == null){
            throw new FightControlException("invalid attacker or enemy");
        }
        
        if (strengh < 0 ){
            throw new FightControlException("Attack strengh cannot be negative");
        }        
        // get the health of the attacker
        int attackerHealth = attacker.getActorHealth();
        // get the health of the enemy
        int enemyHealth = enemy.getActorHealth();
        
        int enemyDamage = FightControl.takeDamage(enemy.getActorHealth(), enemy.getDefence(), strengh);
        // if the nenemy heealth - damage is less than 0 then 
        if (enemyHealth - enemyDamage < 0){
           return 1;
        }
         
        
        // enemyAttackStregth = random( enemies damage)
        Random strenghGenerator = new Random();
        int enemyAttackStrengh = strenghGenerator.nextInt(enemy.getActorDamage() + 1);
        
        // attackerDamage = takeDamage(enemyHealth, enemyDefense, enemyAttackStrenght)
        int attackerDamage = FightControl.takeDamage(attacker.getActorHealth(), attacker.getDefence(), enemyAttackStrengh);
        
        // if the attacker health - the attscker danmage is less than 0 then 
        if (attackerHealth - attackerDamage < 0){
            return -1;
        } 
        
        return 0;

    }
    
    
    public static int trapControl(int Health, int Trap, int Level){
        if (Health <= 0 || Health > 100){
            return -1;
        }
        
        if (Trap <= 0 || Trap > 10){
            return -1;
        }

        if (Level <= 0 || Level > 10){
            return -1;
        }
        
        int TrapDamage = Health - (Trap * (Level / 3));
        
        if (TrapDamage < 0){
            return -1;
        }
        return TrapDamage;
        
    }

}