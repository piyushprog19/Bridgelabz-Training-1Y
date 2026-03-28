package problem_5.Clone;
class Student implements Cloneable {
    String name;

    Student(String name) {
        this.name = name;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}