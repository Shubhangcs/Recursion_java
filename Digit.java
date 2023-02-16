package Recurssion;
import java.security.SignatureException;
import java.util.*;
public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        String arr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        Din(n , arr);
    }
    static void Din(int n , String[] a){
        if(n == 0)
            return ;
        int di = n%10;
        n = n/10;
        
        Din(n, a);
        System.out.print(a[di]+" ");
    }
}
