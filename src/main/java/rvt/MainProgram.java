package rvt;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Statistics statisticsSum = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();

        Scanner scanner = new Scanner(System.in);
        int userNum;

        while(true){
            userNum = Integer.valueOf(scanner.nextLine());
            if(userNum == -1){
                break;
            }
            statisticsSum.addNumber(userNum);

            if(userNum % 2 == 0){
                statisticsEven.addNumber(userNum);
            } else{
                statisticsOdd.addNumber(userNum);
            }

        }

        System.out.println("Sum: " + statisticsSum.sum());
        System.out.println("Sum of even numbers: " + statisticsEven.sum());
        System.out.println("Sum of odd numbers: " + statisticsOdd.sum());
    }
}