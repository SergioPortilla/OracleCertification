package java11.questions.certified.java815;

import java11.questions.certified.java815.lambdasMaterial.Empleado;
import java11.questions.certified.java815.lambdasMaterial.FuncionalInterface;
import java11.questions.certified.java815.lambdasMaterial.Persona;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdasJava {
    public static void trySplitCadena(){
        List<String> strList = List.of("A", "B", "C", "D", "E", "F", "G", "H");
        Spliterator<String> part1 = strList.spliterator().trySplit();

        //part1.forEachRemaining(System.out::print /*s -> System.out.print(s)*/);           //✔ ABCD
        part1.trySplit().forEachRemaining(System.out::print /*s -> System.out.println(s)*/);//❌ ABC
        //part1.trySplit((s -> System.out.print(s)); No resuelve metodos Lambda             //❌
        part1.tryAdvance(System.out::println /*(s -> System.out.print(s)*/);                //❌ A
        //part1.forEach(s -> System.out.print(s)); Spliterator no tiene el metodo forEach     ❌
        strList.forEach(System.out::print /*s -> System.out.println(s)*/);                  //❌ ABCDEFGH
    }

    public static void interfaceImplements(){
        //Forma 1
        FuncionalInterface fn = LambdasJava::sumar;
        fn.sumar(3, 2);

        //Forma 2
        FuncionalInterface fn2 = (a,b) -> {
            System.out.println(a+b);
        };
        fn2.sumar(2,2);
    }

    private static void sumar(int a, int b) {
        System.out.println(a + b);
    }

    //Las funciones reciben un argumento (T) y devuelven un resultado (R), usan la interface Function<T,R>.
    public static void functionInterface(){
        //APPLY
        Function<Integer, Integer> suma = x -> x + 8;
        System.out.println("La suma de 5 + 8: " + suma.apply(5));

        Function<Boolean, String> comida = s -> s ? "Desayuno" : "Almuerzo";
        System.out.println("Si es temprano entonces "+comida.apply(true)+ " pero si ya es tarde "+comida.apply(false));

        //ANDTHEN
        Function<Integer, Integer> multiply = s -> s * 2;
        Function<Integer, Integer> add      = s -> s + 3;

        Function<Integer, Integer> multiplyThenAdd = multiply.andThen(add);
        System.out.println(multiplyThenAdd.apply(3));

        //COMPOSE
        Function<Integer, Integer> addThenMultiply = multiply.compose(add);
        System.out.println(addThenMultiply.apply(3));
    }

    // Los proveedores Lambda no tiene parámetros de entrada, pero si devuelven un resultado, utilizan la interface Supplier<T>.
    public static void supplierInterface(){
        Supplier<String> cadena = () -> "Ejemplo de Proveedor";
        System.out.println(cadena.get());

        class Employee{
            int age;
        }
        Employee e = new Employee();
        Supplier<Employee> se = ()->{ e.age = 40; return e; };
        System.out.println(se.get().age);
    }

    public static void consumerInterface(){
        Consumer<Persona> persona = (p) -> System.out.println("Hola, " + p.getNombre());
        persona.accept(new Persona("Jorge", "Valladares","Quito"));

    }

//    public static void instanceOfExample(){
//        System.out.println(Empleado instanceof Persona);
//
//
//    }



    public static void forEachLambda(){
        List<String> strList = Arrays.asList("a", "aa", "aaa");
        Function<String, Integer> f = x->x.length();
        Consumer<Integer> c = x->System.out.print("Len:"+x+" ");
        Predicate<String> p = x->"".equals(x);
//        strList.forEach();
    }
}
