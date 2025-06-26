package KeywordsAndInstance;

public class Patient {

    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    private String name;
    private int age;
    private String ailment;
    private final int patientID;


    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }


    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Invalid Patient object.");
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Saksham Agrawal", 22, "Migraine", 301);
        Patient p2 = new Patient("Ananya Mishra", 27, "Flu", 302);

        p1.displayPatientDetails();
        System.out.println();
        p2.displayPatientDetails();

        System.out.println();
        getTotalPatients();
    }
}
