package rvt;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class App {
    public static void main(String[] args) {
        oddEven();
        
    }

    public static void oddEven(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = Integer.valueOf(scanner.nextLine());

        if (num % 2 == 0){
            System.out.println("Number " + num + " is even");
        } else if (num % 2 == 1) {
            System.out.println("Number " + num + " is odd");
        }
    }

    public static void grades(){
        Scanner scanner = new Scanner(System.in);
        int grade = Integer.valueOf(scanner.nextLine());
        String answer = "impossible!";

        if (grade < 0){
            answer = "impossible!";
        } else if (grade <= 49) {
            answer = "failed";
        } else if (grade <= 59) {
            answer = "1";
        } else if (grade <= 69) {
            answer = "2";
        } else if (grade <= 79) {
            answer = "3";
        } else if (grade <= 89) {
            answer = "4";
        } else if (grade <= 99) {
            answer = "5";
        } else if (grade > 100) {
            answer = "incredible!"; 
        }
        System.out.println(answer);
    }

    public static void addition(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        scanner.close();
    }
    
    public static void divide(){
        int first = 3;
        int second = 2;
        double result = (double) first / second; // (double) - pārveido mainīgā first datu tipu int uz double 
        System.out.println(result);
    }
    
    public static void avrgOf3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the third number:");
        int num3 = Integer.valueOf(scanner.nextLine());

        double result = (num1 + num2 + num3) / 3.0;

        System.out.println("The average is " + result);

    }
}
