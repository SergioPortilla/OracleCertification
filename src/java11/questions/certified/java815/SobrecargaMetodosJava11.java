package java11.questions.certified.java815;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SobrecargaMetodosJava11 {

    static void doCalc(byte... a) {
        System.out.print("byte...");
    }
    static void doCalc(long a, long b) {
        System.out.print("long, long");
    }
    static void doCalc(byte s1, byte s2) {
        System.out.print("Byte, Byte");
    }
    public static void sobrecargaMetodos() {
        byte b = 5;
        doCalc(b, b);
    }
}


class Base{
    public  <T extends Number, Z extends Number> Map<T, Z> getMap(T t, Z z)
    {
        return new HashMap<>();
    }
}

class Derived extends Base{
    public  <T, Z> TreeMap<T, Z> getMap(T t, Z z) { return new TreeMap<T, Z>(); }; //1

//    public  Map<Number, Number> getMap(Number t, Number z) { return new TreeMap<Number, Number>(); }; //2

//    public  Map<Integer, Integer> getMap(Number t, Number z) { return new HashMap<Integer, Integer>(); };   //3
}

class ScopeTest{
    static int x = 5;
    public static void main(String[] args){
        int x= ( x=3 ) * 4;// 1       
        System.out.println(x);
    }
}
