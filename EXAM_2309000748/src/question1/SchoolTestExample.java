package question1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class SchoolTestExample {
	    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/School";
	    private static final String USER = "your_username";
	    private static final String PASSWORD = "your_password";

	    public static void main(String[] args) {
	        try {
	            Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
	            
	            insertStudent(connection, "Emmy", "B", "Male", "123");
	            retrieveStudents(connection);
	            connection.close();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    private static void insertStudent(Connection connection, String firstName, String lastName, String gender, String registrationNumber) throws SQLException {
	        String insertQuery = "INSERT INTO Students (first_name, last_name, gender, registration_number) VALUES (?, ?, ?, ?)";

	        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
	            preparedStatement.setString(1, firstName);
	            preparedStatement.setString(2, lastName);
	            preparedStatement.setString(3, gender);
	            preparedStatement.setString(4, registrationNumber);

	            int affectedRows = preparedStatement.executeUpdate();
	            System.out.println("Inserted " + affectedRows + " row(s) into Students table.");
	        }
	    }

	    private static void retrieveStudents(Connection connection) throws SQLException {
	        String selectQuery = "SELECT * FROM Students";

	        try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
	             ResultSet resultSet = preparedStatement.executeQuery()) {

	            System.out.println("Student records:");

	            while (resultSet.next()) {
	                String firstName = resultSet.getString("first_name");
	                String lastName = resultSet.getString("last_name");
	                String gender = resultSet.getString("gender");
	                String registrationNumber = resultSet.getString("registration_number");

	                System.out.println("Name: " + firstName + " " + lastName + ", Gender: " + gender + ", Registration Number: " + registrationNumber);
	            }
	        }
	    }
}
