import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.println("Dijite un numero:");
        var num = entrada.nextInt();
        
        if(num == 0 ){
            System.out.println("El numero ingresado es cero");
        }else if(num > 0 ){
            System.out.println("El numero es positivo");
        }else if(num < 0 ){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("Numero no valido");
        }
        entrada.close();
    }
}
