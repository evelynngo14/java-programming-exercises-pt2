package cis3270.assignment02.chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class q13 {

    public static void main(String[] args) {
        ArrayList<Integer> testList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            testList.add(input.nextInt());
        }

        removeDuplicate(testList);

        System.out.print("The distinct integers are ");
        for  (Integer i : testList) {
            System.out.print(i + " ");
        }
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            if (!duplicates.contains(list.get(i))) {
                duplicates.add(list.get(i));
            } else  {
                list.remove(i);
            }
        }
    }
}
