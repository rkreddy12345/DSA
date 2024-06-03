package dsa.java.basic;

public class FizzBuzz {
    public static void doFizzBuzz(int num){
        int no=1;
        while(no<=num){
            if(no%3==0 && no%5==0){
                System.out.print("FizzBuzz ");
            } else if (no%3==0) {
                System.out.print ("Fizz ");
            }else if(no%3==0){
                System.out.print ("Buzz ");
            }else{
                System.out.print (no+" ");
            }
            no=no+1;
        }
    }
}
