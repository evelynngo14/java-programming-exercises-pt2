package cis3270.assignment02.chapter12;

import java.util.Scanner;

public class q01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String expressionStr = input.nextLine();
        String[] expression = expressionStr.split(" ");

        CalculatorWithExceptionHandler test1 = new CalculatorWithExceptionHandler(expression);
        CalculatorNoExceptionHandler test2 = new CalculatorNoExceptionHandler(expression);
    
        test1.calculate();
        test2.calculate();
    }
}

class CalculatorWithExceptionHandler {
    public String[] expression;
    double result = 0;
    Scanner input = new Scanner(System.in);

    public CalculatorWithExceptionHandler(String[] expression) {
        this.expression = expression;
    }

    boolean isExpression(String[] expression) throws IllegalArgumentException {
        if (expression.length != 3) {
            return false;
        } else {
            return true;
        }
    }

    boolean isNumeric(String[] expression) throws NumberFormatException {
        try {
            double operand1 = Double.parseDouble(expression[0]);
            double operand2 = Double.parseDouble(expression[2]);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    void calculate() {
        if (isExpression(expression) || isNumeric(expression)) {
            switch (expression[1].charAt(0)) {
                case '+': result = Double.parseDouble(expression[0]) + Double.parseDouble(expression[2]);
                    break;
                case '-': result  = Double.parseDouble(expression[0]) - Double.parseDouble(expression[2]);
                    break;
                case '*': result = Double.parseDouble(expression[0]) * Double.parseDouble(expression[2]);
                    break;
                case '/': result = Double.parseDouble(expression[0]) / Double.parseDouble(expression[2]);
                    break;
            }
            System.out.println(expression[0] + ' ' + expression[1] + ' ' + expression[2] + ' ' + " = " + result);
        } else {
            System.out.println("Usage: java Calculator operand1 operator operand2");
        }
    }
}

class CalculatorNoExceptionHandler extends CalculatorWithExceptionHandler {
    double result = 0;


    CalculatorNoExceptionHandler(String[] expression) {
        super(expression);
    }

    @Override
    boolean isExpression(String[] expression) {
        return expression.length == 3;
    }

    @Override
    boolean isNumeric(String[] expression) {
        char[] charArray = new  char[expression.length];
        return (Character.isDigit(expression[0].charAt(0)) && Character.isDigit(expression[2].charAt(2)));
    }
}
