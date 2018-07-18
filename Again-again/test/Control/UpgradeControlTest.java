/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Exeptions.UpgradeControlException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Levi
 */
public class UpgradeControlTest {
    
    public UpgradeControlTest() {
        
    }
    
    @Test
    public void testUpgradeControl() throws UpgradeControlException {
        System.out.println("Test 1");
        int CurrentHealth = 100;
        int PlayerLevel = 10;
        int MonsterValue = 10;
        int expResult = 115;
        int result = UpgradeControl.upgradeControl(CurrentHealth, PlayerLevel, MonsterValue);
        assertEquals (expResult, result, 0.0);
        
        System.out.println("Test 2");
         CurrentHealth = 100;
         PlayerLevel = 10;
         MonsterValue = 1;
         expResult = 110;
         result = UpgradeControl.upgradeControl(CurrentHealth, PlayerLevel, MonsterValue);
         assertEquals (expResult, result, 0.0);
         
         System.out.println("Test 3");
         CurrentHealth = 100;
         PlayerLevel = 1;
         MonsterValue = 10;
         expResult = 106;
         result = UpgradeControl.upgradeControl(CurrentHealth, PlayerLevel, MonsterValue);
         assertEquals (expResult, result, 0.0);
         
         System.out.println("Test 4");
         CurrentHealth = 101;
         PlayerLevel = 10;
         MonsterValue = 1;
         expResult = -1;
         result = UpgradeControl.upgradeControl(CurrentHealth, PlayerLevel, MonsterValue);
         assertEquals (expResult, result, 0.0);
         
         System.out.println("Test 5");
         CurrentHealth = 55;
         PlayerLevel = 6;
         MonsterValue = 11;
         expResult = -1;
         result = UpgradeControl.upgradeControl(CurrentHealth, PlayerLevel, MonsterValue);
         assertEquals (expResult, result, 0.0);
    }
    
    
}
