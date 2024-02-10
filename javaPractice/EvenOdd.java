package javaPractice;
import java.util.*;

// Program to write whether the number is even or odd
public class EvenOdd {
    static int num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        while(num != -1){
        num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("Even number");
        }else if(num%2 != 0){
            System.out.println("Odd number");
        }
    }}catch(InputMismatchException e){
        System.out.println("Input exceeds range");
    }
    sc.close();
}
}
