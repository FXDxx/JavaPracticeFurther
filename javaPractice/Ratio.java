package javaPractice;
import java.util.*;

// Program to calculate ratio between two numbers
public class Ratio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1,val2;
        double ratio;

        System.out.println("Enter first number: ");
        val1 = sc.nextInt();

        System.out.println("Enter second number: ");
        val2 = sc.nextInt();

        ratio = (double)val1/val2; //type casting for efficient ratio 
        System.out.println("Ratio of two number: "+val1+":"+val2+" is "+ratio);
        sc.close();
    }
}
