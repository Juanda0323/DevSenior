import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
         var entrada = new Scanner(System.in);
        
        System.out.println("Dijite un numero entero:");
        var num = entrada.nextInt();
       

        if (num % 2 == 0) {
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
        entrada.close();
    }
}
