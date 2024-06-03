package dsa.java.arrays;

public class ArrayProblem7 {
    public static int searchElement(int[] arr, int element){
        for(int i=0; i< arr.length; i++){
            if(arr[i]==element)
                return 1;
        }
        return 0;
    }
    public static void main ( String[] args ) {
        int[] arr={3, -2, 6, -4, 8, 3};
        //System.out.println (searchElement ( arr, 90 ));
        System.out.println (searchElement ( arr, 3 ));
    }
}
