/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author My Laptop
 */
public class FightControlTest {
    
    public FightControlTest() {
    }

    /**
     * Test of fightControl method, of class FightControl.
     */
    @Test
    public void testFightControl() {
        System.out.println("Test 1");
        double Health = 80.0;
        double Defense = 5.0;
        double Weapon = 20.0;
        double expResult = 76.0;
        double result = FightControl.fightControl(Health, Defense, Weapon);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test 2");
        Health = 60.0;
        Defense = 6.0;
        Weapon = 24.0;
        expResult = 56.0;
        result = FightControl.fightControl(Health, Defense, Weapon);
        assertEquals(expResult, result, 0.0);
       
        System.out.println("Test 3");
        Health = -1.0;
        Defense = 32.3;
        Weapon = 25.5;
        expResult = -1;
        result = FightControl.fightControl(Health, Defense, Weapon);
        assertEquals(expResult, result, 0.0);
       
       
    }
    
}
