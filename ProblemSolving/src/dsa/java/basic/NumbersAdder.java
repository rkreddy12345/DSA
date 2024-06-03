package dsa.java.basic;

import java.util.Scanner;

public class NumbersAdder {
    public static int addOneToN(int n){
        int sum=0;
        int count=0;
        while(count<=n){
            sum=sum+count;
            count=count+1;
        }
        return sum;
    }
    public static int addN1ToN2(int n1, int n2){
        int sum=0;
        int count=n1;
        while(count<=n2){
            sum=sum+count;
            count=count+1;
        }
        return sum;
    }
    public static int addGivenNNumbers(int i){
        int sum=0;
        int count=1;
        Scanner scanner=new Scanner ( System.in );
        while(count<=i){
            sum=sum+scanner.nextInt ();
            count=count+1;
        }
        return sum;
    }

    public static int findPower(int n, int p){
        int result=1;
        int count=1;
        while(count<=p){
            result=result*n;
            count=count+1;
        }
        return result;
    }
}
