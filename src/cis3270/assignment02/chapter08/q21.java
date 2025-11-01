package cis3270.assignment02.chapter08;
import java.util.Scanner;
//(Central city) Given a set of cities, the central city is the city that has the shortest
//total distance to all other cities. Write a program that prompts the user to enter
//the number of the cities and the locations of the cities (coordinates), and finds
//the central city and its total distance to all other cities.
// test inputs:
// 2.5 5 5.1 3 1 9 5.4 54 5.5 2.1
public class q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();

        //create array to store points
        double[][] points = new double[numberOfPoints][2];
        System.out.print("Enter " + numberOfPoints + " points: ");
        for (int i = 0; i < numberOfPoints; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
        double[] centralCity = findCentralCity(points);
        System.out.printf("The central city is at (%.2f, %.2f)\n", centralCity[0], centralCity[1]);
        System.out.printf("The total distance to all other cities is %.2f", distanceSum(centralCity, points));
    }

    public static double distance( // find the city closest to (0,0)
            double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        }

    public static double[] findCentralCity(double[][] points) {
        double shortestDistance = distance(points[0][0], points[0][1],
             points[1][0], points[1][1]);
        double p1 = points[0][0]; double p2 = points[0][1];
        for (int i = 0; i < points.length; i++) {
            double x = points[i][0];
            double y = points[i][1];
            double distance = distance(x, y, 0, 0);
            if (distance < shortestDistance) {
                p1 = x;
                p2 = y;
                shortestDistance = distance;
            }
        }
        double[] centralCity = {p1, p2};
        return centralCity;
    }

    public static double distanceSum(double[] centralCity, double[][] points) {
        double sum = 0;
        for (int i = 0; i < points.length; i++) {
            double x = points[i][0];
            double y = points[i][1];
            sum += distance(centralCity[0], centralCity[1], x, y);
        }
        return sum;
    }
}
