package cis3270.assignment02.chapter09;
//(Algebra: 2 * 2 linear equations) Design a class named LinearEquation for a
//2 * 2 system of linear equations
class q11 {

    class LinearEquation {
        private double a = 0;
        private double b = 0;
        private double c = 0;
        private double d = 0;
        private double e = 0;
        private double f = 0;

        LinearEquation(double a, double b, double c, double d, double e, double f) {
        }

        public double getF() {
            return f;
        }

        public double getE() {
            return e;
        }

        public double getD() {
            return d;
        }

        public double getC() {
            return c;
        }

        public double getB() {
            return b;
        }

        public double getA() {
            return a;
        }

        public boolean isSolvable() {
            return (this.a * this.d) - (this.b * this.c) != 0;
        }


    }
}