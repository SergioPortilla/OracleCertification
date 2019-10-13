package java8.questions.certified.java808;

import org.jetbrains.annotations.NotNull;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderJava8 {

    public static String fileReaderOutput() throws IOException{
        FileReader fr = new FileReader("java8\\questions\\certified\\new.txt");
        try{
            return "valor: "+ fr;
        } finally {
            fr.close();
        }
    }




}