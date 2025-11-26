package rvt;

import java.util.Scanner;

public class Chapter44 {
    public static void main(String[] args) {
        ex4();
    }

    public static void ex1(){
        Scanner scanner = new Scanner(System.in);
        String name = (scanner.nextLine()).trim();
        
        int spaceIndex = name.indexOf(' ');

        String firstName = name.substring(0, spaceIndex);
        String lastName = name.substring(spaceIndex, name.length());

        String changedName = firstName.concat(lastName.toUpperCase());
        System.out.println(changedName);

        scanner.close();
    
    }

    public static void ex2(){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        for(int i = 0; i < string.length(); i++){
            System.out.println(string.charAt(i));
        }

        scanner.close();
    }

    public static void ex3(){
        String title = null;
        String[] femaleNames = {"Amy", "Buffy", "Cathy"};
        String[] maleNames = {"Elroy", "Fred", "Graham"};

        Scanner scanner = new Scanner(System.in);
        String fullName = scanner.nextLine();
        int spaceIndex = fullName.indexOf(' ');
        String name = fullName.substring(0, spaceIndex);

        for(int i = 0; i < 3; i++){
            if(name.equals(femaleNames[i])){
                title = "Ms.";
                break;
            } else if(name.equals(maleNames[i])){
                title = "Mrs.";
                break;
            }
        }

        if(title != null){
            System.out.print(title + " ");
        }
        System.out.println(fullName);
        scanner.close();
    }

    public static void ex4(){
        String minutes;
        String seconds;

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        if(userInput.length() <= 2){
            minutes = "0";
            seconds = userInput;        
        } else{
            minutes = userInput.substring(0, userInput.length() - 2);
            seconds = userInput.substring(userInput.length() - 2, userInput.length());
        }

        System.out.println(minutes + ":" + seconds);
    }
}
