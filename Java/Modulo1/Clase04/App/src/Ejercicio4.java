import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
         var entrada = new Scanner(System.in);
        
        System.out.println("Dijite una letra:");
        var letra = entrada.next().charAt(0);

        if (Character.isUpperCase(letra)) {
            System.out.println("La letra es mayúscula.");
        } else if (Character.isLowerCase(letra)) {
            System.out.println("La letra es minúscula.");
        } else {
            System.out.println("El carácter ingresado no es una letra.");
        }
        entrada.close();
    }
}
