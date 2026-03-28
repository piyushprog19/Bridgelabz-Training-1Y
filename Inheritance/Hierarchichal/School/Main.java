package Hierarchichal.School;
public class Main {
    public static void main(String[] args) {

        Teacher t = new Teacher("Piyush", 30, "Mathematics");
        Student s = new Student("Rahul", 20, "A");
        Staff st = new Staff("Anita", 35, "Administration");

        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}