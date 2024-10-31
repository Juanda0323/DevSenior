
import java.util.Scanner;

public class VariablesTipoDatos{
   public static void main(String[] args) {
    var scanner = new Scanner(System.in);

    System.out.println("Ingrese un Valor");
    var text = scanner.nextLine();

    System.out.printf("El valor ingresado fue: %s%n", text);

    scanner.close();
/* 
    // Boolean
    boolean active;
    // Integer  Numbers
    byte numberByte;
    short numberShort;
    int numberint;
    long numberLong;
    // Float Numbers 
    float numberFloat;
    double numberDouble;
    BigDecimal  numeberPresicionFinanciera;
    // Character
    char characterValue ;
    // String
    String stringValue;
*/
   }
}   