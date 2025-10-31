package cis3270.assignment02.chapter08;
//(Compute the weekly hours for each employee) Suppose the weekly hours for all
//employees are stored in a two-dimensional array. Each row records an employ-
//ee’s seven-day work hours with seven columns. For example, the following
//array stores the work hours for eight employees. Write a program that displays
//employees and their total hours in decreasing order of the total hours

public class q04 {
    public static void main(String[] args) {
        table(employeeHours());

    }
    public static void table(int[][] employeeHours) {
        System.out.printf("%39s", "  Su  M  T  W  Th  F  Sa \n");
        for (int i = 0; i < 8; i++) {
            System.out.printf("Employee %d   ", i);
            for (int j = 0; j < 7; j++) {
                System.out.printf("% 3d", employeeHours[i][j]);
            }
            System.out.println();
        }

    }
    public static int[][] employeeHours() {
        int[][] timeTable = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };
        return timeTable;
    }

}
