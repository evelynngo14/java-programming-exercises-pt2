package cis3270.assignment02.chapter10;

public class q03 {
    static class MyInteger{
        int value;

        public MyInteger(int value) {
            this.value = value;
        }

        public boolean isEven(int value) {
            return value % 2 == 0;

        }

        public boolean isOdd(int value) {
            return value % 2 != 0;
        }

        public boolean isPrime(int value) {
            if (value <= 1)
                return false;
            for (int i = 2; i < value; i++)
                if (value % i == 0)
                    return false;
            return true;
        }

        public static boolean isEven(MyInteger obj) {
            return isEven(obj);
        }

        public static boolean isOdd(MyInteger obj) {
            return isOdd(obj);
        }

        public static boolean isPrime(MyInteger obj) {
            return isPrime(obj);
        }


    }
}