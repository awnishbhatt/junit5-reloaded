package java8.refresh.streams;

import java.util.*;
import java.util.stream.Stream;

public class CreateStreamObjects {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("a", "b", "c");
        stream.forEach((e) -> System.out.println(e));

        Stream<String> stream2 = Stream.of("a", "b", "c");
        stream2.forEach(System.out::println);

        Collection<String> collection = Arrays.asList("aa", "bb", "cc");
        collection.stream().forEach(System.out::println);

        List<String> list = Arrays.asList("aaa", "bbb", "ccc");
        list.stream().forEach(System.out::println);

        Set<String> set = new HashSet<>(list);
        set.stream().forEach(System.out::println);

        String[] arr = {"aaaa", "bbbb", "cccc"};
        Stream<String> stream1 = Arrays.stream(arr);
        stream1.forEach(System.out::println);


    }
}
