package com.adeelaslam;

public class InsertionSortDescending {

    public static void main(String[] args) {
        int[] A = {3, 7, 4, 1, 6, 7, 8, 4};
        printArray("unsorted",  A);
        insertionSort(A);
        printArray("sorted", A);
    }
    
    public static void insertionSort(int[] A) {
       int key = -1;
       int i = -1;
       for(int j = 1; j < A.length; j++) {
           key = A[j];
           i = j - 1;
           while(i > -1 && A[i] < key) {
               A[i+1] = A[i];
               i = i - 1;
           }
           A[i+1] = key;
       }
    }
    
    public static void printArray(String state, int [] A) {
        System.out.println(state + " array: ");
        for(int i : A) {
            System.out.print("" + i + " ");
        }
        System.out.println();
    }

}
