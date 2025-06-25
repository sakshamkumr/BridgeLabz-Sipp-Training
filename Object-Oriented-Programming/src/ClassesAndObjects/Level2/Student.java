package ClassesAndObjects.Level2;

import ClassesAndObjects.Level1.MobilePhone;

public class Student {
    String name;
    long rollNo;

    double marks;

    public Student(String name, long rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    public double getGrades(double marks){
        return (marks/300)*100;
    }
    public void displayDetails(Student s1){
        System.out.println("Name: " + s1.name + "\n Roll No: " + s1.rollNo + "\n Marks: " + s1.marks + "\n Grade: " + getGrades(marks));
    }

    public static void main(String[] args) {
        Student s1 = new Student("Jaguar", 2015, 100);
        s1.displayDetails(s1);
    }
}
