
package ejemplopoo;


public class Camion extends Vehiculo{
    
    int cant_ejes;
    boolean acoplado;
    
    //Constructor

    public Camion(int cant_ejes, boolean acoplado, int num_registro, int cant_ruedas, String marca, String modelo) {
        super(num_registro, cant_ruedas, marca, modelo);
        this.cant_ejes = cant_ejes;
        this.acoplado = acoplado;
    }

    public Camion() {
    }

    public int getCant_ejes() {
        return cant_ejes;
    }

    public boolean isAcoplado() {
        return acoplado;
    }

    public int getNum_registro() {
        return num_registro;
    }

    public int getCant_ruedas() {
        return cant_ruedas;
    }



    public void setCant_ejes(int cant_ejes) {
        this.cant_ejes = cant_ejes;
    }

    public void setAcoplado(boolean acoplado) {
        this.acoplado = acoplado;
    }

    
    
    
}
