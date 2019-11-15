package java11.questions.certified.java815;

public class InitTest{
    static int si = 10;
    int  i;
    final boolean bool;
    {
        bool = (si > 5);
        i = 1000;
    }
}