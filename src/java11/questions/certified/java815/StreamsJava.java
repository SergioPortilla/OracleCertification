package java11.questions.certified.java815;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsJava {

    public static void streamsMaps(){
        Stream<Integer> numStream = Stream.of(10, 20, 30);
//        numStream.map(n -> n + 10).peek(s -> System.out.print(s));
        numStream.forEach(System.out::println);
        Integer s = null;
        System.out.println(s);
    }

    public static void streamsForEach(){
        int[] lista = {1, 2, 3, 4};
        System.out.println("Forma de utilizar Stream con Arrays");
        Arrays.stream(lista).forEach(s -> {
            if (lista[lista.length - 1] == s) System.out.println(s);
            else System.out.print(s);
        });

        var lista2 = new ArrayList<>();
        lista2.add(1);
        lista2.add(2);
        lista2.add(3);
        lista2.add(4);

        System.out.println("Forma de utilizar Stream con listas");
        lista2.forEach(System.out::print);
    }
}
