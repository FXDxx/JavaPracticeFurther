package javaPractice;
import java.util.*;

// Program to calculate the factorial using for loop
public class FactorialUsingForLoop {
    static  int num;
    static int fact = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find factorial: ");
        num = sc.nextInt();
        for(int i = 1;i<=num;i++){
            fact*=i;
        }
        System.out.println("Factorial of number: "+fact);
    }
}
