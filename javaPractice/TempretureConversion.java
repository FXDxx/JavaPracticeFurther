package javaPractice;
import java.util.*;

//Program to convert tempreture from celsius to farenheit and vice versa
public class TempretureConversion {
    static double celsius,fahrenheit;

    public static void FahrenheitToCelsius(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Fahrenheit tempreture: ");
        fahrenheit = sc.nextDouble();
        celsius = (fahrenheit-32)*5/9;
        System.out.println(celsius);

        sc.close();
    }

    public static void CelsiusToFahrenheit(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Celsius tempreture: ");
        celsius = sc.nextDouble();
        fahrenheit = (celsius*9/5)+32;
        System.out.println(fahrenheit);

        sc.close();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("...Tempreture Convertor...");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        int choice = sc.nextInt();

        if(choice == 1){
        FahrenheitToCelsius();
            
        }else if(choice == 2){
            CelsiusToFahrenheit();
        }else System.out.println("Wrong operation");

        sc.close();
    }
}
