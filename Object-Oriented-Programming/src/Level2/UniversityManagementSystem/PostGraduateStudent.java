package Level2.UniversityManagementSystem;

class PostgraduateStudent extends Student{
    private String project;
    public PostgraduateStudent(int rollNumber, String name, double CGPA,String project) {
        super(rollNumber, name, CGPA);
        this.project = project;
    }
    public void displayDetails() {
        System.out.println("Postgraduate Student");
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
        System.out.println("Thesis Topic: " + project);
    }
}