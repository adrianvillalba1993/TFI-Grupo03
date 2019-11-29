package LAB2;

/**
 * Created by adrian on 25/11/2019.
 */
//esto unicamente para aplicar clase abstracta y herencia
public abstract class Operaciones {
    public abstract void aumentarPrecio(String modelo,double precio);
    public abstract void decrementarPrecio(String modelo,double precio);
    public abstract void eliminarVehiculo(String modelo);
}
