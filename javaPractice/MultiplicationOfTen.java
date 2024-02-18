package javaPractice;
import java.util.*;

//Program to write multiplication table upto 10
public class MultiplicationOfTen {

    public static void multiTwo(){
        int num = 2;
        int y;
       for(int i = 1;i<=10;i++){
            y = num*i;
            System.out.print(y+"_");
       }
    }

    public static void multiThree(){
        int num = 3;
        int y;
       for(int i = 1;i<=10;i++){
            y = num*i;
            System.out.print(y+"_");
       }
    }

    public static void multiFour(){
        int num = 4;
        int y;
       for(int i = 1;i<=10;i++){
            y = num*i;
            System.out.print(y+"_");
       }
    }
    public static void multiFive(){
        int num = 5;
        int y;
       for(int i = 1;i<=10;i++){
            y = num*i;
            System.out.print(y+"_");
       }
    }

    public static void multiSix(){
        int num = 6;
        int y;
       for(int i = 1;i<=10;i++){
            y = num*i;
            System.out.print(y+"_");
       }
    }

    public static void multiSeven(){
        int num = 7;
        int y;
       for(int i = 1;i<=10;i++){
            y = num*i;
            System.out.print(y+"_");
       }
    }

    public static void multiEight(){
        int num = 8;
        int y;
       for(int i = 1;i<=10;i++){
            y = num*i;
            System.out.print(y+"_");
       }
    }

    public static void multiNine(){
        int num = 9;
        int y;
       for(int i = 1;i<=10;i++){
            y = num*i;
            System.out.print(y+"_");
       }
    }
    public static void multiTen(){
        int num = 10;
        int y;
       for(int i = 1;i<=10;i++){
            y = num*i;
            System.out.print(y+"_");
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Multiples upto 10");
        System.out.println("1. Table of 2");
        System.out.println("2. Table of 3");
        System.out.println("3. Table of 4");
        System.out.println("4. Table of 5");
        System.out.println("5. Table of 6");
        System.out.println("6. Table of 7");
        System.out.println("7. Table of 8");
        System.out.println("8. Table of 9");
        System.out.println("9. Table of 10");
        System.out.println("Select: ");
       int choice = sc.nextInt();
       System.out.println("Selected: "+choice);

       switch(choice){
        case 1:
        multiTwo();
        break;
        case 2:
        multiThree();
        break;
        case 3:
        multiFour();
        break;
        case 4:
        multiFive();
        break;
        case 5:
        multiSix();
        break;
        case 6:
        multiSeven();
        break;
        case 7:
        multiEight();
        break;
        case 8:
        multiNine();
        break;
        case 9:
        multiTen();
        break;
        default:
        System.out.println("This Multiplicative table is not included.");
        
       }

       sc.close();

    }
}
