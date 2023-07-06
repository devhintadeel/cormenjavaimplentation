package com.adeelaslam;

public class MergeSort {

    public static void main(String[] args) {
        int[] A = {3, 7, 4, 1, 6, 7, 8, 4};
        printArray("Unsorted", A);
        mergeSort(A, 0, A.length - 1);
        printArray("sorted", A);
    }
    
    public static void merge(int[] A, int p, int q, int r) {
        System.out.println("Called merge with p, q and r : " + p + ", " + q + ", " + r);
        printArray("Merge Enter : ", A);
        int n1 = (q - p) + 1 + 1;
        int n2 = (r - (q + 1)) + 1 + 1;
        
        int[] L = new int[n1];
        int[] R = new int [n2];
        
        
        for(int i = 0; p + i <= q; i++) {
            L[i] = A[p + i];
        }
        for(int j = 0; q + 1 + j <= r; j++) {
            R[j] = A[q + 1 + j];
        }

        L[n1 -1] = Integer.MAX_VALUE;
        R[n2 -1] = Integer.MAX_VALUE;
        
        int i = 0;
        int j = 0;
        for(int k = p; k <= r; k++) {
            if(L[i] <= R[j]) {
                if(L[i] == Integer.MAX_VALUE) {
                    break;
                }
                A[k] = L[i];
                i++;
            }else {
                if(R[j] == Integer.MAX_VALUE)
                    break;
                A[k] = R[j];
                j = j + 1;
            }
        }
        printArray("At the end of merge Being sorted : ", A);

    }
    
    public static void mergeSort(int[] A, int p, int r) {
        int q = -1;
        if(p < r) {
            q = (int) Math.floor((p + r) / 2);
            mergeSort(A, p, q);
            mergeSort(A, q+1, r);
            merge(A, p, q, r);
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
