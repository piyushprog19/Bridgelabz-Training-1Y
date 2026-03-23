package question_1;
public class Main {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(1, "tanmay sir", 50000);
        Employee e2 = new PartTimeEmployee(2, "piyush", 5, 500);

        Department d1 = (Department) e1;
        Department d2 = (Department) e2;

        d1.assignDepartment("IT");
        d2.assignDepartment("student");

        Employee[] employees = {e1, e2};

        for (Employee e : employees) {
            e.displayDetails();
            Department d = (Department) e;
            System.out.println("Department: " + d.getDepartmentDetails());
            System.out.println();
        }
    }
}