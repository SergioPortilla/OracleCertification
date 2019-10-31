package java11.questions.certified.java815;

//Any field in an interface is implicitly public, static, and final, whether these keywords are specified or not.
public interface ConstTest {
        public int A = 1; //1
        int B = 1;          //2
        static int C = 1;  //3
        final int D = 1; 	 //4
        public static int E = 1; //5
        public final int F = 1;  //6
        static final int G = 1;    //7
        public static final int H = 1; //8
}
class A{
        static int x[ ] = {1,2};
        int y[];
        void f(int z[]) {
                z[1] +=2;
        }
        void g(){
                A a = new A( );
                a.x[0]++;
        }
}

class B{
        public static void main(String args[]){
                A b = new A( );
                b.y = b.x;
                b.f (b.y);
                b.g ( );
                System.out.println(b.x[0] + " " + b.x[1]);
                System.out.println(b.y[0] + " " + b.y[1]);
                int[] x = new int[25];
                System.out.println(x.length);
                double d = 12.3;
                Decrementer dec = new Decrementer();
                dec.decrement(d);
                System.out.println(d);
        }
}
class Decrementer{
        public void decrement (double decMe){
                decMe = decMe - 1.0;
        }
}