package java11.questions.certified.java815;

import java.util.Arrays;

public class ArraysJava {
//    public static void compareAndMismatch() {
    public static void main (String[] args) {
        int[] a = { 'h', 'e', 'l'};
        int[] b = { 'h', 'e', 'l', 'l', 'o'};
        int s = a.length;
        int x = Arrays.compare(a, b);
        int y = Arrays.mismatch(a, b);
        System.out.println(x+" "+y);

    }

    public static void mkain() {
        int[][] array = {{0}, {0, 1}, {0, 1, 2}, {0, 1, 2, 3}, {0, 1, 2, 3, 4}};
        int[] arr1 = array[4];
//        System.out.println(arr1[4][1]);
        System.out.println(array[4][1]);
    }

    public static void maing() {
        As[] a, a1;
        Bs[] b;
        a = new As[10];
        a1 = a;
        b = new Bs[20];
        a = b;  // 1b = (Bs[]) a1; // 3
    }
}
class As { }
class Bs extends As { }