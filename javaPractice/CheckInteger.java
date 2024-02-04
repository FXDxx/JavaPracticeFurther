package javaPractice;
import java.util.*;

// Program to check whether given integer is positive, negative or zero
// Program to display list of 10 numbers and also show +ve,-ve with number
public class CheckInteger {

    //check whether given integer is positive, negative or zero
    public static void check(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer value: ");
        int number = sc.nextInt();
        if(number > 0){
            System.out.println("Positive integer");
        }else if(number < 0){
            System.out.println("Negative integer");
        }else if(number == 0){
            System.out.println("ZERO");
        }else System.out.println("Invalid input");
        sc.close();

    }

    //list of 10 numbers and also show +ve,-ve with number
    public static void checkList(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer values: ");
    
        for(int i = 1;i<=10;i++){
            System.out.println("Number: ");
            int number = sc.nextInt();
        
        if(number > 0){
            System.out.println("Positive integer");
        }else if(number < 0){
            System.out.println("Negative integer");
        }else if(number == 0){
            System.out.println("ZERO");
        }else System.out.println("Invalid input");
    }
        sc.close();
    }

    public static void choose(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Check Integer");
        System.out.println("2. Check multiple integers");
        int choice = sc.nextInt();
        if(choice == 1){
            check();
        }else if(choice == 2){
            checkList();
        }else System.out.println("Get lost freak...");
        sc.close();
    }
    public static void main(String[] args) {
     CheckInteger.choose();
        
    }
}
