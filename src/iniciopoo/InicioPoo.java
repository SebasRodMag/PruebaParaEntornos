package iniciopoo;

/**
 * Iniciamos simulación de cuentabancaria.
 * @author sebas
 * @version 1.0
 * @since 24/05/2024
 */
public class InicioPoo {

    /**
     * Introducimos datos para simular cuenta bancaria.
     * @param args
     */
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta("Paco Gerte", 2000.00);
        System.out.println(primeraCuenta);
        primeraCuenta.ingresar(100);
        System.out.println(primeraCuenta);
        primeraCuenta.ingresar(100);
        System.out.println(primeraCuenta);
        primeraCuenta.ingresar(1100);
        
        System.out.println(primeraCuenta);
        primeraCuenta.retirar(500);
        System.out.println(primeraCuenta);
    }
    
}
