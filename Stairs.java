package Recurssion;
import java.util.*;
public class Stairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        System.out.println(Stairs(n));
    }
    static int Stairs(int n){
        if(n < 0)
            return 0;
        if(n == 0)
            return 1;
        return Stairs(n-1)+Stairs(n-2);
    }
}
