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
