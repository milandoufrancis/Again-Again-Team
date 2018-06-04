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

    /**
     * Test of trapcontrol method, of class FightControl.
     */
    @Test
    public void testTrapcontrol() {
        System.out.println("test 1");
        double Health = 80.0;
        double Trap = 6.0;
        double Level = 10.0;
        double expResult = 60.0;
        double result = FightControl.trapcontrol(Health, Trap, Level);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("test 2");
         Health = 102.0;
         Trap = 8.0;
         Level = 4.0;
         expResult = -1;
         result = FightControl.trapcontrol(Health, Trap, Level);
        assertEquals(expResult, result, 0.0);
        
        
        System.out.println("test 3");
         Health = 92.0;
         Trap = 0.0;
         Level = 3.0;
         expResult = -1;
         result = FightControl.trapcontrol(Health, Trap, Level);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("test 4");
         Health = 96.0;
         Trap = 4.0;
         Level = -1.0;
         expResult = -1;
         result = FightControl.trapcontrol(Health, Trap, Level);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("test 5");
         Health = 1.0;
         Trap = 1.0;
         Level = 1.0;
         expResult = 0.66666667;
         result = FightControl.trapcontrol(Health, Trap, Level);
        assertEquals(expResult, result, 0.1);
        
        System.out.println("test 6");
         Health = 100.0;
         Trap = 10.0;
         Level = 10.0;
         expResult = 66.6666667;
         result = FightControl.trapcontrol(Health, Trap, Level);
        assertEquals(expResult, result, 0.1);
    }

}
