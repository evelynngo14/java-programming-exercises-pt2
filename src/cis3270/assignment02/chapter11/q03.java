package cis3270.assignment02.chapter11;

import cis3270.assignment02.chapter09.q07;

public class q03 {
    public static void main(String[] args) {
        CheckingsAccount testCheckingsAccount = new CheckingsAccount();
        System.out.println(testCheckingsAccount.toString());

        SavingsAccount testSavingsAccount = new SavingsAccount();
        System.out.println(testSavingsAccount.toString());
    }

}

class CheckingsAccount extends q07.Account {
    Double overdraftLimit = -1000.0;

    CheckingsAccount() {
        super();
    }

    public CheckingsAccount(int newID, double initialBalance) {
        super(newID, initialBalance);
    }

    @Override
    public String toString() {
        return String.format("Balance: $%.2f \nMonthly Interest: $%.2f \nDate Created: %s",
                getBalance(), getMonthlyInterest(), getDateCreated().toString());
    }

    String withdraw(double withdrawal) {
        if (getBalance() == overdraftLimit || getBalance() - withdrawal < overdraftLimit) {
            return ("You can not withdraw over your overdraft limit.");
        } else {
            setBalance(getBalance() - withdrawal);
            return String.format("You withdrew $%.2f. Your balance is now $%.2f.", withdrawal, getBalance());
        }
    }

}

class SavingsAccount extends q07.Account {
    SavingsAccount() {
        super();
    }

    public SavingsAccount(int newID, double initialBalance) {
        super(newID, initialBalance);
    }

    @Override
    public String toString() {
        return String.format("Balance: $%.2f \nMonthly Interest: $%.2f \nDate Created: %s",
                getBalance(), getMonthlyInterest(), getDateCreated().toString());
    }

    String withdraw(double withdrawal) {
        if (getBalance() < 0 || getBalance() < withdrawal) {
            return "You can not withdraw from your savings account.";
        } else {
            setBalance(getBalance() - withdrawal);
            return String.format("You withdrew $%.2f. Your balance is now $%.2f.", withdrawal, getBalance());
        }
    }

}