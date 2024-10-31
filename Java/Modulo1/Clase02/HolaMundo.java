import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        // Imprimir Datos en Consola/Pantalla/Terminal
        System.out.println("Hola Juan Ortiz");// println con salto de linea
        System.out.print("Como estas"); // print  sin salto de linea
        System.out.println();
        System.out.printf("Aqui va una cadena: %s","Juan "); //  Busca remplazar la cadena %s 

        var entrada  = new Scanner(System.in); 

        System.out.println("Por favor ingrese su nombre");
        var String = entrada.nextLine();

        System.out.println("Por favor ingrese su edad:");
        var entero = entrada.nextInt();

        System.out.println("Su nombre es:"+String);
        System.out.println("Su edad es:"+entero);


        entrada.close();
    }
}
