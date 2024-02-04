package javaPractice;
import java.util.*;

//Program to write Sum, Average, and Product of three numbers
public class Sum_Avg_Product {
    class Calculation{
    static double n1,n2,n3;

    public static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        n1 = sc.nextDouble();
        System.out.println("Enter number 2: ");
        n2 = sc.nextDouble();
        System.out.println("Enter number 3: ");
        n3 = sc.nextDouble();
       System.out.println(n1+n2+n3);
       sc.close();
    }

    public static void average(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        n1 = sc.nextDouble();
        System.out.println("Enter number 2: ");
        n2 = sc.nextDouble();
        System.out.println("Enter number 3: ");
        n3 = sc.nextDouble();
        System.out.println((n1+n2+n3)/3);
        sc.close();
    }

    public static void product(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        n1 = sc.nextDouble();
        System.out.println("Enter number 2: ");
        n2 = sc.nextDouble();
        System.out.println("Enter number 3: ");
        n3 = sc.nextDouble();
        System.out.println( n1*n2*n3);
        sc.close();
    }

    public static void choose(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Sum");
        System.out.println("2. Average");
        System.out.println("3. Product");
        int choice = sc.nextInt();
        if(choice == 1){
            sum();
        }else if(choice == 2){
            average();
        }else if(choice == 3){
            product();
        }else System.out.println("wrong choice selected..");
        sc.close();
    }
    }
    public static void main(String[] args) {
       Calculation.choose();
    }
    
}
