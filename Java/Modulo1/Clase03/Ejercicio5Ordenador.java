public class Ejercicio5Ordenador {
    public static void main(String[] args) {
        var costoComputador = 660;
        var descuento = 0.10;

        var totalDecuento = costoComputador * descuento;
        var valorPagar =   costoComputador - totalDecuento ;

        System.out.println( "El precio final con descuento que debera pagar es de: "+valorPagar +"€");

    }
}
