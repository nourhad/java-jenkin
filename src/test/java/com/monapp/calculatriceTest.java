package com.monapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class calculatriceTest {
    calculatrice calc = new calculatrice();
    
    // Tests RÉUSSIS
    @Test
    void testAdditionReussi() {
        assertEquals(8, calc.addition(5, 3));
    }
    
    @Test
    void testEstPairReussi() {
        assertTrue(calc.estPair(10));
    }
    
    // // Tests ÉCHOUÉS
    // @Test
    // void testDivisionEchoue() {
    //     assertEquals(3, calc.division(10, 2)); // 10/2=5, pas 3
    // }
    
    // @Test
    // void testAdditionEchoue() {
    //     assertEquals(5, calc.addition(2, 2)); // 2+2=4, pas 5
    // }
}