package javaPractice;
import java.util.*;

//CALCULATOR

public class Calculator {

    public static void calculateValues(){
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("..CALCULATOR..");
        System.out.println("Enter Number 1: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter Number 2: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter Operation to perform");
        System.out.println("1. Add numbers");
        System.out.println("2. Substract numbers");
        System.out.println("3. Multiply numbers");
        System.out.println("4. Divide numbers");
        int choice = sc.nextInt();


        switch(choice){
            case 1:
            double sum = num1+num2;
            System.out.println("Sum: "+sum);
            break;
            case 2:
            double minus = num1-num2;
            System.out.println("Substraction: "+minus);
            break;
            case 3:
            double multi = num1*num2;
            System.out.println("Multiplication: "+multi);
            break;
            case 4:
            double div = num1/num2;
            System.out.println("Division: "+div);
            break;
            default:
            System.out.println("Wrong Operation");
            break;
        }
        sc.close();

    }
}
