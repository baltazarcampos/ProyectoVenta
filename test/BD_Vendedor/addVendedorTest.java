/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD_Vendedor;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Balta
 */
public class addVendedorTest {
    
    public addVendedorTest() {
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
     * Test of id_vendedor_auto method, of class addVendedor.
     */
    @Test
    public void testId_vendedor_auto() {
        System.out.println("id_vendedor_auto");
        addVendedor instance = null;
        int expResult = 0;
        int result = instance.id_vendedor_auto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class addVendedor.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        addVendedor.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
