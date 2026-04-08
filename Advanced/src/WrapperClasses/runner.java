package WrapperClasses;

public class runner <K,V>{
    public static void main() {
        Box1<Integer> b1 = new Box1<>();
        b1.setValue(11);
        int value1 = b1.getValue();
        System.out.println("value1 :- " + value1);


        Box2<String> b2 = new Box2<>();
        b2.setValue("meow");
        String value2 = b2.getValue();
        System.out.println("value2 :- " + value2);
//////////////////////          BOX-3          /////////////////////////////////////////////////////////



    }

}
