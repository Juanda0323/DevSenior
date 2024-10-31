import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        
        System.out.println("Dijite el primer numero:");
        var num1 = entrada.nextInt();
        System.out.println("Dijite el segundo numero:");
        var num2 = entrada.nextInt();
        System.out.println("Dijite el tercer numero:");
        var num3 = entrada.nextInt();

        if(num1 > num2 && num1 > num3 ){
            System.out.println("El numero mayor es:"+num1);
        }else if(num2 > num1 && num3 < num2){
            System.out.println("El numero mayor es:"+num2);
        }else if(num3 > num2 && num1 <num3){
            System.out.println("El numero mayor es:"+num3);
        }



        entrada.close();
    }
}
