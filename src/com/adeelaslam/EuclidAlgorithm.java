package com.adeelaslam;

import com.adeelaslam.SelectionSort;

public class EuclidAlgorithm {

    public static void main(String[] args) {
        System.out.println("GCD of 5, 9 is " + gcd(5, 9));
        System.out.println("GCD of 15, 90 is " + gcd(15, 90));
    }
    
    public static int gcd(int p, int q) {
        if(q == 0)
            return p;
        int r = p % q;
        return gcd(q, r);
    }
}
