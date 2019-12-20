package java11.questions.certified.java815;

public class BasicOperands {
    public static void breaksValidations(){
//      if(true){
//          break;
//      }                   ❌ Para los IF solamente se pueden romper poniendo etiquetas

        label: if(true){
            break label;
        } //                ✔ A partir de etiquetas es posible romper el if
    }
}
class MyClasffs{
    public static void main(String args[]){
        char c;
        int i;
        c = 'a';//1
        i = c;  //2
        i++;    //3
        //c = i;  //4
        c++;    //5
    }
}
// SWITCH
//Only String, byte, char, short, int, (and their wrapper classes Byte, Character, Short, and Integer), and enums can be used as types of a switch variable. (String is allowed only since Java 7).

class something {
    public static void main(String[] args) {
        int i = 1;
        int j = i++;
        System.out.println("\t\t1-1\t\t1-0\t\t0-1\t\t0-0"); //AND
        System.out.println("AND\t\t"+ (1 & 1)+ "\t\t"+(1 & 0)+ "\t\t"+(0 & 1)+ "\t\t"+(0 & 0));
        System.out.println("OR\t\t" + (1 | 1)+ "\t\t"+(1 | 0)+ "\t\t"+(0 | 1)+ "\t\t"+(0 | 0));
        System.out.println("XOR\t\t"+ (1 ^ 1)+ "\t\t"+(1 ^ 0)+ "\t\t"+(0 ^ 1)+ "\t\t"+(0 ^ 0));
        System.out.println("NOT\t\t"+ (~1111));
        System.out.println("Despl\t\t"+ (1011>>1111));
        System.out.println("Despl\t\t"+ (1011>>>1111));
        System.out.println("Despl\t\t"+ (1011<<1111));


        if( (i==++j) | (i++ == j) ){
//      if( (2==++j) | (i++ == j) ){

            i+=j;
        }
        System.out.println(i);
        int a = 1;
        int b = 1;
    }
}