
package ejemplopoo;


public class Vehiculo {
    
    //Declaración de Atributos
    int num_registro;
    int cant_ruedas;
    String marca;
    String modelo;
    
    //Constructor

    public Vehiculo() {
    }

    public Vehiculo(int num_registro, int cant_ruedas, String marca, String modelo) {
        this.num_registro = num_registro;
        this.cant_ruedas = cant_ruedas;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getNum_registro() {
        return num_registro;
    }

    public int getCant_ruedas() {
        return cant_ruedas;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setNum_registro(int num_registro) {
        this.num_registro = num_registro;
    }

    public void setCant_ruedas(int cant_ruedas) {
        this.cant_ruedas = cant_ruedas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
        
    
    //Declaración Métodos
    public void estacionar (){
        System.out.println("Estoy estacionando");
    }
    
    
}
