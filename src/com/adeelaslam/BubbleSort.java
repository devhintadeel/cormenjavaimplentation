package com.adeelaslam;

import com.adeelaslam.SelectionSort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] A = {3, 7, 4, 1, 6, 7, 8, 4};
        printArray(A);
        bubbleSort(A);
        printArray(A);
    }
    
    public static void bubbleSort(int[] A) {
        for(int i = 0;i < A.length; i++) {
            for(int j = A.length - 1; j >= i+1; j--) {
                if(A[j] < A[j - 1])
                    SelectionSort.exchange(A, j, j -1);
            }
        }
    }
    
    public static void printArray(int [] A) {
        System.out.println("Sorted array: ");
        for(int i : A) {
            System.out.print("" + i + " ");
        }
        System.out.println();
    }

}
