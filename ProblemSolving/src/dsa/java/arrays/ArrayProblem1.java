package dsa.java.arrays;

import java.util.Objects;

public class ArrayProblem1 {

    //Find the number of elements which has at least 1 element greater than itself.


    public static int findCount(int[] arr){

        if(Objects.isNull ( arr ) || arr.length==0){
            return 0;
        }
        int count=0;
        boolean isGreaterFound=false;
        for(int i=0; i< arr.length; i++){
            isGreaterFound=false;
            for(int j=0; j< arr.length; j++){
                if(arr[j] > arr[i]){
                    isGreaterFound=true;
                    break;
                }
            }
            if(isGreaterFound)
                count=count+1;
        }
        return count;   //this is done in O(N^2) i.e N^2 iterations
    }

    public static int findCountInOrderOfN(int[] arr){
        if(Objects.isNull ( arr ) || arr.length==0){
            return 0;
        }

        //find max number
        int maxNum=Integer.MIN_VALUE;
        for (int i=0; i< arr.length; i++){
            if(arr[i]>maxNum){
                maxNum=arr[i];
            }
        }
        //find count of maxNum
        int count=0;
        for (int i=0; i<arr.length; i++){
            if(arr[i]==maxNum){
                count++;
            }
        }
        return arr.length-count;   //this is 2N iterations
    }

    public static int findCountInNIterations(int arr[]){
        if(Objects.isNull ( arr ) || arr.length==0){
            return 0;
        }

        int maxNum=Integer.MIN_VALUE;
        int count=0;
        for (int i=0; i< arr.length; i++){
            if(arr[i]>maxNum){
                maxNum=arr[i];
                count=1;
            }else if(arr[i]==maxNum){
                count++;
            }
        }

        return arr.length-count;   //this is N iterations
    }

    public static void main ( String[] args ) {
        int[] arr = {-3,-2,6,8,4,8,5};
        //System.out.println (findCount ( arr ));
        System.out.println (findCountInNIterations ( arr ));
    }
}