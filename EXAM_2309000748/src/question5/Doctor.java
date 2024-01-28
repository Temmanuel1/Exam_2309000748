package question5;

import java.util.Scanner;

public class Doctor {
	    private int doctorId;
	    private String doctorName;
	    private String email;
	    private String phoneNumber;
	    
	    public Doctor(int doctorId, String doctorName, String email, String phoneNumber) {
	        this.doctorId = doctorId;
	        this.doctorName = doctorName;
	        this.email = email;
	        this.phoneNumber = phoneNumber;
	    }
	    public void insert() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter Doctor ID: ");
	        doctorId = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline character

	        System.out.println("Enter Doctor Name: ");
	        doctorName = scanner.nextLine();

	        System.out.println("Enter Email: ");
	        email = scanner.nextLine();

	        System.out.println("Enter Phone Number: ");
	        phoneNumber = scanner.nextLine();
	    }
	    public void display() {
	        System.out.println("Doctor ID: " + doctorId);
	        System.out.println("Doctor Name: " + doctorName);
	        System.out.println("Email: " + email);
	        System.out.println("Phone Number: " + phoneNumber);
	    }
	}
