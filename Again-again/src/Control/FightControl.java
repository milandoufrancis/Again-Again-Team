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
    public static double fightControl(double Health, double Defense, double Weapon){
        if (Health <= 0 || Health > 100){
            return -1;
        }
        
        if (Defense < 0 || Defense > 80){
            return -1;
        }
        
        if (Weapon < 0 || Weapon > 40){
            return -1;
        }
        
        double Attack = Health - (Weapon / Defense);
        
        if (Attack < 0){
            return -1;
        }
        return Attack;
    }
}
    
//    }
//    public static void trapcontrol(){
//        
//    }
