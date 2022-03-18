public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private int studentID;
    private int numOfCourses;
    private int balance;


    public Student(String firstName, String lastName, String email, int studentID, int numOfCourses, int balance){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.studentID = studentID;
        this.numOfCourses = numOfCourses;
        this.balance = balance;

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

    public void setEmail(String firstName, String lastName){
        this.email = Character.toLowerCase(firstName.charAt(0)) + lastName.toLowerCase() + "@school.edu";
    }

    public String getEmail(){
        return this.email;
    }

    public void setStudentID(int newStudentID){
        this.studentID = newStudentID;
    }

    public int getStudentID(){
        return this.studentID;
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

    public int getBalance(){
        return this.balance;
    }

    public void makePayment(int balance, int payment){
        this.balance -= payment;


    }

    public static void main(String[] args) {
        Student s = new Student("Carlo", "Rizzo", "", 0, 4, 0);
        s.setEmail(s.firstName, s.lastName);
        System.out.println(s.email);
        s.setBalance(s.numOfCourses);
        s.makePayment(s.balance, 500);
        System.out.println(s.getBalance());

    }


}
