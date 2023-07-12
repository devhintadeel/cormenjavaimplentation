package com.adeelaslam;

import com.adeelaslam.EuclidAlgorithm;

public class CommonFactors {

    public static void main(String[] args) {
        int [][] matrix = {{3, 7}, {4, 1}};
        boolean [][] toReturn = new boolean[matrix.length][matrix.length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) { // it is a N X N matrix
                if(EuclidAlgorithm.gcd(i, j) == 1) {
                    toReturn[i][j] = true;
                }else {
                    toReturn[i][j] = false;

                }
            }
        }
    }
 }
