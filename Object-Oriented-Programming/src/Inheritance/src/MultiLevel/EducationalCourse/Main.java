package MultiLevel.EducationalCourse;

public class Main {
    public static void main(String[] args) {
        PaidOnlineCourse paidCourse = new PaidOnlineCourse(
                "Java Backend Bootcamp", 8, "Udemy", true, 4999.0, 20.0
        );
        paidCourse.displayDetails();
        System.out.println("Effective Fee after Discount: ₹" + paidCourse.getEffectiveFee());
    }
}
