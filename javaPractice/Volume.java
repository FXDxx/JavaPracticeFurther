package javaPractice;
import java.util.*;

//Program to calculate to Volume of Cylinder, cube and sphere
public class Volume {

    static double r,h,a;
    static double vol;

    public static void volumeOfCylinder(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        r = sc.nextDouble();
        System.out.println("Enter height: ");
        h = sc.nextDouble();
        vol = 3.14*r*r*h;
        System.out.println("Volume of Cylinder: "+vol);
        sc.close();
    }
    public static void volumeOfCube(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = sc.nextDouble();
        vol = a*a*a;
        System.out.println("Volume of Cube: "+vol);
        sc.close();
    }

    public static void volumeOfSphere(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        r = sc.nextDouble();
        vol = 4/3*3.142*(r*r*r);
        System.out.println("Volume of Sphere: "+vol);
        sc.close();
    }

    public static void choose(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Volume of Cylinder");
        System.out.println("2. Volume of Cube");
        System.out.println("3. Volume of Sphere");
        int choice = sc.nextInt();
        System.out.println("Selected: "+ choice);
        if(choice == 1){
            System.out.println("Volume of Cylinder..");
            volumeOfCylinder();
        }else if(choice == 2){
            System.out.println("Volume of Cube..");
            volumeOfCube();
        }else {System.out.println("Volume of Sphere: ");
            volumeOfSphere();
    }
        sc.close();
    }
    public static void main(String[] args) {
        choose();
    }
}
