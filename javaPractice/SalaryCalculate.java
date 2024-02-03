package javaPractice;
import java.util.*;

public class SalaryCalculate {
    double basicSalary;
    double bonus;
    double incomeTax;
    double grossSalary;
    public void calculateGrossSalary(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Salary: ");
        basicSalary = sc.nextDouble();
        System.out.println("Bonus: ");
        bonus = sc.nextDouble();
        grossSalary = basicSalary+bonus;
        System.out.println(grossSalary);
        sc.close();
    }

    public void calculateNetSalary(){
        double netSalary = grossSalary-((2.5/100) * basicSalary);
        System.out.println(netSalary);
    }
    public static void main(String[] args) {
        SalaryCalculate s = new SalaryCalculate();
        s.calculateGrossSalary();
        s.calculateNetSalary();
    }
}
