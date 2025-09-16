package rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        avrgOf3();
        
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
