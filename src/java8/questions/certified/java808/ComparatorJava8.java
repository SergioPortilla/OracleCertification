package java8.questions.certified.java808;

import java.util.Comparator;

public class ComparatorJava8 {
    public static String nullLastPrint(){
        Comparator comp = Comparator.nullsLast(Integer :: compare);
        return "valor: "+comp.compare(null, 10); // 1
//        return "valor: "+comp.compare(null, null); //0
//        return "valor: "+comp.compare(null, null); //1
    }
}
