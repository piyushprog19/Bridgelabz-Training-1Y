public class question4 {
    public void WrappComparison(){
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;
        System.out.println("a == b :- " + (a==b));
        System.out.println("c == d :- " + (c==d));
    }
    public static void main(String[] args) {
        question4 q4 = new question4();
        q4.WrappComparison();
    }
}