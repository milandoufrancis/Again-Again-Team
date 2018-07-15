/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Exeptions.FightControlException;

/**
 *
 * @author My Laptop
 */
public class FightControl {
    public static int takeDamage(int Health, int Defense, int Weapon)throws FightControlException{
        if (Health <= 0 || Health > 100){
            throw new FightControlException("The health cannot be negative, or greater than hundred");
        }
        
        if (Defense < 0 || Defense > 80){
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