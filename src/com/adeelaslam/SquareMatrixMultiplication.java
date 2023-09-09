package com.adeelaslam;

import java.util.Arrays;

public class SquareMatrixMultiplication {

    public static void main(String[] args) {
        int[][] A = { { 1, 3 }, { 6, 8 } };
        int[][] B = { { 7, 5 }, { 4, 2 } };

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

    
    public static void strassenMatrixChainMultiplicationJoin(int[][] matrixToSplit, int[][] matrixToPopulateAfterCombine, int iB, int jB)
    {
        for (
                int i1 = 0, i2 = iB; i1 < matrixToSplit.length; i1++, i2++
        ) {

            for (
                    int j1 = 0, j2 = jB; j1 < matrixToSplit.length; j1++, j2++
            ) {

                matrixToPopulateAfterCombine[i2][j2] = matrixToSplit[i1][j1];
            }
        }
    }

    public static void strassenMatrixChainMultiplicationSplit(int[][] matrixToSplit, int[][] matrixToPopulateAfterSplit, int rowIndex, int columnIndex) {

        for (
                int rowLoopInvariant = 0, i2 = rowIndex; rowLoopInvariant < matrixToPopulateAfterSplit.length; rowLoopInvariant++, i2++
        )

            for (
                    int columnLoopInvariant = 0, j2 = columnIndex; columnLoopInvariant < matrixToPopulateAfterSplit.length; columnLoopInvariant++, j2++
            )

                matrixToPopulateAfterSplit[rowLoopInvariant][columnLoopInvariant] = matrixToSplit[i2][j2];
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

    public static int[][] squareMatrixMultiplyRecursive(int[][] operand1Matrix, int[][] operand2Matrix) {
        int squareMatrixSize = operand1Matrix.length;

        int[][] resultMatrix = new int[squareMatrixSize][squareMatrixSize];

        if (
            squareMatrixSize == 1
        ) {
            resultMatrix[0][0] = operand1Matrix[0][0] * operand2Matrix[0][0];
        } else {
            int[][] A11 = new int[squareMatrixSize / 2][squareMatrixSize / 2];
            int[][] A12 = new int[squareMatrixSize / 2][squareMatrixSize / 2];
            int[][] A21 = new int[squareMatrixSize / 2][squareMatrixSize / 2];
            int[][] A22 = new int[squareMatrixSize / 2][squareMatrixSize / 2];
            int[][] B11 = new int[squareMatrixSize / 2][squareMatrixSize / 2];
            int[][] B12 = new int[squareMatrixSize / 2][squareMatrixSize / 2];
            int[][] B21 = new int[squareMatrixSize / 2][squareMatrixSize / 2];
            int[][] B22 = new int[squareMatrixSize / 2][squareMatrixSize / 2];

            // Step 2: Dividing matrix A into 4 halves
            strassenMatrixChainMultiplicationSplit(operand1Matrix, A11, 0, 0);
            strassenMatrixChainMultiplicationSplit(operand1Matrix, A12, 0, squareMatrixSize / 2);
            strassenMatrixChainMultiplicationSplit(operand1Matrix, A21, squareMatrixSize / 2, 0);
            strassenMatrixChainMultiplicationSplit(operand1Matrix, A22, squareMatrixSize / 2, squareMatrixSize / 2);

            // Step 2: Dividing matrix B into 4 halves
            strassenMatrixChainMultiplicationSplit(operand2Matrix, B11, 0, 0);
            strassenMatrixChainMultiplicationSplit(operand2Matrix, B12, 0, squareMatrixSize / 2);
            strassenMatrixChainMultiplicationSplit(operand2Matrix, B21, squareMatrixSize / 2, 0);
            strassenMatrixChainMultiplicationSplit(operand2Matrix, B22, squareMatrixSize / 2, squareMatrixSize / 2);

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
            strassenMatrixChainMultiplicationJoin(C11, resultMatrix, 0, 0);
            strassenMatrixChainMultiplicationJoin(C12, resultMatrix, 0, squareMatrixSize / 2);
            strassenMatrixChainMultiplicationJoin(C21, resultMatrix, squareMatrixSize / 2, 0);
            strassenMatrixChainMultiplicationJoin(C22, resultMatrix, squareMatrixSize / 2, squareMatrixSize / 2);
        }

        return resultMatrix;
    }

}
