/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baoanh.math.util.core;

/**
 *
 * @author Dell
 */
public class MathUtil {
    public static long getFactorial(int n) {
        long result = 1;
        
        if (n < 0 || n > 20) throw new IllegalArgumentException("Agrument out of bound!");
        
        if (n == 0 || n == 1) return 1;
        
        for (int i = 2; i <= n; ++i) result *= i;
        
        return result;
    }
}
