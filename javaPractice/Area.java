package javaPractice;
import java.util.*;

// Program to calculate the Area and Perimeter of Square, Rectangle, Circle and Triangle
public class Area {
    
    static double l,b,r,h;
    static double area,peri;


    public static void calculateAreaOfSquare(){
        Scanner sc = new Scanner(System.in);
        System.out.println("To calculate area of square..");
        System.out.println("Enter length of one side of square: ");
        l = sc.nextDouble();
        area = l*l;
        System.out.println("Area of Square: "+area);
        sc.close();
    }
    public static void calculateAreaOfRectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("To calculate area of Rectangle..");
        System.out.println("Enter length: ");
        l = sc.nextDouble();
        System.out.println("Enter width: ");
        b = sc.nextDouble();
        area = l*b;
        System.out.println("Area of Rectangle: "+area);
        sc.close();
    }
    public static void calculateAreaOfCircle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("To calculate area of circle..");
        System.out.println("Enter radius: ");
        r = sc.nextDouble();
        area = 2*3.142*r;
        System.out.println("Area of circle: "+area);
        sc.close();
    }

    public static void calculateAreaOfTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("To calculate area of triangle..");
        System.out.println("Enter Base: ");
        b = sc.nextDouble();
        System.out.println("Enter height: ");
        h = sc.nextDouble();
        area = 1/2*(b*h);
        System.out.println("Area of triangle: "+area);
        sc.close();
    }

    public  static void perimeterOfSquare(){
        Scanner sc = new Scanner(System.in);
        System.out.println("To calculate perimeter of square..");
        System.out.println("Enter length: ");
        l = sc.nextDouble();
        peri = 4*l;
        System.out.println("Perimeter of Square: "+peri);
        sc.close();
    }

    public  static void perimeterOfRectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("To calculate perimeter of rectangle..");
        System.out.println("Enter length: ");
        l = sc.nextDouble();
        System.out.println("Enter width: ");
        b = sc.nextDouble();
        peri = 2*(l+b);
        System.out.println("Perimeter of Rectangle: "+peri);
        sc.close();
    }
    public  static void perimeterOfCircle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("To calculate perimeter of circle..");
        System.out.println("Enter radius: ");
        r = sc.nextDouble();
        peri = 2*3.14*r;
        System.out.println("Perimeter of Circle: "+peri);
        sc.close();
    }
    public  static void perimeterOfTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("To calculate perimeter of triangle..");
        System.out.println("Enter length: ");
        l = sc.nextDouble();
        System.out.println("Enter width: ");
        b = sc.nextDouble();
        System.out.println("Enter height: ");
        h = sc.nextDouble();
        peri = l+b+h;
        System.out.println("Perimeter of Triangle: "+peri);
        sc.close();
    }


    public static void chooseArea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Area of Square");
        System.out.println("2. Area of Rectangle");
        System.out.println("3. Area of Circle");
        System.out.println("4. Area of Triangle");

        int choice = sc.nextInt();
        if(choice == 1){    
            System.out.println("Area of Square");
            calculateAreaOfSquare();
        }else if(choice == 2){
            System.out.println("Area of Rectangle");
            calculateAreaOfRectangle();
        }else if(choice == 3){
            System.out.println("Area of Circle");
            calculateAreaOfCircle();
        }else{ System.out.println("Area of Triangle");
            calculateAreaOfTriangle();
        }
        sc.close();
    }

    public static void choosePerimeter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Perimeter of Square");
        System.out.println("2. Perimeter of Rectangle");
        System.out.println("3. Perimeter of Circle");
        System.out.println("4. Perimeter of Triangle");

        System.out.println("Select: ");

        int choice = sc.nextInt();
        if(choice == 1){    
            System.out.println("Perimeter of Square");
            perimeterOfSquare();
        }else if(choice == 2){
            System.out.println("Perimeter of Rectangle");
            perimeterOfRectangle();
        }else if(choice == 3){
            System.out.println("Perimeter of Circle");
            perimeterOfCircle();
        }else{ System.out.println("Perimeter of Triangle");
            perimeterOfTriangle();
        }
        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Area and Perimeter of Shapes");
        System.out.println("1. Area Calculation");
        System.out.println("2. Perimeter Calculation");
        System.out.println("Select: ");
        int select = sc.nextInt();
        System.out.println("Selected: "+select);
        if(select == 1){
            chooseArea();
        }else choosePerimeter();

        sc.close();
    }
}
