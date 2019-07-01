/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing.pkgclass;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sp16-bse-071
 */
public class CalculaterTest {
    
    Calculater obj =new Calculater();
    public CalculaterTest() {
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
     * Test of Add method, of class Calculater.
     */
    @Test
    public void testAdd() {
       
        assertEquals(9,obj.Add(5, 4));
    }

    /**
     * Test of Sub method, of class Calculater.
     */
    @Test
    public void testSub() {
         assertEquals(10,obj.Sub(19, 9));
    }

    /**
     * Test of Div method, of class Calculater.
     */
    @Test
    public void testDiv() {
       assertEquals(1,obj.Div(19, 10));
    }

    /**
     * Test of Mul method, of class Calculater.
     */
    @Test
    public void testMul() {
         assertEquals(9,obj.Mul(3, 3));
    }
    
}
