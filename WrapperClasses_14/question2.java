public class question2 {
    public void wrappToPrim() {
        Double num1 = 53.34;
        double num2 = 53.34;
        int num3 = (int) num2;
        System.out.println("Double :- " + num1);
        System.out.println("double :- " + num2);
        System.out.println("int typecast :- " + num3);
    }
    public static void main(String[] args) {
        question2 q2 = new question2();
        q2.wrappToPrim();
    }
}