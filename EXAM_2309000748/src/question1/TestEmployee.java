package question1;

import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee Id: ");
        int id = scanner.nextInt();
        scanner.nextLine();  
        System.out.println("Enter Employee First Name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter Employee Last Name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter Employee Salary: ");
        int salary = scanner.nextInt();

        Employee employee = new Employee(id, firstName, lastName, salary);

        System.out.println("Employee Information:");
        System.out.println("ID: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Monthly Salary: $" + employee.getSalary());
        System.out.println("Annual Salary: $" + employee.getAnnualSalary());

        System.out.print("Enter percentage to raise salary: ");
        double percentage = scanner.nextDouble();
        int newSalary = employee.raiseSalary(percentage);

        System.out.println("New Salary after raise: $" + newSalary);

        System.out.println(employee);

        scanner.close();
    }
}

