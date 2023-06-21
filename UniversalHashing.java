
package com.mycompany.algorithm_final_project;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author israkkayumchowdhury
 */

class UniHashing {
    private int prime;
    private int[] coefficients;
    private Random random;

    public UniHashing(int prime, int universeSize) {
        this.prime = prime;
        coefficients = new int[2];
        random = new Random();

        generateCoefficients(universeSize);
    }

    private void generateCoefficients(int universeSize) {
        coefficients[0] = random.nextInt(prime - 1) + 1;
        coefficients[1] = random.nextInt(prime);

        if (universeSize > prime)
            generateCoefficients(universeSize);
    }

    public int hash(int key) {
        int coefficientA = coefficients[0];
        int coefficientB = coefficients[1];

        return ((coefficientA * key + coefficientB) % prime) % coefficients.length;
    }
}

public class UniversalHashing {
    
    public void main_func(){
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter the size of the universe: ");
        int universeSize = scanner.nextInt();

        System.out.print(" Enter a prime number greater than the universe size: ");
        int prime = scanner.nextInt();

         UniHashing hashing = new UniHashing(prime, universeSize);

        System.out.print(" Enter a key to hash: ");
        int key = scanner.nextInt();

        int hashValue = hashing.hash(key);
        System.out.println(" Key: " + key + " -> Hash Value: " + hashValue);
    
    }
}
