

package ejemplopoo;


public class EjemploPOO {

    public static void main(String[] args) {
    
        Vehiculo vehi = new Vehiculo (56879, 4,"Renault","Indefinido");
        Auto auto2 = new Auto (1,"AA111JO", 5 ,"rojo", true, 65324, 4,"Volkswagen","Gold Trend");
        Moto moto = new Moto (125, 15698, 2,"Yamaha","ZR125");
        Camion cami1 = new Camion (6, true, 698745, 6,"Mercedes","Un modelo");
        
        Vehiculo vector[] = new Vehiculo [4];
        vector[0] = vehi;
        vector[1] = auto2;
        vector[2] = moto;
        vector[3] = cami1;

        for (int i=0; i<4; i++){
            System.out.println("Registro N°" + i + vector[i].getMarca());
        }        
        
        
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        /*auto2.encender();
        auto2.acelerar(60);
        auto2.frenar(30);
        auto2.apagar();*/
                
        /*System.out.println("El valor de la id es:" + auto2.getId());
        auto2.setId(35000);
        System.out.println("El nuevo valor de la id es:" + auto2.getId());*/
        
        /*System.out.println("La id de auto1 es: " + auto1.getId());
        System.out.println("El color del auto1 es: " + auto1.getColor());
        
        auto1.setId(1500);
        auto1.setPatente("AB569PO");
        auto1.setColor("amarillo");
        auto1.setCaja_manual(false);
        
        System.out.println("-------");
        
        System.out.println("La nueva id de auto1 es: " + auto1.getId());
        System.out.println("El nuevo color del auto1 es: " + auto1.getColor());
        
        
        
        
                
                
    }
}
