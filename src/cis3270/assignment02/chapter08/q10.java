package cis3270.assignment02.chapter08;
//(Largest row and column) Write a program that randomly fills in 0s and 1s into
//a 4-by-4 matrix, prints the matrix, and finds the first row and column with the
//most 1s.

public class q10 {
    public static void main(String[] args) {
        int[][] matrix = fillMatrix(4,4);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        int[] largestIndices = findLargestIndex(matrix);
        System.out.println("The largest row index: " + largestIndices[0]);
        System.out.println("The largest column index: " + largestIndices[1]);
    }

    public static int[][] fillMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }

    public static int[] findLargestIndex(int[][] m) {
        int largestRowIndex = 0;
        int largestColIndex = 0;
        int largestRow = 0;
        int largestCol = 0;

        for (int i = 0; i < m.length; i++) {
            int sumRow = 0;
            for (int j = 0; j < m[i].length; j++) {
                sumRow += m[i][j];
            }
            if (sumRow > largestRow) {
                largestRow = sumRow;
                largestRowIndex = i;
            }
        }
        for (int j = 0; j < m[0].length; j++) {
            int sumCol = 0;
            for (int i = 0; i < m.length; i ++) {
                sumCol += m[i][j];
            }
            if (sumCol > largestCol) {
                largestCol = sumCol;
                largestColIndex = j;
            }
        }

        return new int[]{largestRowIndex, largestColIndex};
    }
}
