package cis3270.assignment02.chapter08;
//sum elements column by column
import java.util.Scanner;
public class q01 {

    public static void main(String[] args) {

    }
    public static double sumColumn(double[][] m, int columnIndex) {

        double[][] m = new int[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = input.nextInt();

        }




    }
}
