package java11.questions.certified.java815;

import java.util.*;

import static java.lang.System.out;

//class Student{ } puede ser utilizado con cualquier ambito ✔
public class varLocalVariable {

    // public var estudiante;  ❌
    // var students = new ArrayList<Student>(); //1     VAR solo funciona como una variable local del metodo          ❌

    // class Student{ }  //un atributo clase de una clase no puede ser referenciada en un contexto statico ❌
    public static void varAsignacionValores()  {
        class Student{ }
        var student  = new Student(); //2               VAR permite cualquier tipo de dato, son usadas para Lambdas   ✔

        var allStudents = new ArrayList<>();  //3
    //  var allStudents = new ArrayList<Student>();  Para que el punto 6 sea correcto

        allStudents.add(student); //4

        for(var s : allStudents){ //5
            out.println(s);
        }
        //Student s2 = allStudents.get(0); //6
    }



    public static void varRepeatMethod() {
        var hi = "hola mundo ";
        out.println(hi.repeat(3));
    }

}