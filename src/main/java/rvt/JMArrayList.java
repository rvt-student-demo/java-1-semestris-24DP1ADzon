package rvt;
import java.util.*;

public class JMArrayList {
    public static void main(String[] args){
        onlyTheseNumber();
    }

    public static void onlyTheseNumber(){
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int inpt = Integer.valueOf(scanner.nextLine());
        while (inpt != -1) {
            numbers.add(inpt);
            inpt = Integer.valueOf(scanner.nextLine());
        }
        System.out.print("From where? ");
        int from = Integer.valueOf(scanner.nextLine()); 
        System.out.print("To where? ");
        int to = Integer.valueOf(scanner.nextLine());

        for(int i = from; i <= to; i++){
            System.out.println(numbers.get(i));
        }
    }
}
