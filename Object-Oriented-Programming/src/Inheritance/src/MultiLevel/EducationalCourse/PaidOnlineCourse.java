package MultiLevel.EducationalCourse;

public class PaidOnlineCourse extends OnlineCourse{
    protected double fee;
    protected double discount; // percentage

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded,
                            double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fee: ₹" + fee);
        System.out.println("Discount: " + discount + "%");
    }

    public double getEffectiveFee() {
        return fee - (fee * discount / 100);
    }


}
