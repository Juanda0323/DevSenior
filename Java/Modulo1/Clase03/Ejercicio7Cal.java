import java.util.Scanner;

public class Ejercicio7Cal {
    public static void main(String[] args) {
       var entrada = new Scanner(System.in);

       System.out.println("Dijite el primer numero:");
       var num1 = entrada.nextInt();
       System.out.println("Dijite el segundo numero:");
       var num2 = entrada.nextInt();
       System.out.println();

       var suma = num1+num2;
       var resta = num1 - num2;
       var multiplicación = num1 * num2;
       var division = num1 / num2;

       System.out.println( "La suma de los numeros es:" +suma);

       System.out.println( "La resta de los numeros es:"+resta);

       
       System.out.println( "La multiplicacionn de los numeros es:" +multiplicación);

       
       System.out.println( "La division de los numeros es:"+division);
       entrada.close();
    }
}
