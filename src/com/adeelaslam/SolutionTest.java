package com.adeelaslam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void testRemoveDuplicates() {
        Solution objSolution = new Solution();
        int[] nums = {1, 1, 2}; // Input array
        int[] expectedNums = {1, 2}; // The expected answer with correct length

        int k = objSolution.removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
        
        int[] nums1 = {0,0,1,1,1,2,2,3,3,4}; // Input array
        int[] expectedNums1 = {0, 1, 2, 3, 4}; // The expected answer with correct length

        int k1 = objSolution.removeDuplicates(nums1); // Calls your implementation

        assert k1 == expectedNums1.length;
        for (int i = 0; i < k1; i++) {
            assert nums1[i] == expectedNums1[i];
        }
        
        int[] nums2 = {1}; // Input array
        int[] expectedNums2 = {1}; // The expected answer with correct length

        int k2 = objSolution.removeDuplicates(nums2); // Calls your implementation

        assert k2 == expectedNums2.length;
        for (int i = 0; i < k2; i++) {
            assert nums2[i] == expectedNums2[i];
        }
        
        
        // Test case 3 
        int[] nums3 = {1}; // Input array
        int[] expectedNums3 = {1}; // The expected answer with correct length

        int k3 = objSolution.removeDuplicates(nums3); // Calls your implementation

        assert k3 == expectedNums3.length;
        for (int i = 0; i < k3; i++) {
            assert nums3[i] == expectedNums3[i];
        }

    }

}
