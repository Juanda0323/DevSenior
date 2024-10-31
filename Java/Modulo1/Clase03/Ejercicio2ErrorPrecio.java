
public class Ejercicio2ErrorPrecio {
    public static void main(String[] args) {
        /*En el mercado, podemos encontrar que el precio del producto Pernil Iberic D'Engreix LlenAzuaga
         en porción de 100 gramos cuesta 5,95€ y el vendedor nos dice que el precio por kilo cuesta 29,75€.
        ¿Crees que es correcto el precio?
        En este reto tienes que hacer un programa que calcule correctamente el precio por kilo del producto. */

        double pernilIbericPor100Gramos = 5.95;
        double precioTotalPorKilo = pernilIbericPor100Gramos *10;
        

        System.out.println("El precio por kilo es: " + precioTotalPorKilo + " €.");

        /*
         De acuerdo al resultado, el precio del vendedor esta mal, debido a que realizando la operacion nos da  59.5
         con esto verificamos que el vendedor plantea el precio de 29.75  como si fuera medio  kilo o lo equivalente a 
         500 gramos, ya que si multiplicamos  el precio por  los 5, que seria la igualdad a 500 gramos nos daria 29.75,
         sin embargo como es por un kilo lo debemos multiplicar por 10 lo equivalente a 1000 gramos, obteniendo el 
         resultado mencionado anteriormente.
         */
    }
}