package java8.refresh;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//TAKES ONE INPUT AND RETURNS ONE OUTPUT (THE RESULT)
//R apply(T t)
public class FunctionDemo{
    public static void main(String[] args) {
        //1..
        /*
        Function<String,Integer> func = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        */

        //2..
        //Function<String,Integer> func = (String s) -> {return s.length();};

        //3
        //Function<String,Integer> func = (String s) -> s.length();

        //4
        Function<String,Integer> func = s -> s.length();

        System.out.println(func.apply("HOLAS"));

        System.out.println("--------------------------------------------------------------");
        // usage in Stream
        List<String> numbers =Arrays.asList("one", "two", "three", "four");

        List<Integer> strLength = numbers.stream().map(str -> str.length()).collect(Collectors.toList());

        System.out.println(strLength);

    }
}
