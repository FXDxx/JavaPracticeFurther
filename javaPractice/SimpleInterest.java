package javaPractice;
import java.util.*;

public class SimpleInterest {
    double principle;
    double rate;
    double time;

    public static void main(String[] args) {
        SimpleInterest s = new SimpleInterest();
        s.calculateInterest();
    }

    public void calculateInterest(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle");
        principle = sc.nextDouble();
        System.out.println("Enter Rate");
        rate = sc.nextDouble();
        System.out.println("Time: ");
        time = sc.nextDouble();

        double interest = (principle*rate*time);
        System.out.println(interest);
    }
}
