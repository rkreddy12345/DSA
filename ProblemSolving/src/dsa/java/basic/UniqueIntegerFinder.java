package dsa.java.basic;

public class UniqueIntegerFinder {
    public static void main ( String[] args ) {
        int[] arr={4,3,5,9,5,4,12,3,12};

       /* boolean isUnique;
        for(int i=0; i<arr.length; i++){
            isUnique=true;
            for(int j=0; j<arr.length; j++){
                if (i != j && arr[i]==arr[j]) {
                    isUnique=false;
                    break;
                }
            }
            if(isUnique){
                System.out.println (arr[i]);
                break;
            }
        }*/

        int result=0;
        for(int i=0; i<arr.length; i++){
            result=result^arr[i];
        }
        System.out.println (result);
        //System.out.println (1<<6);  this gives 2 power 6
        //System.out.println (Math.pow ( 2,6 ));
    }
}
