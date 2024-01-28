package question5;
class Kid extends Member {
    public Kid(int employeeId, String name, String phoneNumber) {
        super(employeeId, name, phoneNumber);
    }
    public double discount() {
        return 0.04 * registrationFee;
    }
    public void display() {
        System.out.println("\nKid Member Information:");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println("Discount: " + discount());
    }
}
