import java.sql.*;
import java.util.Scanner;

// This class will connect to the MySQL DB and update it using the Student class
public class JDBCTest {

    public static void main(String[] args) {

        // Creating a Student object and initializing count to 0 to create unique email addresses
        Scanner in = new Scanner(System.in);

            Student s = new Student();
            int count = 0;
            try {
                // Creating a connection to the MySQL DB
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-test", "root", "lucas123");

                // Creating statements and result sets for the different queries we want to execute along with the prepare statement to insert the values
                Statement statement1 = connection.createStatement();
                Statement statement2 = connection.createStatement();
                Statement statement3 = connection.createStatement();
                ResultSet sE = statement1.executeQuery("SELECT email FROM student\n" + "WHERE email LIKE '%" + s.getEmailSnip() + "%'");
                ResultSet sE1 = statement2.executeQuery("SELECT email FROM student");
                PreparedStatement pst = connection.prepareStatement("INSERT INTO student (firstName, lastName, email, balance) VALUES (?,?,?,?)");

                // Using the prepare statement to insert the values from the Student object
                pst.setString(1, s.getFirstName());
                pst.setString(2, s.getLastName());
                // This while loop checks to see if there is already a student with the email trying to be assigned
                // If there is, the new email being entered will have the number at the end of it increase by 1
                // If not, all new emails start at 0
                while (sE1.next()) {
                    if (!sE.next()) {
                        pst.setString(3, s.getEmailSnip() + count + "@school.edu");
                    } else {
                        pst.setString(3, s.getEmailSnip() + count + "@school.edu");
                        count++;
                    }
                }
                pst.setDouble(4, s.getBalance());
                pst.executeUpdate();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
