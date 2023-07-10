package com.adeelaslam;

public class Histogram {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int [] a = {3, 7, 4, 1, 6, 7, 8, 4};
        System.out.println("Histogram returned ");
        for(int i : histogram(a, 10)) {
            System.out.print("" + i + " ");
        }

    }
    public static int[] histogram(int[] a, int M) {
        int[] result = new int[M];
        for(int i = 0; i < M; i++) {
            result[i] = getFrequency(a, i);
        }
        return result;
    }
    
    public static int getFrequency(int[] array, int value) {
        int frequency = 0;
        for(int i : array) {
            if(i == value) {
                frequency++;
            }
        }
        return frequency;
    }

}
