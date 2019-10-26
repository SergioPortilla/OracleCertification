package java11.questions.certified.java815;

public class StringFromChar {

        public static void StringFromChar() {
            String myStr = "good";
            char[] myCharArr = {'g', 'o', 'o', 'd' };

            String newStr = "";
            for(char ch : myCharArr){
                newStr = newStr + ch;
            }
            boolean b1 = newStr == myStr;
            boolean b2 = newStr.equals(myStr);

            System.out.println(b1+ " " + b2);

        }
//        public static void main(String[] args){
//            short s = 9;
//            Short k = 9; System.out.println( k instanceof s);
//            int i = 9; System.out.println(s == i);
//            System.out.println(s instanceof Short);
//            Short k = 9; Integer i = 9; System.out.println(k == i);
//            Integer i = 9; System.out.println( s == i );
//        }

}
class A{
    public A() { }
    public A(int i) {   System.out.println(i );    }
}
class B{
    static A s1 = new A(1);
    A a = new A(2);
    public static void main(String[] args){
        B b = new B();
        A a = new A(3);
    }
    static A s2 = new A(4);
}