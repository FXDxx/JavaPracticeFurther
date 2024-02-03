package javaPractice;

import java.util.Scanner;

public class GallonToLitre {
   
    static double gallon;
    static double litre;

    // gallon to litre
    public static void convertToLitre(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Gallon: ");
        gallon = sc.nextDouble();
        litre = (gallon *3.78541);
        System.out.println("Converting...");
        System.out.println("Litre: "+litre);
        sc.close();
    }
    //litre to gallon
    public static void convertToGallon(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Litre: ");
        litre = sc.nextDouble();
        gallon = litre/3.78541;
        System.out.println("Converting...");
        System.out.println("Gallon: "+gallon);
        sc.close();
    }

    public static void choose(){
        System.out.println("Press 1 to convert from gallon to litres\nPress 2 to convert from litre to gallon");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.println("You have selected option 1..");
            convertToLitre();
        }else if(choice == 2){
            convertToGallon();
        }else System.out.println("Get lost freak..");
        sc.close();
    }
    
    public static void main(String[] args) {
        GallonToLitre.choose();
        
    }
    
}
