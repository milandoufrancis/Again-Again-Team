/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Exeptions.UpgradeControlException;

/**
 *
 * @author Levi
 */
public class UpgradeControl {
    public static int upgradeControl(int CurrentHealth, int PlayerLevel, int MonsterValue) throws UpgradeControlException{
    
        if (CurrentHealth < 1 || CurrentHealth > 100){
            System.out.println("Out of boundary");
            throw new UpgradeControlException("Current health cannot be negative or greater than 100");
        }
        
        if (PlayerLevel < 1 || PlayerLevel > 10){
            System.out.println("Out of boundary");
            throw new UpgradeControlException("Player's level cannot be negative or be greater than 10"); 
        }
        
        if (MonsterValue < 1 || MonsterValue > 10){
            System.out.println("Out of boundary");
            throw new UpgradeControlException("Monster's value cannot be zero, negative or be greater than 10");
        }
    int Upgrade = CurrentHealth + PlayerLevel + (MonsterValue/2);
    
    if (Upgrade < 1){
        throw new UpgradeControlException("The upgrade value can't be negative.");
    
    }
    return Upgrade;
    }
}
