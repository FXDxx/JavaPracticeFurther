package javaPractice;
import java.util.*;

// Program to calculate Greatest common factor and least common multiple

public class GCD_LCM {
    public static int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b){
        return (a*b)/gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Greatest common factor: "+gcd(num1, num2));
        System.out.println("Least common multiple: "+lcm(num1, num2));

        sc.close();
    }
}
