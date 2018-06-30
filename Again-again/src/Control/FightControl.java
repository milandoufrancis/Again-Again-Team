/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author My Laptop
 */
public class FightControl {
    public static int fightControl(int Health, int Defense, int Weapon){
        if (Health <= 0 || Health > 100){
            return -1;
        }
        
        if (Defense < 0 || Defense > 80){
            return -1;
        }
        
        if (Weapon < 0 || Weapon > 40){
            return -1;
        }
        
        int Attack = Health - (Weapon / Defense);
        
        if (Attack < 0){
            return -1;
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