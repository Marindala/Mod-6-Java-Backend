package ejemplopoo;


public class Moto extends Vehiculo{
    
    int cilindrada;
    
    //Constructores

    public Moto() {
    }

    public Moto(int cilindrada, int num_registro, int cant_ruedas, String marca, String modelo) {
        super(num_registro, cant_ruedas, marca, modelo);
        this.cilindrada = cilindrada;
        
        
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    
    
    
    
}
