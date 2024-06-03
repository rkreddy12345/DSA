package dsa.java.arrays;

public class ArrayProblem8 {

    public static int returnStartToEndSum(int[] arr, int s, int e){
        int sum=0;
        for(int i=s; i<=e; i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main ( String[] args ) {
        int[] arr={-3,6,2,4,5,2,8,-9,3,1};
        System.out.println (returnStartToEndSum ( arr, 1, 3 ));
        System.out.println (returnStartToEndSum ( arr, 0, 2 ));
    }
}
