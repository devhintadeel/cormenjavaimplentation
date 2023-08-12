package com.adeelaslam;

import java.util.Arrays;

public class SquareMatrixMultiplication {

    public static void main(String[] args) {
        int[][] A = { { 1, 2 }, { 3, 4 } };
        int[][] B = { { 5, 6 }, { 7, 8 } };

        int[][] C = squareMatrixMultiplyRecursive(A, B);
        
        
        for (
                int i = 0; i < A.length; i++
        ) {
            System.out.println("Row " + (i + 1) + " is " + Arrays.toString(C[i]));
        }


        int[][] C1 = squareMatrixMultiply(A, B);

        for (
                int i = 0; i < A.length; i++
        ) {
            System.out.println("Row " + (i + 1) + " is " + Arrays.toString(C1[i]));
        }

 
    }

    public static int[][] squareMatrixMultiply(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a.length];
        for (
                int i = 0; i < a.length; i++
        ) {
            for (
                    int j = 0; j < a.length; j++
            ) {
                c[i][j] = 0;
                for (
                        int k = 0; k < a.length; k++
                ) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

    
    public static void strassenMatrixChainMultiplicationJoin(int[][] C, int[][] P, int iB, int jB)
    {
        for (
                int i1 = 0, i2 = iB; i1 < C.length; i1++, i2++
        ) {

            for (
                    int j1 = 0, j2 = jB; j1 < C.length; j1++, j2++
            ) {

                P[i2][j2] = C[i1][j1];
            }
        }
    }

    public static void strassenMatrixChainMultiplicationSplit(int[][] P, int[][] C, int iB, int jB) {

        for (
                int i1 = 0, i2 = iB; i1 < C.length; i1++, i2++
        )

            for (
                    int j1 = 0, j2 = jB; j1 < C.length; j1++, j2++
            )

                C[i1][j1] = P[i2][j2];
    }

    public static int[][] squareMatricesSubtraction(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        for (
                int i = 0; i < n; i++
        ) {
            for (
                    int j = 0; j < n; j++
            ) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }

        return C;
    }

    // Function to add two matrices
    public static int[][] squareMatricesAddition(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];

        for (
                int i = 0; i < n; i++
        ) {
            for (
                    int j = 0; j < n; j++
            ) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    public static int[][] squareMatrixMultiplyRecursive(int[][] A, int[][] B) {
        int n = A.length;

        int[][] R = new int[n][n];

        if (
            n == 1
        ) {
            R[0][0] = A[0][0] * B[0][0];
        } else {
            int[][] A11 = new int[n / 2][n / 2];
            int[][] A12 = new int[n / 2][n / 2];
            int[][] A21 = new int[n / 2][n / 2];
            int[][] A22 = new int[n / 2][n / 2];
            int[][] B11 = new int[n / 2][n / 2];
            int[][] B12 = new int[n / 2][n / 2];
            int[][] B21 = new int[n / 2][n / 2];
            int[][] B22 = new int[n / 2][n / 2];

            // Step 2: Dividing matrix A into 4 halves
            strassenMatrixChainMultiplicationSplit(A, A11, 0, 0);
            strassenMatrixChainMultiplicationSplit(A, A12, 0, n / 2);
            strassenMatrixChainMultiplicationSplit(A, A21, n / 2, 0);
            strassenMatrixChainMultiplicationSplit(A, A22, n / 2, n / 2);

            // Step 2: Dividing matrix B into 4 halves
            strassenMatrixChainMultiplicationSplit(B, B11, 0, 0);
            strassenMatrixChainMultiplicationSplit(B, B12, 0, n / 2);
            strassenMatrixChainMultiplicationSplit(B, B21, n / 2, 0);
            strassenMatrixChainMultiplicationSplit(B, B22, n / 2, n / 2);

            int[][] M1 = squareMatrixMultiplyRecursive(squareMatricesAddition(A11, A22), squareMatricesAddition(B11, B22));

            int[][] M2 = squareMatrixMultiplyRecursive(squareMatricesAddition(A21, A22), B11);

            int[][] M3 = squareMatrixMultiplyRecursive(A11, squareMatricesSubtraction(B12, B22));

            int[][] M4 = squareMatrixMultiplyRecursive(A22, squareMatricesSubtraction(B21, B11));

            int[][] M5 = squareMatrixMultiplyRecursive(squareMatricesAddition(A11, A12), B22);

            int[][] M6 = squareMatrixMultiplyRecursive(squareMatricesSubtraction(A21, A11), squareMatricesAddition(B11, B12));

            int[][] M7 = squareMatrixMultiplyRecursive(squareMatricesSubtraction(A12, A22), squareMatricesAddition(B21, B22));

            int[][] C11 = squareMatricesAddition(squareMatricesSubtraction(squareMatricesAddition(M1, M4), M5), M7);

            int[][] C12 = squareMatricesAddition(M3, M5);

            int[][] C21 = squareMatricesAddition(M2, M4);

            int[][] C22 = squareMatricesAddition(squareMatricesSubtraction(squareMatricesAddition(M1, M3), M2), M6);

            // Step 3: Join 4 halves into one result matrix
            strassenMatrixChainMultiplicationJoin(C11, R, 0, 0);
            strassenMatrixChainMultiplicationJoin(C12, R, 0, n / 2);
            strassenMatrixChainMultiplicationJoin(C21, R, n / 2, 0);
            strassenMatrixChainMultiplicationJoin(C22, R, n / 2, n / 2);
        }

        return R;
    }

}
