package com.adeelaslam;

public class MergeSortWithoutSentinels {

    public static void main(String[] args) {
        int[] A = {3, 7, 4, 1, 6, 7, 8, 4};
        printArray("Unsorted", A);
        mergeSort(A, 0, A.length - 1);
        printArray("sorted", A);
    }
    
    public static void merge(int[] A, int p, int q, int r) {
        int n1 = (q - p) + 1;
        int n2 = (r - (q + 1)) + 1;
        
        int[] L = new int[n1];
        int[] R = new int [n2];
        
        
        for(int i = 0; p + i <= q; i++) {
            L[i] = A[p + i];
        }
        for(int j = 0; q + 1 + j <= r; j++) {
            R[j] = A[q + 1 + j];
        }

        
        int i = 0;
        int j = 0;
        for(int k = p; k <= r; k++) {
            if(i == L.length) {
                for(; j < R.length; j++)
                    A[k] = R[j];
                break;
            }
            if(j == R.length) {
                for(; i < L.length; i++)
                    A[k] = L[i];
                break;
            }

            if(L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            }else {
                A[k] = R[j];
                j = j + 1;
            }
        }
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
