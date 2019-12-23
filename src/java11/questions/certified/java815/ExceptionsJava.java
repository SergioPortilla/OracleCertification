package java11.questions.certified.java815;

public class ExceptionsJava {

    public static void main(String[] args)  {
        try{
            if(args.length == 0) m2(); else m3();
        }
        catch (NewException ne){

        }catch (AnotherException e){}
    }

    public static void m2() throws NewException { throw new NewException(); }

    public static void m3() throws AnotherException{ throw new AnotherException(); }

    public static void exceptionOrder() throws Exception {
        int[] a = null;
                            // Al llegar a la linea, primero ingresa al metodo y luego de retornar el valor toma en cuenta la validacion del campo
//        int j = a[n1()];  // En este caso retorna un 0 n1() y luego hace la validacion, obteniendo nullPointer Exception
        int i = a[m1()];    // En este caso el error sera el que se encuentra en m1, pues es el primero que encuentra
    }

    public static int m1() throws Exception{ throw new Exception("Some Exception"); }
    public static int n1() throws Exception{ return 0; }

}
class NewException extends Exception {}

class AnotherException extends Exception {}


class Test {
    static String j = "";

    public static void method(int i) {
        try {
            if (i == 2) {
                throw new Exception();
            }
            j += "1";
        } catch (Exception e) {
            j += "2";
            return;
        } finally {
            j += "3";
        }
        j += "4";
    }

    public static void main(String args[]) {
        method(1);
        method(2);
        System.out.println(j);
    }
}