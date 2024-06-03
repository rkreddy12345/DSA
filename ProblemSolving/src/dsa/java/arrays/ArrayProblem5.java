package dsa.java.arrays;

import java.util.Arrays;

public class ArrayProblem5 {

    public static int[] reverse(int[] arr, int s, int e){
        int i=s;
        int j=e;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }

    public static int[] rightRotate(int[] arr, int k){
        if(k> arr.length){
            k=k%arr.length;
        }
        reverse ( arr, 0, arr.length -1 );
        reverse ( arr, 0, k-1 );
        reverse ( arr, k, arr.length-1 );
        return arr;
    }

    //this is with SC: O(N)
    public static int[] rightRotateByK(int[] arr, int k){
        int[] resultArray=new int[arr.length];
        for(int i=0; i<arr.length; i++){
            resultArray[(i+k)% arr.length]=arr[i];
        }
        return resultArray;
    }

    public static void main ( String[] args ) {
        int[] arr={100, 200, 300, 400, 500};
        System.out.println ( Arrays.toString ( rightRotateByK ( arr, 17 ) ) );
    }
}
