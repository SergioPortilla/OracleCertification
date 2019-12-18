package java11.questions.certified.java815;

/* 1. *****************************************************************************************************************/

/* 2. *****************************************************************************************************************/

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

class Excercise2A{
    int i = 10;
    public static void m1(){  }
    public void m2() { }
}
class Excercise2B extends Excercise2A{
    int i = 20;
    public static void m1() {  }
    public void m2() { }
}
//Here, UNLIKE m2, m1() of B does not override m1() of A, it just hides m1() of A, as proven by the following code:
class Excercise2C {
    public void m2() {
        Excercise2A a  = new Excercise2B();
        System.out.println(a.i);  //will print 10 instead of 20
        a.m1();  //will call A's m1
        a.m2();  //will call B's m2 as m2() is not static and so overrides A's m2()

    }
}

/* 3. *****************************************************************************************************************/

class Automobile{
    public void drive() {  System.out.println("Automobile: drive");   }
}

class Truck extends Automobile{
    public void drive() {  System.out.println("Truck: drive");   }
    public static void main (String args [ ]){
        Automobile  a = new Automobile();
        Truck t  = new Truck();
        a.drive(); //1
        t.drive(); //2
        a = t;   //3   ✔ Esta forma compila y ejecuta pero por definicion se debe castear para evitar errores de ejecucion.
        a =(Truck) t;//3 ✔ Esta es la forma correcta de realizarlo, pues si no se castea al momento de ejecutar podria obtenerse un ClassCastException.
        a.drive(); //4
    }
}

/* 4. *****************************************************************************************************************/

class XXX{
    public void m() throws Exception{
        throw new Exception();
    }
}
class YYY extends XXX{
    public void m(){ }
    public static void main(String[] args) {
        YYY obj = new YYY();
        obj.m();
    }
}

/* 5. *****************************************************************************************************************/

// Filename: TestClass.java
class Excercise5A{
    public static void main(String args[]){
        Excercise5C c = new Excercise5D();
        System.out.println(c.max(10, 20));
    }
}
class Excercise5B{
    int max(int x, int y)  { if (x>y) return x; else return y; }
}
class Excercise5C extends Excercise5B{
    int max(int x, int y)  {  return 2 * super.max(x, y) ; }
}
class Excercise5D extends Excercise5C{
    int max(int x, int y)  {  return super.max( 2*x, 2*y); }
}

/* 6. *****************************************************************************************************************/

class CorbaComponent{
    String ior;
    CorbaComponent(){
        startUp("IOR");
    }
    void startUp(String s){
        ior  =  s;
    }
    void print(){
        System.out.println(ior);
    }
}

class OrderManager extends CorbaComponent{
    OrderManager(){  }
    void startUp(String s){
        ior = getIORFromURL(s);
    }
    String getIORFromURL(String s){
        return "URL://"+s;
    }
}

class Application{
    public static void main(String args[]){
        start(new OrderManager());
    }
    static void start(CorbaComponent cc){
        cc.print();
    }
}

/* 7. *****************************************************************************************************************/

public class ImplementationsJava {
    public static void extendsUse() {
        Excercise7B o1 = new Excercise7D();
        Excercise7C o2 = (Excercise7C) o1;
        System.out.println(o1.m1());
        System.out.println(o2.i);
    }
}

class Excercise7B {
    int i = 10;

    int m1() {
        return i;
    }
}

class Excercise7C extends Excercise7B {
    int i = 20;

    int m1() {
        return i;
    }
}

class Excercise7D extends Excercise7C {
    int i = 30;

    int m1() {
        return i;
    }
}

class Bassdse {
//    public <T> Collection<? extends Number> transform(Collection<? extends Number> list) {return new ArrayList<>();}
    public <T> Collection<T> transform(Collection<T> list){ return new ArrayList<T>();}
}

class Desrived extends Bassdse {
//    public <T> Collection<T> transform(Collection<T> list) { return new HashSet<T>(); }; //1
//     public <T> Collection<T> transform(Stream<T> list) { return new HashSet<T>();}; //2
    // public <T> List<T> transform(Collection<T> list) { return new ArrayList<T>(); }; //3
     public <T> Collection<T> transform(Collection<T> list) { return new HashSet<T>();}; //4

//     public <T> HashSet<Long> transform(Collection<? extends Number> list) { return new HashSet<>();}; //5
//     public <T> Collection<Long> transform(Collection<? extends Number> list) { return new HashSet<>();}; //5
//     public <T> List<? extends Number> transform(Collection<? extends Number> list) { return new ArrayList<Long>();}; //5
}