package problem_5.Clone; 
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("Piyush");
        Student s2 = (Student) s1.clone();

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}