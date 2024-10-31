public class App {
    public static void main(String[] args) throws Exception {

        var edad = 50;

        if (edad < 0) {
            System.out.println("Edad no validad");
        } else if (edad < 18) {
            System.out.println("Menor de edad");
        } else if (edad < 29) {
            System.out.println("Es un adulto joven");
        } else if (edad < 45) {
            System.out.println("Eres un adulto");
        } else if (edad < 60) {
            System.out.println("Ya estas grandecito");
        } else {
            System.out.println("Es un adulto mayor");
        }
        System.out.println("Termino del Programa");

    }
}
