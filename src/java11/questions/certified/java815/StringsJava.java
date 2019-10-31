package java11.questions.certified.java815;

public class StringsJava {
    public static void stripAndTrim(){
        class perro{
            String nombrePerro;

        }
        class gato{
            String nombreGatito;
        }

        gato g = new gato();
        perro p = new perro();
        g.nombreGatito = "    hello java guru   ";
        p.nombrePerro  = "    hello java guru   ";
        System.out.println(g.nombreGatito.trim().equals(p.nombrePerro.strip()));
        System.out.println(g.nombreGatito.trim() == g.nombreGatito.trim());
    }

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

    public static void crazyLoop(){
        int c = 0;
        JACK: while (c < 8){
            JILL: System.out.println(c);
            if (c > 3) break JACK;
            else c++;
        }

        JUAN: if(1==1){
            break JUAN;
        }

        INICIO:
        System.out.println("nada".substring(0));
    }
}
