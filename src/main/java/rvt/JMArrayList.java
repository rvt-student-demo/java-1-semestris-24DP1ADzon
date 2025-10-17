package rvt;
import java.util.*;

public class JMArrayList {
    public static void main(String[] args){
        onTheList();
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

    public static void listSize(){
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String inpt = scanner.nextLine();

        while (inpt != "") {
        names.add(inpt);
        inpt = scanner.nextLine();
        }

        System.out.println("In total: " + names.size());
    }    
    
    public static void onTheList(){
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String inpt = scanner.nextLine();

        while (inpt != "") {
            names.add(inpt);
            inpt = scanner.nextLine();
        }

        System.out.print("Search for?: ");
        String name = scanner.nextLine();
        if(names.contains(name)){
            System.out.println(name + " was found!");
        } else{
            System.out.println(name + " was not found!");
        }
    }
}
