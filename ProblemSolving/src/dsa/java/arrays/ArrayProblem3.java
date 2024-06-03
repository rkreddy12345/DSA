package dsa.java.arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayProblem3 {

    public static int[] reverse(int[] arr, int size){
        int i=0;
        int j=size-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }

    public static int[] reverseUsingFor(int[] arr, int size){
        for(int i=0, j=size-1; i<j; i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        return arr;
    }

    public static void main ( String[] args ) {
        int[] arr={3, -2, 1, 1, 3, 6, 8 };
        //System.out.println (Arrays.toString ( reverse ( arr, arr.length ) ));
        System.out.println (Arrays.toString ( reverseUsingFor ( arr, arr.length ) ));
    }
}
