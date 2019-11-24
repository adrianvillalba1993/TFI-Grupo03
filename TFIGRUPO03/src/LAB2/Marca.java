package LAB2;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by adrian on 22/11/2019.
 */
public class Marca {
    private Set<Vehiculo> vehiculos;
    private String nombre;
    //constructor
    public Marca(String nombre){
        this.nombre = nombre;
        vehiculos = new  HashSet<Vehiculo>();
    }

    //agrego modelo vehiculo a la marca (lista de vehiculos
    private void agregar(Vehiculo vehiculo){
      vehiculos.add(vehiculo);
    }

    //equals comparando strings (devuelve boolean para crear una nueva marca si devuelve false)
    public boolean comparar(Vehiculo modelo){
        if(nombre.equalsIgnoreCase(modelo.getMarca())){
            agregar(modelo);
            return true;
        }else{
            JOptionPane.showInputDialog("No existe la marca o fabricante");
            return false;
        }
    }

    //Mostrar lista de vehiculos
    public void mostrar(){
        for(Vehiculo vehiculo : this.vehiculos){
            System.out.println(vehiculo.toString());
        }
    }
}
