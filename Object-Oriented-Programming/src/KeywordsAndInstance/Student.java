package KeywordsAndInstance;

public class Student {

    static String universityName = "NIT Trichy";
    static int totalStudents = 0;


    private String name;
    private final int rollNumber;
    private String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Enrolled Students: " + totalStudents);
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid Student object.");
        }
    }


    public static void main(String[] args) {
        Student s1 = new Student("Saksham Agrawal", 301, "A");
        Student s2 = new Student("Vipul Duve", 302, "A+");

        s1.displayStudentDetails();
        System.out.println();
        s2.displayStudentDetails();

        System.out.println();
        Student.displayTotalStudents();
    }
}
