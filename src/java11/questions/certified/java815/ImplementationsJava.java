package java11.questions.certified.java815;

/* 1. *****************************************************************************************************************/

/* 2. *****************************************************************************************************************/

import java.util.*;

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

class Eagle {
    public String name;
    public Eagle(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println(new Eagle("Bald Eagle").name);
    }
}

class TestoClass {

    static public final void main(String args[]) {
        long a = 'a';
        int b = 0;
        System.out.println(a+b);
        double numero = 3;		// Compila correctamente.
        int otroNumero = 4;
        numero = otroNumero;
        System.out.println(numero);
    }
}

class Aa {
    int i = 10;

    int m1() {
        return i;
    }
}

class Ba extends Aa {
    int i = 20;

    int m1() {
        return i;
    }
}

class Ca extends Ba {
    int i = 30;

    int m1() {
        return i;
    }
}

class Asss{
    public List<Number> getList(){
        return null;
    };
}
class Bsss extends Asss{
    public ArrayList<Number> getList(){
        return null;
    };
}

/**
 * The type Test class.
 */
class TestClass{
//    public static void main(String args[]){
//        Stack s1 = new Stack ();
//        Stack s2 = new Stack ();
//        processStacks (s1, s2);
//        System.out.println (s1 + "    "+ s2);
//    }
//    public static void processStacks(Stack x1, Stack x2){
//        x1.push (new Integer ("100")); //assume that the method push adds the passed object to the stack.
//        x2 = x1;
//    }

//    public static void main(String[] args) throws Exception {
//        String[] sa = {"a", "b", "c"};
//        for (String s : sa) {
//            if ("b".equals(s)) continue;
//            System.out.println(s);
//            if ("b".equals(s)) break;
//            System.out.println(s + " again");
//        }
//    }

//    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 5};
//        int[] b = {1, 2, 3, 4, 5, 3};
//        int[] c = {1, 2, 3, 4, 5, 4};
//        int x = Arrays.compare(a, c);
//        int y = Arrays.compare(b, c);
//        System.out.println(x + " " + y);
//    }
class MyException extends Exception {}
public static void main(String[] args){
    TestClass tc = new TestClass();
    try{
        tc.m1();
    }
    catch (MyException e){
//        tc.m1();
    }
    finally{
        tc.m2();
    }
}
    public void m1() throws MyException{
        throw new MyException();
    }
    public void m2() throws RuntimeException{
        throw new NullPointerException();
    }

    class TestClasss implements T1, T2 {
        public void m1() {
        }
        int VALUE;
    }

    interface T1 {
        int VALUE = 1;

        void m1();
    }

    interface T2 {
        int VALUE = 2;

        void m1();
    }
}

class Basse {
    public <T> List<T> transform(List<T> list) {
        return new ArrayList<T>();
    }
}

class Deriveds extends Basse {
    public <T extends CharSequence> Collection<String> transform(Collection<T> list)    {
        return new ArrayList<String>();
    }

    class Derived extends Base {
        public <T extends String> Collection<T> transform(Collection<T> list) {
            return new HashSet<T>();
        }
    }; //2        //public <T extends CharSequence> List<T> transform(Collection<T> list) { return new ArrayList<T>(); }; //3        //public <T extends CharSequence> Collection<T> transform(List<T> list) { return new HashSet<T>(); }; //4         //public <T super String> Collection<T> transform(List<String> list) { return new HashSet<T>(); };//5        //public  Collection<CharSequence> transform(Collection<CharSequence> list) { return new HashSet<CharSequence>();}; //6 }
}