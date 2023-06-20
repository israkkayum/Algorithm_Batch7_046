package com.mycompany.algorithm_final_project;

import java.util.Scanner;

/**
 *
 * @author israkkayumchowdhury
 */
public class EuclideanGCD {

    // b -> divisor, a -> divident
    public int gcd(int a, int b) {

        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public void main_func() {
        Scanner s = new Scanner(System.in);
        System.out.print(" Enter two numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();

        int result = gcd(a, b);

        System.out.println(" GCD of " + a + " and " + b + " is " + result);
    }

}
