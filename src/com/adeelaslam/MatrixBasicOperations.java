package com.adeelaslam;

import com.adeelaslam.Transposition;

public class MatrixBasicOperations {

    public static void main(String[] args) {
        double[] x = {1, 2, 3};
        double[] y= {2, 4, 6};
        System.out.println("Results of dot product : " + dot(x, y));

    }
    public static double dot(double[] x, double[] y) {
        double sum = 0.0;
        for(int i = 0; i < x.length; i++) {
            sum += x[i] * y[i];
        }
        return sum;
    }
    public static double[][] mult(double[][] a, double[][] b){
     // To multiply matrixes the number of columns in the first matrix must be the same
        // as the number of rows on the second matrix
        if (a == null || b == null || a.length == 0 || b.length == 0 || a[0].length != b.length) {
            throw new IllegalArgumentException();
        }

        // Result will always have the same number of rows as the first matrix and
        // the same number of columns as the second matrix
        double[][] c = new double[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }
    public static int[][] transpose(int[][] a){
        return Transposition.transpose(a);
        
    }
    public static double[]  mult(double[][] a, double[] x){
     // Number of columns in matrix must be the same as the number of elements in vector
        if (a == null || x == null || a[0].length != x.length) {
            throw new IllegalArgumentException();
        }

        double[] b = new double[a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < x.length; j++) {
                b[i] += a[i][j] * x[j];
            }
        }
        return b;
        
    }
    public static double[]  mult(double[] y, double[][] a){
     // Number of rows in matrix must be the same as the number of elements in vector
        if (a == null || y == null || a.length != y.length) {
            throw new IllegalArgumentException();
        }
        double[] b = new double[a[0].length];

        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < y.length; j++) {
                b[i] += a[j][i] * y[j];
            }
        }
        return b;
        
    }
}
