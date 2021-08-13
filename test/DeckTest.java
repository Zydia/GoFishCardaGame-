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
public class DeckTest {
    
    public DeckTest() {
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
     * Test of fillDeck method, of class Deck.
     */
    @Test
    public void testFillDeck() {
        System.out.println("fillDeck");
        Deck instance = new Deck();
        instance.fillDeck();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of insertCard method, of class Deck.
     */
    @Test
    public void testInsertCard() {
        System.out.println("insertCard");
        Card card = null;
        Deck instance = new Deck();
        instance.insertCard(card);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteValue method, of class Deck.
     */
    @Test
    public void testDeleteValue() {
        System.out.println("deleteValue");
        int value = 0;
        Deck instance = new Deck();
        Card expResult = null;
        Card result = instance.deleteValue(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAnyCard method, of class Deck.
     */
    @Test
    public void testDeleteAnyCard() {
        System.out.println("deleteAnyCard");
        Deck instance = new Deck();
        Card expResult = null;
        Card result = instance.deleteAnyCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkBookBegginingDeal method, of class Deck.
     */
    @Test
    public void testCheckBookBegginingDeal() {
        System.out.println("checkBookBegginingDeal");
        Deck instance = new Deck();
        int expResult = 0;
        int result = instance.checkBookBegginingDeal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getCount method, of class Deck.
     */
    @Test
    public void testGetCount() {
        System.out.println("getCount");
        int value = 0;
        Deck instance = new Deck();
        int expResult = 0;
        int result = instance.getCount(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class Deck.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        Deck instance = new Deck();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Deck.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Deck instance = new Deck();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
