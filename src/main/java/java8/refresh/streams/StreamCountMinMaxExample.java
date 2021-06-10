package java8.refresh.streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamCountMinMaxExample {

    public static void main(String[] args) {
        System.out.println(Stream.of(1,2,3,4,5,6,7,8,9).count());

        System.out.println(Stream.of(1,2,3,4,5,6,7,8,9).min(Comparator.comparing(Integer::valueOf)));

    }

}
