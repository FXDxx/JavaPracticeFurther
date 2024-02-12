package javaPractice;
import java.util.*;

//Program to calculate factorial using while
public class FactorialUsingWhileLoop {
    static int num;
    static int i = 1;
    static int fact = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        num  = sc.nextInt();
        while(i <= num){
            fact*=i;
            i++;
        }
        System.out.println(fact);
        sc.close();
    }
}
