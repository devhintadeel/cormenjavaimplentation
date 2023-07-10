package com.adeelaslam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.adeelaslam.MergeSort;

public class RemoveDuplicates {

    public static void main(String[] args) {
        
        int[] nums = {3, 7, 4, 1, 6, 7, 8, 4};
        
        MergeSort.printArray("Before sort ", nums);
        MergeSort.mergeSort(nums, 0, nums.length -1);
        
        MergeSort.printArray("After Merge sort ", nums);
        
        int[] distinctNumbers = removeDuplicates(nums);
        
        MergeSort.printArray("After duplicates removal from sorted data ", distinctNumbers);

    }
    public static int[] removeDuplicates(int[] nums) {
        Set<Integer> withoutDuplicates = new HashSet<Integer>();
        
        for(int i : nums) {
            withoutDuplicates.add(i);
        }
        
        int[] toReturn = new int[withoutDuplicates.size()];
        
        for(int i = 0; i < withoutDuplicates.size(); i++) {
            toReturn[i] = (int)withoutDuplicates.toArray()[i];
        }
        return toReturn;
    }
}
