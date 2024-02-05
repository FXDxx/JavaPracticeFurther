package javaPractice;
import java.util.*;

//Program to find grade of a student 
public class GradingStudent {
    public static void marksCalculate(){
        Scanner sc = new Scanner(System.in);
        //Declaration
        double discreteMathematics;
        double oop;
        double communicationSkills;
        double calculus;
        double itm;
        //input values
        System.out.println("Discrete: ");
        discreteMathematics = sc.nextDouble();
        System.out.println("OOP: ");
        oop = sc.nextDouble();
        System.out.println("Communication: ");
        communicationSkills = sc.nextDouble();
        System.out.println("Calculus: ");
        calculus = sc.nextDouble();
        System.out.println("Management: ");
        itm = sc.nextDouble();

        //Marks Obtained
        double obtained = (discreteMathematics+oop+communicationSkills+calculus+itm);
        System.out.println("Total Marks Obtained: "+obtained);

        //Percentage Calculate
        double percentage = (obtained/500)*100;
        System.out.println("Percentage Obtained: "+percentage);

        if(percentage > 90){
            System.out.println("Grade: A*");
        }else if(percentage < 90 && percentage >=80){
            System.out.println("Grade: B");
        }else if(percentage < 80 && percentage >=70){
            System.out.println("Grade: C");
        }else if(percentage <70 && percentage >=60){
            System.out.println("Grade: D");
        }else if(percentage < 60 && percentage >=50){
            System.out.println("Grade: E");
        }else System.out.println("Grade: F");

        sc.close();
    }

    public static void main(String[] args) {
        marksCalculate();
        
    }
}
