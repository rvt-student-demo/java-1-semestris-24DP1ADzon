package rvt;

public class Connecticut{
    public static void main(String[] args){
        twoArray();
    }

    public static int arraySum(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    public static void twoArray(){
        int[] val = {13, -4, 82, 17}; 
        int[] twice = new int[val.length];
        
        System.out.println( "Original Array: " 
           + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
    
        for(int i = 0; i < val.length; i++){
            twice[i] = val[i] * 2;
        }

    
        System.out.println( "New Array: " 
            + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );

    }
}