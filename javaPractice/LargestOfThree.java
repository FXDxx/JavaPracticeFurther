package javaPractice;
import java.util.*;

// Program to find largest of three numbers
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,k;
        
        try{
        System.out.println("Enter first number: ");
        i = sc.nextInt();
        System.out.println("Enter second number: ");
        j = sc.nextInt();
        System.out.println("Enter third number: ");
        k = sc.nextInt();

        System.out.println(i+" "+j+" "+k);
        if(i> j && i>k){
            System.out.println("First number is largest: "+i);
        }else if(j>i && j>k){
            System.out.println("Second number is largest: "+j);
        }else if(k>i && k>j){
            System.out.println("Third number is largest: "+k);
        }else System.out.println("Largest my foot...");

    }catch(InputMismatchException e){
        System.out.println("Input is not valid");
    }
        sc.close();

    }
}
