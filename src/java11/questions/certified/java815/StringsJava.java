package java11.questions.certified.java815;

import java.util.Stack;

//public class StringsJava {
//    public static void stripAndTrim(){
//        class perro{
//            String nombrePerro;
//
//        }
//        class gato{
//            String nombreGatito;
//        }
//
//        gato g = new gato();
//        perro p = new perro();
//        g.nombreGatito = "    hello java guru   ";
//        p.nombrePerro  = "    hello java guru   ";
//        System.out.println(g.nombreGatito.trim().equals(p.nombrePerro.strip()));
//        System.out.println(g.nombreGatito.trim() == g.nombreGatito.trim());
//    }
//
//    public static void StringFromChar() {
//        String myStr = "good";
//        char[] myCharArr = {'g', 'o', 'o', 'd' };
//
//        String newStr = "";
//        for(char ch : myCharArr){
//            newStr = newStr + ch;
//        }
//        boolean b1 = newStr == myStr;
//        boolean b2 = newStr.equals(myStr);
//
//        System.out.println(b1+ " " + b2);
//
//        StringBuilder sb = new StringBuilder("asdf");
//        String str1 = sb.toString();
//        String str2 = str1;
//        System.out.println(str1 == str2);
//
//    }
//
//    public static void crazyLoop(){
//        int c = 0;
//        JACK: while (c < 8){
//            JILL: System.out.println(c);
//            if (c > 3) break JACK;
//            else c++;
//        }
//
//        JUAN: if(1==1){
//            break JUAN;
//        }
//
//        INICIO:
//        System.out.println("nada".substring(0));
//    }
//}

public class StringsJava {
//    public static void main(String[] args) {
////        String[] este = {"s",null};
////        System.out.println(este[1]);
//        new StringsJava();
//    }
//    public StringsJava() {
//        System.out.println(this);
//        Stack s;
//    }
    public static void main(String[] args) {
        int i = 5;
        switch (i){
            default:
                case 1:
                    System.out.println(1);
                case 0:
                    System.out.println(0);
                case 2:
                    System.out.println(2);
                    break;
                case 3:
                    System.out.println(3);
        }
    }

}


class Game{
    public void play() throws Exception{
        System.out.println("Playing...");
    }
}

//public class Soccer extends Game{
//    public void play(){
//        System.out.println("Playing Soccer...");
//    }
//    public static void main(String[] args){
//        Game g = new Soccer();
//        g.play();
//    }
//}


