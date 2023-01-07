import java.util.Scanner;

public class PensionContributionCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mothly salary: ");
        int salary = sc.nextInt();
        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        int contributableSalary;
        double employeeContribution;
        double employerContribution;
        double totalContribution;
        contributableSalary = salary;
        if (contributableSalary > 6000) {
            contributableSalary = 6000;
        }
        if (age <= 55){
            employeeContribution = contributableSalary*0.2;
            employerContribution = contributableSalary*0.17;

        } else if (age <= 60) {
            employeeContribution = contributableSalary*0.13;
            employerContribution = contributableSalary*0.13;
        } else if (age <= 65) {
            employeeContribution = contributableSalary*0.075;
            employerContribution = contributableSalary*0.9;
        } else{
            employeeContribution = contributableSalary*0.05;
            employerContribution = contributableSalary*0.075;
        }
        totalContribution = employeeContribution + employerContribution;
        System.out.printf("The employee's contribution: $%.2f%n", employeeContribution);
        System.out.printf("The employer's contribution: $%.2f%n", employerContribution);
        System.out.printf("The total contribution: $%.2f%n", totalContribution);
    }
}
