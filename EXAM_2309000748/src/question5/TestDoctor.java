package question5;
import java.util.Scanner;
public class TestDoctor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter details for the Doctor:");
	        Doctor doctor = new Doctor(0, "", "", "");
	        doctor.insert();
	        System.out.println("\nDoctor Information:");
	        doctor.display();
	        scanner.close();
	    }
}
