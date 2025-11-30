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

    public static class Account {
        private int id = 0;
        private double balance = 0;
        private double annualInterestRate = 0;
        private Date dateCreated = new Date();

        public Account() {
        }

        public Account(int newID, double initialBalance) {
            id = newID;
            balance = initialBalance;
        }

        int getID(){
            return id;
        }

        void setID(int newID) {
            id = newID;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double newBalance) {
            balance = newBalance;
        }

        public double getAnnualInterestRate() {
            return annualInterestRate * 100;
        }

        public void setAnnualInterestRate(double newAIR) {
            annualInterestRate = newAIR / 100;
        }

        public Date getDateCreated() {
            return dateCreated;
        }

        public double getMonthlyInterest() {
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
