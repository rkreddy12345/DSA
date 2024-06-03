package dsa.java.arrays;

public class ArrayProblem6{

        public static String findMaxAndMin(int[] arr){
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                for(int i=0; i< arr.length; i++) {
                        if (arr[i] > max) {
                                max = arr[i];
                        }
                        else if (arr[i] < min) {
                                min = arr[i];
                        }
                }
                return max+" "+min;
        }

        public static void main ( String[] args ) {
                int[] arr={1,-3,4,6,3,2,0,2};
                System.out.println (findMaxAndMin ( arr ));
        }
}
