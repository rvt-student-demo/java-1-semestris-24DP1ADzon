package rvt;

import java.util.Scanner;

public class PdUzlabosana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstArray = new int[5];
        
        for(int i = 0; i < 5; i++){
            int usrInpt = Integer.valueOf(scanner.nextLine());
            firstArray[i] = usrInpt;
        }

        int[] secondArray = firstArray.clone();

        for(int i = 0; i < 5; i++){
            secondArray[i] %= 3;
        }

        System.out.print("Numbers that are greater than 10: ");
        for(int i = 0; i < 5; i++){
            if(firstArray[i] > 10){
                System.out.print(firstArray[i] + " ");
            }
        }
        System.out.println();
        
        System.out.print("Divisible by 3: ");
        for(int i = 0; i < 5; i++){
            if(secondArray[i] == 0){
                System.out.print(secondArray[i] + " ");
            }
        }
        System.out.println();

        System.out.print("First array: ");
        for(int i = 0; i < 5; i++){
            System.out.print(firstArray[i] + " ");
        }

        System.out.print("\n");

        System.out.print("Second array: ");
        for(int i = 0; i < 5; i++){
            System.out.print(secondArray[i] + " ");
        }

        scanner.close();
    }
}
