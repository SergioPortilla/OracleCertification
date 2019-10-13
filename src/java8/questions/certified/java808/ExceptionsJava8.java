package java8.questions.certified.java808;


public class ExceptionsJava8 {
    public static String arrayIndexOutOfBoundsExeption(){
        //El tamaño del Array es 0, entonces no puede mantener ningun elemento ❌
        //Integer array[] = new Integer[0];
        //return "Valor: "+ array[0];

        // El array debe ser de almenos un elemento que pueda contener un valor en la primera posicion ✔
        Integer array[] = new Integer[1];
        return "Valor: "+ array[0];
    }
}
