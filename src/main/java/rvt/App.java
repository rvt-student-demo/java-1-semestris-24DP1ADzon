package rvt;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        game();
    }

    public static void game(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(10) + 1;
        for(int i = 0; i <= 3; i++){
            if(i == 3){
                System.out.println("Pareizais skaitlis bija " + num);
                break;
            }
            System.out.println("Ievadi minējumu: ");
            int minejums = Integer.valueOf(scanner.nextLine());

            if(minejums == num){
                System.out.println("PAREIZI!");
                System.out.println("Tu esi uzvarējis spēli!");
            } else{
                System.out.println("nepareizi");
            }
        
        }
    }

    public static void repBreakRemembering(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numAmount = 0;
        int odd = 0;
        int even = 0;
        
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num == -1){
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + numAmount);
                System.out.println("Average: " + ((double) sum / numAmount));
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);
                break;
            }
            sum += num;
            numAmount++;
            if((num % 2) == 0) {
                even += 1;
            } else{
                odd += 1;
            }
        }
    }

    public static void counting(){
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());

        for(int i = 0; i <= num; i++){
            System.out.println(i);
        }
    }
    
    public static void numAndSum(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numAmount = 0;
    
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 0){
                break;
            }
            sum += num;
            numAmount += 1;
        }
    
        System.out.println("Number of number: " + numAmount);
        System.out.println("Sum of the numbers: " + sum);
    }
    
    public static void delikatese(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi preci: ");
        String prece = scanner.nextLine();
        System.out.println("Ievadi cenu: ");
        double cena = Double.valueOf(scanner.nextLine());
        System.out.println("Ekspress piegade (0==ne, 1==ja):");
        int express = Integer.valueOf(scanner.nextLine());
        System.out.println("\n");
        double piegade = 0;
        
        System.out.println("Rekins:");
        System.out.println("  " + prece +  "  " + cena);

        if(cena < 10){
            piegade += 2;
        } 
        if (express == 1){
            piegade += 3;
        }
        System.out.println("  piegade:  " + piegade);
        System.out.println("  kopa:  " + (cena + piegade));
    }

    public static void detalas(){
        Scanner scanner = new Scanner(System.in);
        final int skruvjuCena = 5;
        final int uzgrieznuCena = 3;
        final int paplaksnesCena = 1;
        
        int skruves;
        int uzgriezni;
        int paplaksnes;

        System.out.println("Skruvju skaits:");
        skruves = Integer.valueOf(scanner.nextLine());
        System.out.println("Uzgrieznu skaits:");
        uzgriezni = Integer.valueOf(scanner.nextLine());
        System.out.println("Paplaksnu skaits:");
        paplaksnes = Integer.valueOf(scanner.nextLine());

        if(uzgriezni > skruves && paplaksnes / 2 > skruves ){
            System.out.println("Parbaudi pasutijumu: Pasutijums ir kartiba");      
        } else {
            if(uzgriezni < skruves) {
                System.out.println("Parbaudi pasutijumu: Par maz uzgrieznu");
            } if (paplaksnes / 2 < skruves) {
                System.out.println("Parbaudi pasutijumu: Par maz paplaksnu");
            }
        }

        System.out.println("Kopeja cena: " + (skruves * skruvjuCena) + (uzgriezni * uzgrieznuCena) + (paplaksnes * paplaksnesCena) + " centi");
    }
        

    public static void giftTax(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gift value?");
        int giftValue = Integer.valueOf(scanner.nextLine());
        double tax;

        if(giftValue < 5000){
            tax = 0;
        } else if (giftValue < 25000) {
            tax = 100 + (giftValue - 5000) * 0.08;
        } else if (giftValue < 55000) {
            tax = 1700 + (giftValue - 25000) * 0.1;
        } else if (giftValue < 200000){
            tax = 4700 + (giftValue - 55000) * 0.12;
        } else if (giftValue < 1000000) {
            tax = 22100 + (giftValue - 200000) * 0.15;
        } else {
            tax = 142100 + (giftValue - 1000000) * 0.17;
        }

        System.out.println("Tax: " + tax);
    }

    public static void password(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Password?");
        String userinpt = scanner.nextLine();

        if (userinpt.equals("Caput Draconis")){
            System.out.println("Welcome!");
        } else{
            System.out.println("Off with you!");
        }
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
