/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package clases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alejandro
 */
public class ElectrodomesticoTest {
    
    public ElectrodomesticoTest() {
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
     * Test of comprobarconsumo method, of class Electrodomestico.
     */
    @Test
    public void testComprobarconsumo() {
        System.out.println("comprobarconsumo");
        Electrodomestico instance = new Electrodomestico();
        instance.comprobarconsumo();
        
    }

    /**
     * Test of comprobarcolor method, of class Electrodomestico.
     */
    @Test
    public void testComprobarcolor() {
        System.out.println("comprobarcolor");
        Electrodomestico instance = new Electrodomestico();
        instance.comprobarcolor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preciofinal method, of class Electrodomestico.
     */
    @Test
    public void testPreciofinal() {
        System.out.println("preciofinal");
        Electrodomestico instance = new Electrodomestico();
        instance.preciofinal();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
