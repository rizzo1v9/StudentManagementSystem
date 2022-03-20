import java.util.Scanner;

// Basic student class which will prompt the user to enter in their details
public class Student {

    private int studentID = 0;
    private String firstName;
    private String lastName;
    private String email;
    private String emailSnip;
    private int numOfCourses;
    private double balance;

    // The constructor will create the format required to generate unique email addresses for every student
    // It will also generate a mock balance of 2500 per class enrolled in
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the student's first name: ");
        this.firstName = in.nextLine();
        System.out.println("Enter the student's last name: ");
        this.lastName = in.nextLine();
        this.email = Character.toLowerCase(firstName.charAt(0)) + lastName.toLowerCase() + "@school.edu";
        this.emailSnip = Character.toLowerCase(firstName.charAt(0)) + lastName.toLowerCase();
        System.out.println("Enter the number of courses the student is taking: ");
        this.numOfCourses = Integer.parseInt(in.nextLine());
        this.balance = numOfCourses * 2500;
        System.out.println("Press Q to quit");
    }

    // Getters and Setters
    public void setStudentID(int newStudentID){
        this.studentID = newStudentID;
    }

    public int getStudentID(){
        return this.studentID;
    }

    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setEmail(String firstName, String lastName, int count){
        this.email = Character.toLowerCase(firstName.charAt(0)) + lastName.toLowerCase() + "@school.edu";
    }

    public String getEmail() {
        return this.email;
    }

    public String getEmailSnip(){
        return this.emailSnip;
    }

    public void setEmailSnip(){
        this.emailSnip = Character.toLowerCase(firstName.charAt(0)) + lastName.toLowerCase();
    }

    public void setNumOfCourses(int newNumOfCourses){
        this.numOfCourses = newNumOfCourses;
    }

    public int getNumOfCourses(){
        return this.numOfCourses;
    }

    public void setBalance(int numOfCourses){
        this.balance = numOfCourses * 2500;
    }

    public double getBalance(){
        return this.balance;
    }

    // Method so the student can make a payment
    public void makePayment(double balance, double payment){
        this.balance -= payment;
    }

}
