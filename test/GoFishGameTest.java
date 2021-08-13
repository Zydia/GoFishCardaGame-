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
public class GoFishGameTest {
    
    public GoFishGameTest() {
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
     * Test of lobby method, of class GoFishGame.
     */
    @Test
    public void testLobby() {
        System.out.println("lobby");
        GoFishGame instance = new GoFishGame();
        instance.lobby();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of playGoFish method, of class GoFishGame.
     */
    @Test
    public void testPlayGoFish() {
        System.out.println("playGoFish");
        GoFishGame instance = new GoFishGame();
        instance.playGoFish();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of initializeStartingHands method, of class GoFishGame.
     */
    @Test
    public void testInitializeStartingHands() {
        System.out.println("initializeStartingHands");
        GoFishGame instance = new GoFishGame();
        instance.initializeStartingHands();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkBegginingDeal method, of class GoFishGame.
     */
    @Test
    public void testCheckBegginingDeal() {
        System.out.println("checkBegginingDeal");
        GoFishGame instance = new GoFishGame();
        instance.checkBegginingDeal();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of userTurn method, of class GoFishGame.
     */
    @Test
    public void testUserTurn() {
        System.out.println("userTurn");
        GoFishGame instance = new GoFishGame();
        instance.userTurn();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of compTurn method, of class GoFishGame.
     */
    @Test
    public void testCompTurn() {
        System.out.println("compTurn");
        GoFishGame instance = new GoFishGame();
        instance.compTurn();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkForGameOver method, of class GoFishGame.
     */
    @Test
    public void testCheckForGameOver() {
        System.out.println("checkForGameOver");
        GoFishGame instance = new GoFishGame();
        instance.checkForGameOver();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of displayWinner method, of class GoFishGame.
     */
    @Test
    public void testDisplayWinner() {
        System.out.println("displayWinner");
        GoFishGame instance = new GoFishGame();
        instance.displayWinner();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of yesNo method, of class GoFishGame.
     */
    @Test
    public void testYesNo() {
        System.out.println("yesNo");
        GoFishGame instance = new GoFishGame();
        String expResult = "";
        String result = instance.yesNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of pause method, of class GoFishGame.
     */
    @Test
    public void testPause() {
        System.out.println("pause");
        GoFishGame instance = new GoFishGame();
        instance.pause();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
