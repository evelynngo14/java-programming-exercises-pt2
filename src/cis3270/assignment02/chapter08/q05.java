package cis3270.assignment02.chapter08;
//(Algebra: add two matrices) Write a method to add two matrices.
// test inputs:
// matrix1: 1 2 3 4 5 6 7 8 9
// matrix2: 0 2 4 1 4.5 2.2 1.1 4.3 5.2

import java.util.Scanner;
public class q05 {

    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        System.out.println("Enter matrix1: ");
        double[][] matrix1 = matrixInput(row, col);
        System.out.println("Enter matrix2: ");
        double[][] matrix2 = matrixInput(row, col);

        double[][] sumMatrix = addMatrices(matrix1, matrix2, row, col);
        System.out.println(displaySum(matrix1, matrix2, sumMatrix, row, col));
    }

    public static double[][] addMatrices(double[][] m1, double[][] m2, int row, int col) {
        double[][] sumMatrix = new double[row][col];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                sumMatrix[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return sumMatrix;
    }
    public static String displaySum(double[][] m1, double[][] m2, double[][] m3, int row, int col) {
        String displaySum = new String("");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                displaySum += String.format("%5.1f", m1[i][j]);
            }
            displaySum += (i == 1 ? "   +   " : "       ");
            for (int j = 0; j < col; j++) {
                displaySum += String.format("%5.1f", m2[i][j]);
            }
            displaySum += (i == 1 ? "   =   " : "       ");

            for (int j = 0; j < col; j++) {
                displaySum += String.format("%7.1f", m3[i][j]);
            }
            displaySum += "\n";
        }
        return displaySum;
    }
    public static double[][] matrixInput(int row, int col) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }

}


