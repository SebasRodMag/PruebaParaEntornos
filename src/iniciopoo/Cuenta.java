package iniciopoo;

/*1) Crea una clase llamada Cuenta que tendra los siguientes atributos: titular y cantidad(puede tener decimales)*/

/**
 * Clase Cuenta que simula la cuenta bancaria
 * @author sebas
 * @version 1.0
 */

public class Cuenta {

    private String titular;
    private double cantidad;
    private String serial;

    //El titular sera obligatorio u la cantidad opcional
    //Crea dos contstructores que cumplan lo anterior

    /**
     * Metodo para crear Cuenta
     * @param titular Nombre y apellido del titular
     * @param serial Serial, para en un futuro asignar un numero de serie
     */
    public Cuenta(String titular, String serial) {
        this.titular = titular;
        this.serial=serial;
    }

    /**
     * Metodo sobrecargado para crear cuenta 
     * @param titular Titular de la cuenta
     * @param cantidad Cantidad de dinero en la cuenata
     */
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    /**
     * Metodo para sobreescribir el metodo String
     * @return Devuelve la consulta con un formato especfico
     */
    @Override
    public String toString() {
        return "Titular: " + getTitular() + " | Cantidad: " + getCantidad();
    }

    /**
     * Metodo para ingresar cantidad
     * @param cantidad cantidad de dinero ingresado
     */
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.setCantidad(this.getCantidad() + cantidad);
        }
    }

    /**
     * Metodo para retirar dinero
     * @param cantidad cantidad de dinero a retirar
     */
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (this.getCantidad() - cantidad >= 0) {
                this.setCantidad(this.getCantidad() - cantidad);
            }

        }
    }

    /**
     * Metodo devuelve al titular
     * @return devuelve el titular de la cuenta
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Metodo que estalece al titular de la cuenta
     * @param titular Establece al titular de la cuenta.
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * Metodo que devuelve la cantidad de dinero en la cuenta.
     * @return Devuelve la cantidad de dinero en la cuenta
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * Metodo para establecer la cantidad de dinero en la cuenta.
     * @param cantidad Establece la canditdad de dinero
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
