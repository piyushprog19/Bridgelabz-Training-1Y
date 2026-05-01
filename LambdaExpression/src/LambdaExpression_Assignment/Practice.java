package LambdaExpression_Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("This is list :- " +  list);
        System.out.println("This is sorted list :- ");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("This is shuffled list :- ");
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println("This is max element :- " + Collections.max(list));
        System.out.println("This is min element :- " +  Collections.min(list));
        Collections.sort(list, Collections.reverseOrder());

    }
}
