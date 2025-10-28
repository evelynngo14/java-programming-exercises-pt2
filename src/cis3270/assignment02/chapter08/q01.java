package cis3270.assignment02.chapter08;
//sum elements column by column
import java.util.Scanner;
public class q01 {

    public static void main(String[] args) {
        double[][] m = new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = input.nextDouble();
        }

        for (int i = 0; i < 4; i++) {
            System.out.printf("Sum of the elements at column %d: %.1f \n", i, sumColumn(m, i));
        }
    }
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += m[i][columnIndex];
        }
        return sum;

    }
}
