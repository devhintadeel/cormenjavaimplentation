package com.adeelaslam;

import java.util.HashMap;
import java.util.Map;

public class FibonacciDP {
    Map<Integer, Integer> fibonacciCache = new HashMap<>();
    
    public int fibonacciDP(int n) {
        int result;
        if(fibonacciCache.containsKey(Integer.valueOf(n))) {
            return fibonacciCache.get(Integer.valueOf(n));
        }
        if(n == 0 || n == 1) {
            fibonacciCache.put(n, 1);
            return 1;
        }else {
            result = fibonacciDP(n - 2) + fibonacciDP(n - 1);
            fibonacciCache.put(n, result);
            return result;
        }
    }
    
    public int fibonacciDPBottomUp(int n) {
        int a = 1, b = 1;
        int temp = 0;
        if(n == 0 || n == 1) {
            a = 1;
            b = 1;
        }
        if( n > 1) {
            for(int i = 2; i <= n; i++) {
                temp = b;
                b = a + b;
                a = temp;
            }
        }
        return b;
    }
    
    public static void main(String[] args) {
        FibonacciDP objFibonacciDP = new FibonacciDP();
        System.out.println("Fibonacci Sequence for 0 to 25 ");
        for(int i = 0; i < 25; i++) {
            System.out.print(objFibonacciDP.fibonacciDPBottomUp(i) + " ");
        }
    }
}
