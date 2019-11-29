package LAB2;

/**
 * Created by adrian on 18/11/2019.
 */
public class Vehiculo {
    private String marca;
    private double precio;

    private String modelo;

    public Vehiculo(){
        marca = "fiat";
        precio = 0;

        modelo = "siena";
    }
    //CAMBIAR COLORES POR UNA LISTA DE STRINGS
    public Vehiculo(String marca ,String modelo,double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
