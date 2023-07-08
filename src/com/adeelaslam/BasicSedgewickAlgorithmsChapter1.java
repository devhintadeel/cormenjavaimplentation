package com.adeelaslam;

public class BasicSedgewickAlgorithmsChapter1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        // Copy to another array
        

    }
    public static double findMax(double[] a) {
        double max = a[0];
        for(int i = 1; i < a.length; i++)
            if(a[i] > max)
                max = a[i];
        return max;
    }
    public static double computeAverage(double[] a) {
        int n = a.length;
        double sum = 0.0;
        for(int i = 0; i < n; i++)
            sum += a[i];
        double average = sum / n;
        return average;
    }
    public static void copyToAnotherArray(double[] a) {
        int N = a.length;
        double[] b = new double[N];
        for(int i = 0; i < N; i++) {
            b[i] = a[i];
        }
    }
    public void reverseArray(double[] a) {
        int N = a.length;
        for(int i = 0; i < N/2; i++) {
            double temp = a[i];
            a[i] = a[N - 1 -i];
            a[N-i-1] = temp;
        }
    }
    public void matrixMultiplication(double[][] a, double[][] b) {
        int N = a.length;
        double[][] c = new double[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                for(int k = 0; k < N; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }
}
