package dsa.java.arrays;

import java.util.Arrays;

public class ArrayProblem4 {

    public static int[] reversePartOfArray(int[] arr, int s, int e){
        for(int i=s,j=e; i<j; i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        return arr;
    }

    public static void main ( String[] args ) {
        int[] arr={100, 200, 300, 400, 500};
        System.out.println ( Arrays.toString ( reversePartOfArray ( arr, 1,3 ) ));
    }
}
