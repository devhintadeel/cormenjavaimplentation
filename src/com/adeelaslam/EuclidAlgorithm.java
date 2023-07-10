package com.adeelaslam;

import java.util.Scanner;

import com.adeelaslam.SelectionSort;

public class EuclidAlgorithm {

    public static void main(String[] args) {
        int n1, n2;
        System.out.print("Enter a number : " );
        Scanner scanner = new Scanner(System.in);
        n1 = scanner.nextInt();
        System.out.print("Enter a number : " );
        n2 = scanner.nextInt();
        System.out.println("GCD of 5, 9 is " + gcd(n1, n2));
        System.out.println("GCD of 15, 90 is " + gcd(15, 90));
    }
    
    public static int gcd(int p, int q) {
        if(q == 0)
            return p;
        int r = p % q;
        return gcd(q, r);
    }
}
