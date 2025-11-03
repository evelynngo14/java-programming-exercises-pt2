package cis3270.assignment02.chapter09;
//(Geometry: n-sided regular polygon) In an n-sided regular polygon, all sides
//have the same length and all angles have the same degree (i.e., the polygon is
//both equilateral and equiangular). Design a class named RegularPolygon

import java.lang.Math;

public class q09 {
    public static void main(String[] args) {
        RegularPolygon r1 = new RegularPolygon(6, 4);
        RegularPolygon r2 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.print
    }
    static class RegularPolygon {
        private int n = 3;
        private double side = 1;
        private double x = 0;
        private double y = 0;

        RegularPolygon() {}

        RegularPolygon(int n, double side) {
            this.n = n;
            this.side = side;
        }

        RegularPolygon(int n, double side, double x, double y) {
            this.n = n;
            this.side = side;
            this.x = x;
            this.y = y;
        }

        public int getN() {
            return n;
        }

        public void setN(int n) {
            this.n = n;
        }

        public double getSide() {
            return side;
        }

        public void setSide(double side) {
            this.side = side;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

        public double getPerimeter() {
            double perimeter = (side*n);
            return perimeter;
        }

        public double getArea() {
            double area = (n * Math.pow(side, 2)) / (4 * Math.tan((Math.PI / n)));
            return area;
        }
    }
}
