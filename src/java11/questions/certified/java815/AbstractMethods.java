package java11.questions.certified.java815;

public class AbstractMethods {

    abstract class Bang{
        // abstract void f();  // LINE 0
        final    void g(){}
        // final    void h(){} // LINE 1
//        protected static int i; NO PUEDEN LLAMARSE METODOS ESTATICOS DENTRO DE UNA SUBCLASE
        protected int i;
        private int j;
    }

    final class BigBang extends Bang{
        // BigBang(int n) { m = n; } // LINE 2
        public void main(String args[]){
            Bang mc = new BigBang();
        }
        // @Override // LINE 3
        void h(){}
        // void k(){ i++; } // LINE 4
        // void l(){ j++; } // LINE 5
        int m;
    }


}

abstract class Bang{
    // abstract void f();  // LINE 0
    final    void g(){}
    // final    void h(){} // LINE 1
    protected static int i;
    private int j;
}

final class BigBang extends Bang{
//     BigBang(int n) { m = n; } // LINE 2
    public void main(String args[]){
        Bang mc = new BigBang();
    }
//     @Override // LINE 3
    void h(){}
    void k(){ i++; } // LINE 4
//     void l(){ j++; } // LINE 5
    int m;
}