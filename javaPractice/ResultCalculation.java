package javaPractice;

import java.util.Scanner;
// Program to calculate marks percentage and show if student passed or failed..
public class ResultCalculation {
    static class Result{
    static double obtained, total;

    public void studentResult(){
        Scanner sc = new Scanner(System.in);
        double english;
        double urdu;
        double maths;
        double science;
        double islamiat;

        System.out.println("English marks: ");
        english = sc.nextDouble();
        System.out.println("Urdu marks: ");
        urdu = sc.nextDouble();
        System.out.println("Math marks: ");
        maths = sc.nextDouble();
        System.out.println("Science marks: ");
        science = sc.nextDouble();
        System.out.println("Islamiat marks: ");
        islamiat = sc.nextDouble();

        obtained = english+urdu+maths+science+islamiat;
        System.out.println("Marks Obtained: "+obtained+" out of 500");
        total = 500;
        calculatePercentage();
        sc.close();
    }
    
    public static void calculatePercentage(){
        double percentage = (obtained/total) *100;
        System.out.println(percentage);
        if(percentage > 90){
            System.out.println("Congratulation");
        }else if(percentage < 90 && percentage >70){
            System.out.println("Congrats u passed, keep up the hard work");
        }else if(percentage < 70){
            System.out.println("Failed.. try again freak..");
        }else System.out.println("Invalid input try again..");
    }
}
    public static void main(String[] args) {
        Result r = new Result();
        r.studentResult();
    }
}
