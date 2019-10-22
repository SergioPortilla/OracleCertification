package java11.questions.certified.java815;

import java.util.stream.Stream;

public class StreamsJava11 {
    public static void streamsMaps(){
        Stream<Integer> numStream = Stream.of(10, 20, 30);
//        numStream.map(n -> n + 10).peek(s -> System.out.print(s));
        numStream.forEach(s -> System.out.println(s));
    }
}
