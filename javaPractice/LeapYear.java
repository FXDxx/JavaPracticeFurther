package javaPractice;
import java.util.*;

// Program to check the leap year.
public class LeapYear {
    static int year;
    static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        year = sc.nextInt();
        if(year % 4 == 0){
            System.out.println("leap year..");
        }else System.out.println("Not a leap year");

        sc.close();
    }
}
