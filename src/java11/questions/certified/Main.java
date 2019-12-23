package java11.questions.certified;

import java11.questions.certified.java815.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Streams
//        StreamExcercise();

        //Lambda
//        lambdasExercise();

        //String
//        StringsExcercise();

        //Implementations
//        ImplementationsJava.extendsUse();

        //Exceptions
        ExceptionsExcercise();

        //other
//        StringsJava.StringFromChar();

//        Repeat repeat = new Repeat();
//        System.out.println(repeat.repeatVar());
//        ListJava11.trySplitCadena();
//        SobrecargaMetodosJava11.sobrecargaMetodos();

//        public static void main(String[] args){
//            short s = 9;
//            Short k = 9; System.out.println( k instanceof s);
//            int i = 9; System.out.println(s == i);
//            System.out.println(s instanceof Short);
//            Short k = 9; Integer i = 9; System.out.println(k == i);
//            Integer i = 9; System.out.println( s == i );
//        }

    }

    protected static void lambdasExercise() {
        LambdasJava.interfaceImplements();
        LambdasJava.functionInterface();
        LambdasJava.supplierInterface();
        LambdasJava.supplierInterface();
    }

    protected static void StreamExcercise() {
        StreamsJava.streamsMaps();
        StreamsJava.streamsForEach();
    }

    protected static void StringsExcercise() {
//        StringsJava.stripAndTrim();
//        StringsJava.StringFromChar();
//        StringsJava.crazyLoop();
    }

    protected static void ExceptionsExcercise() {
        try {
            ExceptionsJava.exceptionOrder();
        } catch (Exception e){
            System.out.println(e);
        }
    }

    protected static void VarExcercise() {
        varLocalVariable.varAsignacionValores();
        varLocalVariable.varRepeatMethod();
    }
}
