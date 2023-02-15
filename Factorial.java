package Recurssion;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int Result = Facts(n);
        System.out.println(Result);
    }

    static int Facts(int n){
        int fact = 0;
        if(n == 1 || n==0)
            return 1;
       fact =  n * Facts(n-1);
       return fact;
    }
}
