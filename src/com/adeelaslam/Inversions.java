package com.adeelaslam;

public class Inversions {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = {2, 3, 8, 6, 1};
        
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(i < j && nums[i] > nums[j]) {
                    System.out.println("Pair is an inversion (" + nums[i] + ", " + nums[j] + ")");
                }
            }
        }

    }

}
