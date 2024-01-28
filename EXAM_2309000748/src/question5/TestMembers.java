package question5;
import java.util.Scanner;
public class TestMembers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for the Adult Member:");
        Adult adult = new Adult(0, "", "");
        adult.insert();
        adult.display();
        System.out.println("\nEnter details for the Kid Member:");
        Kid kid = new Kid(0, "", "");
        kid.insert();
        kid.display();

        scanner.close();
    }
}
