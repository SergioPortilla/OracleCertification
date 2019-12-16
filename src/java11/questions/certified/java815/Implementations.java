package java11.questions.certified.java815;

public class Implementations {

}
class Imp1{
    public static void sM1() {
//  protected static void sM1() {                                       Acepta tanto protected como public en el extends
        System.out.println("In base static");
    }
}

class Imp2 extends Imp1{
    public static void sM1() {  System.out.println("In sub static"); }
    //public void sM1() {  System.out.println("In sub non-static"); }   Para extender debe ser igualmente estatico
}

class Examp1{
    int i = 10;
    public static void m1(){  }
    public void m2() { }
}
class Examp2 extends Examp1{
    int i = 20;
    public static void m1() {  }
    public void m2() { }
}
//Here, UNLIKE m2, m1() of B does not override m1() of A, it just hides m1() of A, as proven by the following code:
class AnotherClass {
    public void m2() {
        Examp1 a  = new Examp2();
        System.out.println(a.i);  //will print 10 instead of 20
        a.m1();  //will call A's m1
        a.m2();  //will call B's m2 as m2() is not static and so overrides A's m2()

    }
}

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
// Filename: TestClass.java
class TestClass{
    public static void main(String args[]){
        DD c = new EE();
        System.out.println(c.max(10, 20));
    }
}
class SS{
    int max(int x, int y)  { if (x>y) return x; else return y; }
}
class DD extends SS{
    int max(int x, int y)  {  return 2 * super.max(x, y) ; }
}
class EE extends DD{
    int max(int x, int y)  {  return super.max( 2*x, 2*y); }
}