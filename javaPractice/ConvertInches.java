package javaPractice;
import java.util.Scanner;


public class ConvertInches {
    Scanner sc = new Scanner(System.in);

    //Inches
    public void inchesToFeetAndYard(){
        System.out.println("1. inch->feet");
        System.out.println("2. inch->yard");
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.println("you have selected option 1..Inches to feet");
            inchToFeet();
        }else if(choice == 2){
            System.out.println("you have selected option 2..Inches to yard");
            inchToYard();
        }
    }

    //inch -> feet
    public void inchToFeet(){
        double inch,feet;
        System.out.println("Enter inches: ");
        inch = sc.nextDouble();
        System.out.println("Converting inches to feet..");
        feet = inch*0.0833;
        System.out.println(feet);
    }

    //inch -> yard
    public void inchToYard(){
        double inch,yard;
        System.out.println("Enter inches: ");
        inch = sc.nextDouble();
        System.out.println("Converting inches to yard..");
        yard = inch*0.0278;
        System.out.println(yard);
    }

    //Feet
    public void feetToInchesAndYard(){
        System.out.println("1. feet->inch");
        System.out.println("2. feet->yard");
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.println("Feet to Inches");
            feetToInches();
        }else if(choice == 2){
            System.out.println("Feet to yard");
            feetToYard();
        }else System.out.println("Get lost freak..");
    }

    //feet -> inches
    public void feetToInches(){
        double inch,feet;
        System.out.println("Enter Feet: ");
        feet = sc.nextDouble();
        System.out.println("Converting feet to inches..");
        inch = feet/0.0833;
        System.out.println(inch);
    }
    //feet -> yard
    public void feetToYard(){
        double yard,feet;
        System.out.println("Enter Feet: ");
        feet = sc.nextDouble();
        System.out.println("Converting feet to yard..");
        yard = feet/3;
        System.out.println(yard);
    }
    //Yard
    public void yardToInchesAndFeet(){
        System.out.println("1. Yard->inch");
        System.out.println("2. Yard->feet");
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.println("Yard to Inches");
            yardToInches();
        }else if(choice == 2){
            System.out.println("yard to feet");
            yardToFeet();
        }else System.out.println("Get lost freak..");

    }

    //yard to inches
    public void yardToInches(){
        double inch,yard;
        System.out.println("Enter Yard: ");
        yard = sc.nextDouble();
        System.out.println("Converting feet to inches..");
        inch = yard/0.0278;
        System.out.println(inch);
    }

    //yard to feet
    public void yardToFeet(){
        double yard,feet;
        System.out.println("Enter Feet: ");
        yard = sc.nextDouble();
        System.out.println("Converting feet to yard..");
        feet = yard * 3;
        System.out.println(feet);
    }

    public void Choose(){
        System.out.println("1. Inches to other");
        System.out.println("2. Feet to other");
        System.out.println("3. yard to other");
        System.out.println("Enter choice: ");
        int choice = sc.nextInt();
        if(choice == 1){
            inchesToFeetAndYard();
        }else if(choice == 2){
           feetToInchesAndYard();
        }else if(choice == 3){  
            yardToInchesAndFeet();
        }else System.out.println("Get lost freak..");

    }

    public static void main(String[] args) {
        ConvertInches c = new ConvertInches();
        c.Choose();
        
    }
}
