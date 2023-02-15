package Recurssion;
import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int Result = Sums(n);
        System.out.println(Result);
    }

    static int Sums(int n){
        int sum = 0;
        if(n == 1)
            return 1;
       sum =  n + Sums(n-1);
       return sum;
    }
}
