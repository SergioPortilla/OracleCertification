package java8.questions.certified;

import java8.questions.certified.java808.ComparatorJava8;
import java8.questions.certified.java808.ExceptionsJava8;
import java8.questions.certified.java808.FileReaderJava8;
import java8.questions.certified.java808.HandingExceptions;
import java8.questions.certified.java813.StreamsJava8;

import java.io.IOException;

public class Main {
    public static void main(String[] args)throws IOException {
        //HandingExceptions handingExceptions = new HandingExceptions();
        //handingExceptions.este(args[0]);
        System.out.println(ComparatorJava8.nullLastPrint());
        System.out.println(FileReaderJava8.fileReaderOutput());
        System.out.println(ExceptionsJava8.arrayIndexOutOfBoundsExeption());
        System.out.println(StreamsJava8.concatOutput());
    }

}
