package javaPractice;
import java.util.*;

// Program to check if number is prime or not
public class CheckPrimenum {
   
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        if(n<=3){
            return true;
        }

        if(n%2 == 0 || n %3 == 0) return false;
        for(int i = 5; i*i<=n;i+=6){
            if(n%i == 0 || n %(i+2) == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        
        if(isPrime(num)){
            System.out.println("Number is prime..");
        }else System.out.println("Number is not prime.");
        sc.close();
    }
       
    }

