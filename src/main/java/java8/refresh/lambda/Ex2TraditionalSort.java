package java8.refresh.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex2TraditionalSort {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(30, 20, 50, 30, 40, 10);

        Collections.sort(numbers); //ascending
        System.out.println(numbers);

        Collections.reverse(numbers); //descending
        System.out.println(numbers);
    }
}
