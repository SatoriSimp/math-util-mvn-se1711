/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baoanh.math.util.core.test;
import static com.baoanh.math.util.core.MathUtil.getFactorial;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Dell
 */
public class MathUtilityTest {
    
    @Test
    public void testFactorialGivenRightArgument0RunsWell() {
        // Test case #1: Check if factorial runs well with n = 0
        // Steps:
        // - Given n = 0
                
        long expected = 1;
        int n = 0;
        long actual = getFactorial(n);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFactorialGivenRightArgument1RunsWell() {
        long expected = 1;
        int n = 1;
        long actual = getFactorial(n);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFactorialGivenRightArgument2RunsWell() {
        final long expected = 2;
        int n = 2;
        long actual = getFactorial(n);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFactorialGivenRightArgument3RunsWell() {
        final long expected = 6;
        int n = 3;
        long actual = getFactorial(n);
        assertEquals(expected, actual);
    }
}
