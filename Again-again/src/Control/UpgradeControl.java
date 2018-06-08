/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author Levi
 */
public class UpgradeControl {
    public static int upgradeControl(int CurrentHealth, int PlayerLevel, int MonsterValue){
    
        if (CurrentHealth < 1 || CurrentHealth > 100){
            System.out.println("Out of boundary");
            return -1;
        }
        
        if (PlayerLevel < 1 || PlayerLevel > 10){
            System.out.println("Out of boundary");
            return -1;
        }
        
        if (MonsterValue < 1 || MonsterValue > 10){
            System.out.println("Out of boundary");
            return -1;
        }
    int Upgrade = CurrentHealth + PlayerLevel + (MonsterValue/2);
    
    if (Upgrade < 1){
        return -1;
    
    }
    return Upgrade;
    }
}
