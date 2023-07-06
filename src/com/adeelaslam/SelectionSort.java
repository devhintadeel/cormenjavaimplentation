package com.adeelaslam;

public class SelectionSort {

    public static void main(String[] args) {
        int[] A = {3, 7, 4, 1, 6, 7, 8, 4};
        printArray(A);
        selectionSort(A);
        printArray(A);
    }
    
    public static void selectionSort(int[] A) {
        int smallest = -1;
        for(int j = 0; j < A.length; j++) {
            smallest = j;
            for(int i = j + 1; i < A.length; i++) {
                if(A[i] < A[smallest]) {
                    smallest = i;
                }
                exchange(A, j, smallest);
            }
        }
    }
    public static void exchange(int[] A, int index1, int index2) {
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }
    
    public static void printArray(int [] A) {
        System.out.println("Sorted array: ");
        for(int i : A) {
            System.out.print("" + i + " ");
        }
        System.out.println();
    }

}
