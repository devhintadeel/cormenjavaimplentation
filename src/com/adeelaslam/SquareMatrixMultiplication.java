package com.adeelaslam;

public class SquareMatrixMultiplication {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
    
    public static int[][] squareMatrixMultiply(int [][] a, int[][] b){
        int [][] c = new int[a.length][a.length];        
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length; j++) {
                c[i][j] = 0;
                for(int k = 0; k < a.length; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }
    
    public static int[][] squareMatrixMultiplyRecursive(int [][] a, int[][] b){
        int [][] c = new int[a.length][a.length];        
        if(a.length == 1) {
            c[0][0] = a[0][0] * b[0][0];
        }else {
//            c[0][0] = squareMatrixMultiplyRecursive(a[0][0], b[0][0]) + squareMatrixMultiplyRecursive(a[0][1], b[1][0]);
        }
        return c;
    }

}
