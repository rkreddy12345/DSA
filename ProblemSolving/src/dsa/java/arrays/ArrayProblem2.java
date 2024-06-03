package dsa.java.arrays;

import java.util.Objects;

public class ArrayProblem2 {

    public static boolean isPairExistsForTheSum(int[] arr, int sum){
        if(Objects.isNull ( arr ) || arr.length==0){
            return false;
        }

        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr.length; j++){
                if(i!=j && arr[i]+arr[j]==sum){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isPairExistsForTheSum_Optimized(int[] arr, int sum){
        if(Objects.isNull ( arr ) || arr.length==0){
            return false;
        }
        for (int i=0; i< arr.length; i++){
            for(int j=i+1; j <arr.length; j++){
                if(arr[i]+arr[j]==sum){
                    return true;
                }
            }
        }

        return false;
    }

    public static void main ( String[] args ) {
        //int[] arr={3, -2, 1, 1, 3, 6, 8 };
        int[] arr={3, 4, 5, 4, -2, 12 };
        System.out.println (isPairExistsForTheSum ( arr, 10 ));
        System.out.println (isPairExistsForTheSum_Optimized ( arr, 10 ));
    }
}
