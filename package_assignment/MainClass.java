import college.student.Student;
import college.faculty.Faculty;
public class MainClass {
    public static void main(String[] args) {
        Student s = new Student("Piyush", 101);
        Faculty f = new Faculty("tanmay sir", "Java");

        s.displayStudent();
        f.displayFaculty();
    }
}