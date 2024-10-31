import java.util.Scanner;

public class Ejercicio10MediaAritmetica {

    public static void main(String[] args) {
        var entrada = new Scanner (System.in);
        double num1, num2, num3;
        System.out.println("==PROGRAMA PARA CALCULAR LA MEDIA ARITMETICA DE TRES NUMEROS==");
        System.out.println("Ingrese el primer numero: ");
        num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = entrada.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        num3 = entrada.nextInt();

        
        var mediaAritmetica = (num1 + num2 + num3) / 3;

        System.out.println("El resultado de la  media aritmetica es: " +mediaAritmetica);

        entrada.close();
    }
}