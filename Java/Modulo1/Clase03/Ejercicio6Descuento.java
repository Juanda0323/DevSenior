public class Ejercicio6Descuento {
    public static void main(String[] args) {
        var valorPagado = 34;
        var descuento = 0.15;

        var totalDescuento = valorPagado * descuento;
        var precioSinDescuento = totalDescuento + valorPagado ;

        System.out.println( "El precio que tenia antes del descuento era  de: "+precioSinDescuento +"€");
    }
}
