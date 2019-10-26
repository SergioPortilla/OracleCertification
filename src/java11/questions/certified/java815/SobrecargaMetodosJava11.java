package java11.questions.certified.java815;

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
