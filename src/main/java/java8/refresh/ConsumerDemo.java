package java8.refresh;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// CONSUMES AN INPUT AND NO OUTPUT

public class ConsumerDemo {

    public static void main(String[] args) {
        Consumer<String> consumer =(s) ->
                System.out.println(s);
        consumer.accept("Hello");

        System.out.println("--------------------------------------------------------------");
        //example2 - consumer chaining
        Consumer<String> c1 = (input) ->System.out.println(input + " World!!");
        Consumer<String> c2 = (input) ->System.out.println(input + " Java!!");
        c1.andThen(c2).accept("hello ");

        System.out.println("--------------------------------------------------------------");
        //forEach uses Consumer
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8);
        integers.forEach( (elem) -> System.out.println(elem) );

        System.out.println("--------------------------------------------------------------");
    }
}
