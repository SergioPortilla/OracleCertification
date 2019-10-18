package java8.questions.certified.java813;

import java.util.stream.Stream;

public class StreamsJava8 {

    public static String concatOutput(){
        /*Aparece el error non static method cannot be referenced from a static context pero esto se debe a que la funcion
        lambda no tiene definido el tipo de dato que le llega, se debe definir ya sea en la funcion o en la inicializacion
        del Stream*/
        //Stream strs = Stream.of("A","I","U"); ❌
        //return String.format("El valor es: %s", strs.reduce(String::concat));

        Stream<String> strs = Stream.of("A","I","U"); //✔
        return String.format("Valor: %s", strs.reduce((String a, String b) -> a.concat(b))); //✔
//        return String.format("El valor es: %s", strs.reduce(String::concat)); //✔
    }
}
