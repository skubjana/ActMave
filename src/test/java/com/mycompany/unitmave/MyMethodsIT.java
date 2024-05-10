/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.unitmave;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author skubjana
 */
public class MyMethodsIT {
    
    public MyMethodsIT() {
    }

    /**
     * Test of checkName method, of class MyMethods.
     */
    @org.junit.jupiter.api.Test
    public void testCheckName() {
        System.out.println("Tests checkName");
        String myStr = "Sammy is dope";
        
        MyMethods instance = new MyMethods();
        boolean expResult = true;
        
        boolean result = instance.checkName(myStr);
        assertEquals(expResult, result);

    }

    /**
     * Test of checkAge method, of class MyMethods.
     */
    @org.junit.jupiter.api.Test
    public void testCheckAge() {
        System.out.println("Test checkAge");
        int bYear = 2000;
        MyMethods instance = new MyMethods();
        boolean expResult = true;
        boolean result = instance.checkAge(bYear);
        assertEquals(expResult, result);

    }
    
}
