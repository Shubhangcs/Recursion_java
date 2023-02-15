package Recurssion;
import java.util.*;
public class Fibbanoci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int result = fibo(n);
        System.out.println(result);
    }
    static int fibo(int n){
        int f = 0;
        if(n == 0)
            return 0;
        else if (n == 1)
            return 1;
        f = (fibo(n-1) + fibo(n-2));
        return f;
    }
}
