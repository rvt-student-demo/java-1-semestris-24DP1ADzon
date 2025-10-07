package rvt;

public class Printer{
    public static void printInStars(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int y = 0; y < array[i]; y++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
