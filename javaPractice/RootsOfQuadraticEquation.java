package javaPractice;
import java.util.*;

//Program to calculate the roots using quadratic equation

public class RootsOfQuadraticEquation {
    public static void calculateRoot(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();

        double quad = b*b - 4*a*c;

        if(quad > 0){
            double root1 = -b+Math.sqrt(quad)/2*a;
            double root2 = -b-Math.sqrt(quad)/2*a;
            System.out.println("root 1 = "+root1);
            System.out.println("root 2 = "+root2);
        }else if(quad == 0){
            double root = -b/2*a;
            System.out.println("root = "+root);

        }else{
            double realPart = -b/2*a;
            double imagePart = Math.sqrt(-quad)/(2*a);
            System.out.println("real part =  "+realPart);
            System.out.println("imaginary part = "+imagePart);
        }
        sc.close();
    }
    
    public static void main(String[] args) {
        calculateRoot();
    }
}
