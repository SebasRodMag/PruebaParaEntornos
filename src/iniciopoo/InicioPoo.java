package iniciopoo;
public class InicioPoo {

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
