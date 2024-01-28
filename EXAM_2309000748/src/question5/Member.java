package question5;
import java.util.Scanner;
class Member {
    protected int employeeId;
    protected String name;
    protected String phoneNumber;
    protected double registrationFee;
    public Member(int employeeId, String name, String phoneNumber) {
        this.employeeId = employeeId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public void insert() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee ID: ");
        employeeId = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Enter Name: ");
        name = scanner.nextLine();

        System.out.println("Enter Phone Number: ");
        phoneNumber = scanner.nextLine();

        System.out.println("Enter Registration Fee: ");
        registrationFee = scanner.nextDouble();
    }
}

