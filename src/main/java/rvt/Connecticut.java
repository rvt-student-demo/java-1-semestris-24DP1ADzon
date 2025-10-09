package rvt;

public class Connecticut{
    public static void main(String[] args){
        int[] numbers = {0, 1, 2, 3};
        System.out.println(arraySum(numbers));
    }

    public static int arraySum(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
}