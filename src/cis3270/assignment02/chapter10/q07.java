package cis3270.assignment02.chapter10;

import cis3270.assignment02.chapter09.q07.Account;

import java.util.Scanner;

//(Game: ATM machine) Use the Account class created in Programming Exer-
//cise 9.7 to simulate an ATM machine. Create ten accounts in an array with id
//0, 1, . . . , 9, and initial balance $100. The system prompts the user to enter an
//id. If the id is entered incorrectly, ask the user to enter a correct id. Once an id
//is accepted, the main menu is displayed as shown in the sample run. You can
//enter a choice 1 for viewing the current balance, 2 for withdrawing money, 3 for
//depositing money, and 4 for exiting the main menu. Once you exit, the system
//will prompt for an id again. Thus, once the system starts, it will not stop.

public class q07 {

    static int enterId() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter id: ");
        int id = input.nextInt();

        while (true) {
            if (id < 0 || id > 9) {
                System.out.println("Invalid input. Try again.");
                id = input.nextInt();
            } else break;
        }

        return id;
    }

    static void mainMenu(int id, Account[] accounts) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter digit 1-4:\n choice 1: view current balance\n choice 2: withdraw money\n choice 3: deposit money\n choice 4: exit main menu");
        int choice = input.nextInt();
        double balance = accounts[id].getBalance();

        while (true) {
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid input. Try again.");
            }
            else if (choice == 1) {
                System.out.printf("Your balance is $%.2f\n", balance, ".");
                break;
            }
            else if (choice == 2) {
                System.out.print("Enter amount to withdraw: ");
                double withdraw = input.nextDouble();
                System.out.printf("Withdrew $%.2f\n", withdraw);
                accounts[id].setBalance((balance - withdraw));
                break;
            }
            else if (choice == 3) {
                System.out.print("Enter amount to deposit: ");
                double deposit = input.nextDouble();
                System.out.printf("Deposited $%.2f\n", deposit);
                accounts[id].setBalance((balance + deposit));
                break;
            }
            else if (choice == 4) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Account[] accounts = new Account[9];
        for (int i = 0; i < 9; i++) {
            accounts[i] = new Account(i, 100);
        }

        while (true) {
            int id = enterId();
            mainMenu(id, accounts);
        }

    }
}
