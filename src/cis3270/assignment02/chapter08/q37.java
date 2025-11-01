package cis3270.assignment02.chapter08;
//(Guess the capitals) Write a program that repeatedly prompts the user to enter
//a capital for a state. Upon receiving the user input, the program reports whether
//the answer is correct. Assume that 50 states and their capitals are stored in a two-
//dimensional array, as shown in Figure 8.10. The program prompts the user to
//answer all states’ capitals and displays the total correct count. The user’s answer
//is not case-sensitive.

import java.util.Scanner;
public class q37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] statesAndCapitals = {
                {"Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Carolina","North Dakota","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"},
                {"Montgomery","Juneau","Phoenix","Little Rock","Sacramento","Denver","Hartford","Dover","Tallahassee","Atlanta","Honolulu","Boise","Springfield","Indianapolis","Des Moines","Topeka","Frankfort","Baton Rouge","Augusta","Annapolis","Boston","Lansing","St. Paul","Jackson","Jefferson City","Helena","Lincoln","Carson City","Concord","Trenton","Santa Fe","Albany","Raleigh","Bismarck","Columbus","Oklahoma City","Salem","Harrisburg","Providence","Columbia","Pierre","Nashville","Austin","Salt Lake City","Montpelier","Richmond","Olympia","Charleston","Madison","Cheyenne"}};

        int randomState = (int)(Math.random() * 51);
        System.out.printf("What is the capital of %s? ", statesAndCapitals[0][randomState]);
        String answer = input.next();

        System.out.printf(statesAndCapitals[1][randomState].equalsIgnoreCase(answer) ?
                "Your answer is correct" : "The correct answer should be %s", statesAndCapitals[1][randomState]);
    }
}
