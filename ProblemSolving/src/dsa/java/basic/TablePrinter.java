package dsa.java.basic;

public class TablePrinter {
    public static void printTable(int number){
        int no=1;
        while(no<=10){
            System.out.println (number+" x "+no+" = "+number*no);
            no=no+1;
        }
    }
}
