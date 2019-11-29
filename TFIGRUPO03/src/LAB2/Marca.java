package LAB2;

import javax.swing.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by adrian on 22/11/2019.
 */
public class Marca extends Operaciones{
    private Set<Vehiculo> vehiculos;
    private Iterator<Vehiculo> iterador;
    private String nombre;

    //constructor
    public Marca(String nombre){
        this.nombre = nombre;
        vehiculos = new  HashSet<Vehiculo>();
        iterador = vehiculos.iterator();
    }

    protected void agregar(Vehiculo modelo){
        vehiculos.add(modelo);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //utilizando el iterador recorre la coleccion y compara por modelo para incremetar o reducir el precio
    @Override
    public void aumentarPrecio(String modelo,double precio){
        while(iterador.hasNext()){
            String nom = iterador.next().getModelo();
            if(nom.equals(modelo)){
                double pre = iterador.next().getPrecio();
                iterador.next().setPrecio(pre+precio);
            }
        }
    }

    @Override
    public void decrementarPrecio(String modelo,double precio){
        while(iterador.hasNext()){
            String nom = iterador.next().getModelo();
            if(nom.equals(modelo)){
                double pre = iterador.next().getPrecio();
                if(pre-iterador.next().getPrecio() <=0){
                    iterador.next().setPrecio(0);
                }else {
                    iterador.next().setPrecio(pre - precio);
                }
            }
        }
    }
     //utilizando el remove del iterador elimina un objeto de la coleccion
    @Override
    public void eliminarVehiculo(String modelo){
        while(iterador.hasNext()){
            String nom = iterador.next().getModelo();
            if(nom.equals(modelo)){
                iterador.remove();
            }
        }
    }

    //Mostrar lista de vehiculos
    public void mostrar(){
        for(Vehiculo vehiculo : this.vehiculos){
            System.out.println(vehiculo.toString());
        }
    }
}
