package java11.questions.certified.java815;

import java.util.List;
import java.util.Spliterator;

public class ListJava11 {
    public static void trySplitCadena(){
        List<String> strList = List.of("A", "B", "C", "D", "E", "F", "G", "H");
        Spliterator<String> part1 = strList.spliterator().trySplit();

        part1.forEachRemaining(System.out::print /*s -> System.out.print(s)*/);             //✔ ABCD
        part1.trySplit().forEachRemaining(System.out::print /*s -> System.out.println(s)*/);//❌ ABC
        //part1.trySplit((s -> System.out.print(s)); No resuelve metodos Lambda             //❌
        part1.tryAdvance(System.out::println /*(s -> System.out.print(s)*/);                //❌ A
        //part1.forEach(s -> System.out.print(s)); Spliterator no tiene el metodo forEach     ❌
        strList.forEach(System.out::print /*s -> System.out.println(s)*/);                  //❌ ABCDEFGH
    }
}
