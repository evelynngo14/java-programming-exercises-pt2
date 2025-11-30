package cis3270.assignment02.chapter11;

import java.util.Scanner;

public class q01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Triangle testTriangle = new Triangle();

        System.out.print("Enter a color: ");
        String color = input.nextLine();
        testTriangle.setColor(color);

        System.out.print("Enter side1: ");
        double side1 = input.nextDouble();
        testTriangle.setSide1(side1);
        System.out.print("Enter side2: ");
        double side2 = input.nextDouble();
        testTriangle.setSide2(side2);
        System.out.print("Enter side3: ");
        double side3 = input.nextDouble();
        testTriangle.setSide3(side3);

        input.nextLine();

        System.out.print("Is the triangle filled? yes/no: ");
        String filled = input.nextLine().toLowerCase();
        if (filled.equals("yes")) {
            testTriangle.setFilled(true);
        }
        else if (filled.equals("no")) {
            testTriangle.setFilled(false);
        }

        System.out.print(testTriangle.toString());

    }

    public static class Triangle extends GeometricObject {
        private double side1 = 1.0;
        private double side2 = 1.0;
        private double side3 = 1.0;

        public Triangle() {
        }

        public Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        public double getSide1() {
            return side1;
        }

        public void setSide1(double side1) {
            this.side1 = side1;
        }

        public double getSide2() {
            return side2;
        }

        public void setSide2(double side2) {
            this.side2 = side2;
        }

        public double getSide3() {
            return side3;
        }

        public void setSide3(double side3) {
            this.side3 = side3;
        }

        public double getArea() {
            double s = (side1 + side2 + side3) / 2;
            double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
            return area;
        }

        public double getPerimeter() {
            return (side1 + side2 + side3);
        }

        @Override
        public String toString() {
            return super.toString() +
                    "\nTriangle: side = " + side1 + ", side2 = " + side2 + ", side3 = " + side3
                    + "\nArea = " + getArea() + ", Perimeter = " + getPerimeter();
        }
    }

    public static class GeometricObject {
        private String color = "white";
        private boolean filled = false;
        private java.util.Date dateCreated;

        public GeometricObject() {
            dateCreated = new java.util.Date();
        }

        public GeometricObject(String color, boolean filled) {
            dateCreated = new java.util.Date();
            this.color = color;
            this.filled = filled;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isFilled() {
            return filled;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        public java.util.Date getDateCreated() {
            return dateCreated;
        }

        @Override
        public String toString() {
            return "\ncreated on " + dateCreated + "\ncolor: " + color + "\nfilled: " + filled;
        }
    }
}
