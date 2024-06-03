package dsa.java.arrays;

import java.util.Objects;

public class ArrayProblem1 {

    public static int findCount(int arr[]){

        if(Objects.isNull ( arr ) || arr.length==0){
            return 0;
        }
        int count=0;

        for(int i=0; i< arr.length; i++){
            boolean isGreaterFound=false;
            for(int j=0; j< arr.length; j++){
                if(arr[j] > arr[i]){
                    isGreaterFound=true;
                    break;
                }
            }
            if(isGreaterFound)
                count=count+1;
        }
        return count;   //this is done in O(N^2)
    }

    public static int findCountInOrderOfN(int arr[]){
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
        return arr.length-count;
    }

    public static void main ( String[] args ) {
        int arr[] = {3,-2,5,7,10,4,5,3,10,5};
        //System.out.println (findCount ( arr ));
        System.out.println (findCountInOrderOfN ( arr ));
    }
}
