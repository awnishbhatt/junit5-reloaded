package java8.refresh.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex1TryForEach {


    public static void main(String[] args) {
        List<String> str1 = new ArrayList<String>();
        //Collections.addAll(str1, "Delhi","Mumbai","Thane","Bangalore");

        //str1 = List.of("Delhi", "Mumbai", "Thane", "Bangalore"); //java 9

        //str1 = Arrays.asList("Delhi", "Mumbai", "Thane", "Bangalore");

        str1 = Stream.of("Delhi", "Mumbai", "Thane", "Bangalore").collect(Collectors.toList());

        str1.forEach(elem -> System.out.println(elem));

    }
}
