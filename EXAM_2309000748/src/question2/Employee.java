package question2;
public class Employee {
	    private int Id;
	    private String FirstName;
	    private String LastName;
	    private int Salary;
	    public Employee(int Id, String FirstName, String LastName, int Salary) {
	        this.Id = Id;
	        this.FirstName = FirstName;
	        this.LastName = LastName;
	        this.Salary = Salary;
	    }
	    public int getId() {
	        return Id;
	    }

	    public String getFirstName() {
	        return FirstName;
	    }

	    public String getLastName() {
	        return LastName;
	    }

	    public String getName() {
	        return FirstName + " " + LastName;
	    }

	    public int getSalary() {
	        return Salary;
	    }
	    public void setSalary(int Salary) {
	        this.Salary = Salary;
	    }
	    public int getAnnualSalary() {
	        return Salary * 12;
	    }
	    public int raiseSalary(double percentage) {
	        double raiseAmount = Salary * (percentage / 100);
	        Salary += raiseAmount;
	        return Salary;
	    }
	    public String toString() {
	        return "Employee[id=" + Id + ", name=" + getName() + ", salary=" + Salary + "]";
	    }
	}

	