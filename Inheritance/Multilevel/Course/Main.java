package Multilevel.Course;
public class Main {
    public static void main(String[] args) {
        PaidOnlineCourse c = new PaidOnlineCourse(
            "Java Programming", 30, "Udemy", true, 5000, 1000
        );
        c.displayInfo();
    }
}