package javaPractice;
import java.util.*;

//Program to write square root of numbers from 1 to 10
public class SquareRoot1To10 {
    static double num;
    static double sqrnum;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //By for loop
        // for(int i = 1; i<= 10;i++){
        //     sqrnum = Math.sqrt(i);
        //     System.out.println(sqrnum);
            
        // }

        //using while loop
        while(num != -1){
            System.out.println("Enter number: ");
            num = sc.nextDouble();

            sqrnum = Math.sqrt(num);
            System.out.println(sqrnum);
        }
        sc.close();
        
    }
}
