
package iniciopoo;

/*1) Crea una clase llamada Cuenta que tendra los siguientes atributos: titular y cantidad(puede tener decimales)*/
public class Cuenta {
    private String titular;
    private double cantidad;
    
    //El titular sera obligatorio u la cantidad opcional
    //Crea dos contstructores que cumplan lo anterior
    
    public Cuenta(String titular){
        this.titular = titular;
    }
    
    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString(){
        return "Titular: "+ getTitular() +" | Cantidad: "+getCantidad();
    }
    
    public void ingresar(double cantidad){
        if (cantidad > 0){
            this.setCantidad(this.getCantidad() + cantidad); 
        }
    }
    
    public void retirar(double cantidad){
        if (cantidad > 0){
            if(this.getCantidad()-cantidad>=0){
                this.setCantidad(this.getCantidad() - cantidad);
            }
            
        }
    }

    /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * @return the cantidad
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
