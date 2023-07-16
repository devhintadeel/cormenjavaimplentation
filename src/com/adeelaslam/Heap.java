package com.adeelaslam;

import java.util.Arrays;
import java.util.Stack;

// Array Implementation of Heap in Java according to CLRS
public class Heap {
    
    private int[] heapArray = {3, 7, 4, 1, 6, 7, 8, 4};
    
    public int parent(int index) {
        return (int)Math.floor((index -1) / 2);
    }
    
    public int left(int index) {
        return (2 * index) + 1;
    }

    public int right(int index) {
        return (2 * index) + 2;
    }
    
    
    public void maxHeapify(int [] A, int index) {
        int l = left(index);
        int r = right(index);
        int largest = Integer.MIN_VALUE;
        if(l <= A.length && A[l] > A[index]) {
            largest = l;
        }else {
            largest = index;
        }
        if(r <= A.length && A[r] > A[largest]) {
            largest = r;
        }
        if(largest != r) {
            SelectionSort.exchange(A, index, largest);
            maxHeapify(A, largest);
        }
    }
    
// Max Heap a[parent(index)] >= a[index]
    // largest element in a max heap is stored at the root. 
 // Min Heap a[parent(index)] <= a[index]
    
    // Smallest element in a min heap is at the root
    
    public static void main(String[] args) {
        Heap objHeap = new Heap();
        System.out.println("Parent of index 1 is " + objHeap.parent(1));
        System.out.println("Parent of index 2 is " + objHeap.parent(2));
        System.out.println("Parent of index 3 is " + objHeap.parent(3));
        System.out.println("Parent of index 4 is " + objHeap.parent(4));
        System.out.println("Parent of index 5 is " + objHeap.parent(5));
        System.out.println("Parent of index 6 is " + objHeap.parent(6));
        
        
        
        System.out.println("Left index of 0 is " + objHeap.left(0));
        System.out.println("Left index of 1 is " + objHeap.left(1));
        System.out.println("Left index of 4 is " + objHeap.left(4));
               
        System.out.println("Right index of 0 is " + objHeap.right(0));
        System.out.println("Right index of 1 is " + objHeap.right(1));
        System.out.println("Right index of 4 is " + objHeap.right(4));
               
        SelectionSort.printArray(objHeap.heapArray);
        objHeap.maxHeapify(objHeap.heapArray, 0);
        System.out.println("After max heapify is applied " + Arrays.toString(objHeap.heapArray));
    }
}
