package Recurssion;
import java.util.*;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int Result = powers(n);
        System.out.println(Result);
    }
    static int powers(int n){
        int p = 0;
        if(n == 1)
            return 2;
        p = 2 * powers(n-1);
        return p;
        
    }
}
