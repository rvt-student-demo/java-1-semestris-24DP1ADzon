package rvt;

public class Connecticut{
    public static void main(String[] args){
        reverseOrder();
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

    public static void threeArrays(){
        int[] valA   = { 13, -22,  82,  17}; 
        int[] valB   = {-12,  24, -79, -13};
        int[] sum    = {  0,   0,   0,   0};
    
        for(int i = 0; i < valA.length; i++){
            sum[i] = valA[i] + valB[i];
        }

        System.out.println( "sum: " + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );
    }

    public static void sameSum(){
        int[] valA   = { 13, -22,  82,  17}; 
        int[] valB   = {  0,   0,   0,   0};
    
        for(int i = 0; i < valA.length; i++){
            valB[i] = 25 - valA[i];
        }

        System.out.println( "valA: " 
            + valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3] );
        
        System.out.println( "valB: " 
            + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3] );

        System.out.println( "sum:  " 
            + (valA[0]+valB[0]) + " " + (valA[1]+valB[1]) + " " 
            + (valA[2]+valB[2]) + " " + (valA[3]+valB[3]) );
    }

    public static void reverseOrder(){
        int[] val = {0, 1, 2, 3}; 
        int temp;
 
        System.out.println( "Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
        for(int i = 0; i < val.length/2; i++){
            temp = val[i];
            val[i] = val[val.length-i-1];
            val[val.length-i-1] = temp;
        }

        System.out.println( "Reversed Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
    }
}