package LAB2;

import java.util.Scanner;

/**
 * Created by adrian on 29/11/2019.
 */
public class Comparacion {


    public Marca comparar(Marca marca ,Vehiculo modelo){
        if(marca.getNombre().equals(modelo.getMarca())){
            marca.agregar(modelo);
        }else{
            System.out.println("desea crear una nueva marca?");
            System.out.println("S/N");
            Scanner teclado = new Scanner(System.in);
            String opcion = teclado.next();

            if(opcion.equalsIgnoreCase("S")){
                System.out.println("nombre de la nueva marca:");
                opcion = teclado.next();
                Marca nueva = new Marca(opcion);
                nueva.agregar(modelo);
                return nueva;
            }else{
                //salir del metodo

            }
        }
        return marca;
    }
}
