/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.math.util.mvn;

import com.baoanh.math.util.core.MathUtil;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class MathUtilMvn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: " + sc.nextInt());
        MathUtil.getFactorial(0);
    }
}
