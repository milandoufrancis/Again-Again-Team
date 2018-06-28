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
        int Health = 80;
        int Defense = 5;
        int Weapon = 20;
        int expResult = 76;
        int result = FightControl.fightControl(Health, Defense, Weapon);
        assertEquals(expResult, result, 0.0);

        System.out.println("Test 2");
        Health = 60;
        Defense = 6;
        Weapon = 24;
        expResult = 56;
        result = FightControl.fightControl(Health, Defense, Weapon);
        assertEquals(expResult, result, 0.0);

        System.out.println("Test 3");
        Health = -1;
        Defense = 32;
        Weapon = 25;
        expResult = -1;
        result = FightControl.fightControl(Health, Defense, Weapon);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of trapControl method, of class FightControl.
     */
    @Test
    public void testTrapcontrol() {
        System.out.println("test 1");
        int Health = 80;
        int Trap = 6;
        int Level = 10;
        int expResult = 62;
        int result = FightControl.trapControl(Health, Trap, Level);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("test 2");
         Health = 102;
         Trap = 8;
         Level = 4;
         expResult = -1;
         result = FightControl.trapControl(Health, Trap, Level);
        assertEquals(expResult, result, 0.0);
        
        
        System.out.println("test 3");
         Health = 92;
         Trap = 0;
         Level = 3;
         expResult = -1;
         result = FightControl.trapControl(Health, Trap, Level);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("test 4");
         Health = 96;
         Trap = 4;
         Level = -1;
         expResult = -1;
         result = FightControl.trapControl(Health, Trap, Level);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("test 5");
         Health = 1;
         Trap = 1;
         Level = 1;
         expResult = 0;
         result = FightControl.trapControl(Health, Trap, Level);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("test 6");
         Health = 100;
         Trap = 10;
         Level = 10;
         expResult = 66;
         result = FightControl.trapControl(Health, Trap, Level);
        assertEquals(expResult, result, 0.0);
    }

}
