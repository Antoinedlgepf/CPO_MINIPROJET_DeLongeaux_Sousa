/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mastermind_DeLongeaux_Sousa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author souse
 */
public class PartieTest {
    
    public PartieTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of initialiserPartie method, of class Partie.
     */
    @Test
    public void testInitialiserPartie() {
        System.out.println("initialiserPartie");
        Partie instance = new Partie();
        instance.initialiserPartie();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of debuterPartie method, of class Partie.
     */
    @Test
    public void testDebuterPartie() {
        System.out.println("debuterPartie");
        Partie instance = new Partie();
        instance.debuterPartie();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of etreGagnante method, of class Partie.
     */
    @Test
    public void testEtreGagnante() {
        System.out.println("etreGagnante");
        Partie instance = new Partie();
        boolean expResult = false;
        boolean result = instance.etreGagnante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nouveauTest method, of class Partie.
     */
    @Test
    public void testNouveauTest() {
        System.out.println("nouveauTest");
        Partie instance = new Partie();
        instance.nouveauTest();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nbJuste method, of class Partie.
     */
    @Test
    public void testNbJuste() {
        System.out.println("nbJuste");
        Partie instance = new Partie();
        int[] expResult = null;
        int[] result = instance.nbJuste();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
