import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
         var entrada = new Scanner(System.in);
        
        System.out.println("Dijite una letra:");
        var letra = entrada.next().charAt(0);

        if (Character.isLetter(letra)) {
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                System.out.println("La Letra es una vocal");
            } else{
                System.out.println("La letra es una consonante.");
            }    
        } else {
            System.out.println("El carácter ingresado no es una letra.");
        }
        entrada.close();
    }
}
