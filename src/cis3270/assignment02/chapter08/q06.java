package cis3270.assignment02.chapter08;
//(Algebra: multiply two matrices) Write a method to multiply two matrices.
// test inputs:
// matrix1: 1 2 3 4 5 6 7 8 9
// matrix2: 0 2 4 1 4.5 2.2 1.1 4.3 5.2

import static cis3270.assignment02.chapter08.q05.matrixInput;

public class q06 {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        System.out.println("Enter matrix1: ");
        double[][] matrix1 = matrixInput(row, col);
        System.out.println("Enter matrix2: ");
        double[][] matrix2 = matrixInput(row, col);

        double[][] matrix3 = multiplyMatrix(matrix1, matrix2);

        System.out.println(displayMatrices(matrix1, matrix2, matrix3, row, col));

    }
    public static double[][]
        multiplyMatrix(double[][] a, double[][] b) {
            double[][] solutionMatrix = new double[a.length][b.length];
            int c = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    solutionMatrix[i][j] +=
                            a[i][0] * b[0][j] +
                            a[i][1] * b[1][j] +
                            a[i][2] * b[2][j];
                }
            }
            return solutionMatrix;
    }
    public static String displayMatrices(double[][] a, double[][] b, double[][] c, int row, int col) {
        String display = new String("");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                display += String.format("%5.1f", a[i][j]);
            }
            display += (i == 1 ? "   *   " : "       ");
            for (int j = 0; j < col; j++) {
                display += String.format("%5.1f", b[i][j]);
            }
            display += (i == 1 ? "   =   " : "       ");

            for (int j = 0; j < col; j++) {
                display += String.format("%7.1f", c[i][j]);
            }
            display += "\n";
        }
        return display;
    }
}


