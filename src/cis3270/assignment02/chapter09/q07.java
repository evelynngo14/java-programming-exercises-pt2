package cis3270.assignment02.chapter09;
//(The Account class) Design a class named Account

import java.util.Date;

public class q07 {
    public static void main(String[] args) {
        Account acc1 = new Account(1122, 20000);
        acc1.setAnnualInterestRate(4.5);
        acc1.withdraw(2500);
        acc1.deposit(3000);
        System.out.printf("Balance: $%.2f \nMonthly Interest: $%.2f \nDate Created: %s", acc1.getBalance(), acc1.getMonthlyInterest(), acc1.getDateCreated().toString());

    }

    static class Account {
        private int id = 0;
        private double balance = 0;
        private double annualInterestRate = 0;
        private Date dateCreated = new Date();

        Account() {
        }

        Account(int newID, double initialBalance) {
            id = newID;
            balance = initialBalance;
        }

        int getID(){
            return id;
        }

        void setID(int newID) {
            id = newID;
        }

        double getBalance() {
            return balance;
        }

        void setBalance(double newBalance) {
            balance = newBalance;
        }

        double getAnnualInterestRate() {
            return annualInterestRate * 100;
        }

        void setAnnualInterestRate(double newAIR) {
            annualInterestRate = newAIR / 100;
        }

        Date getDateCreated() {
            return dateCreated;
        }

        double getMonthlyInterest() {
            return (balance * (annualInterestRate / 12));
        }

        void withdraw(double withdrawal) {
            setBalance(balance - withdrawal);
        }

        void deposit(double deposit) {
            setBalance(balance + deposit);
        }

    }
}
