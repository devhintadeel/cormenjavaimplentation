package com.adeelaslam;

public class Transposition {

    public static void main(String[] args) {
        int [][] matrix = {{1, 2}, {3, 4}};
        printMatrix(matrix);
        printMatrix(transpose(matrix));
    }
    
    public static int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];
        
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
    public static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print("" + matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
