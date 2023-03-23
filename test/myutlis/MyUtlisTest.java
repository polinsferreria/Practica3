/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package myutlis;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pol^^
 */
public class MyUtlisTest {
    
    public MyUtlisTest() {
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
     * Test of inverteix method, of class MyUtlis.
     */
    @Test
    public void testInverteix() {
        System.out.println("inverteix");
        String cadena = "Hola Mundo";
        String expResult = "OdnuM aloH";//expectativa
        String result = MyUtlis.inverteix(cadena);
        assertEquals(expResult, result);//realidad
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edat method, of class MyUtlis.
     */
    @Test
    public void testEdat() {
        System.out.println("edat");
        int day = 19;
        int month = 8;
        int year = 2003;
        int expResult = 19;//expectativa
        int result = MyUtlis.edat(day, month, year);
        assertEquals(expResult, result);//realidad
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of factorial method, of class MyUtlis.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        int numero = 5;
        int expResult = 120;//expectativa
        int result = MyUtlis.factorial(numero);
        assertEquals(expResult, result);//realidad
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
