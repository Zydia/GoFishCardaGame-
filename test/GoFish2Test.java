/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class GoFish2Test {
    
    public GoFish2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class GoFish2.
     
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GoFish2.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of testDecks method, of class GoFish2.
     */
    @Test
    public void testTestDecks() {
        System.out.println("testDecks");
        GoFish2.testDecks();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of testDeck method, of class GoFish2.
     */
    @Test
    public void testTestDeck() {
        System.out.println("testDeck");
        Deck deck = null;
        boolean expResult = false;
        boolean result = GoFish2.testDeck(deck);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
