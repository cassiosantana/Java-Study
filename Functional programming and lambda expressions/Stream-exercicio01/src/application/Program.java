package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(st1.toList());

        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(st2.toList());

        Stream<Integer> st3 = Stream.iterate(0, x -> (x + 2) * 3);
        System.out.println(st3.limit(10).toList());

        Stream<Long> st4 = Stream.iterate(new Long[]{0L, 1L}, p -> new Long[]{p[1], p[0] + p[1]}).map(p -> p[0]).limit(20);
        System.out.println(Arrays.toString(st4.toArray()));
    }
}
