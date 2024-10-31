public class Ejercicio1Calculadora {
    public static void main(String[] args) {
        var num1 = 6;
        var num2 = 2;
        var num3 = 1;

        var num4 = num1 / num2 * (num3 + num2);
        System.out.println(num4);

        
        /*
        El resultado correcto es 9, siguiendo el orden jerarquico y de lectura de izquierda a derecha  

        La logica toma primero los parentesis por el orden jerarquico dando un resultado de 3, luego 
          efectua la division entre 6 y 2 la cual da 3 y por ultimo por el orden de izq a der multiplica
          3 por 3 dando el resultado de 9 

          Comparando el resultado de la otra calculadora el cual su  resultado es uno, se debe al orden  que ejecuta
          desde der a izq pq cuando inicia la suma en el parentesis obtiene 3, recorre desde la derecha realizando primero 
          la multiplicacion entre 3 y 2 la cual da 6 y por ultimo hace la division ente 6 y 6 la cual es 1
          Por esto se debe los resultados diferentes por la diferencia  de lectura desde izq a der como de der a izq
        */

    }
}
