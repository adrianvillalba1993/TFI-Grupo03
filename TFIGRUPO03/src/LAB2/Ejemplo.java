package LAB2;

/**
 * Created by adrian on 20/11/2019.
 */
public class Ejemplo {
    private String nombre;
    private int edad;

    public Ejemplo(){
        nombre = "pablo";
        edad = 26;
    }

    @Override
    public String toString() {
        return "Ejemplo{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
