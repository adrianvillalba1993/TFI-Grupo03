package LAB2;

import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    //agregar_datos();
      //  Ventana vn = new Ventana();
        /*
        Ejemplo ej1 = new Ejemplo();
        Ejemplo ej2 = new Ejemplo();
        Set<Ejemplo> nuevo = new HashSet<Ejemplo>();
        nuevo.add(ej1);
        nuevo.add(ej2);

        for(Ejemplo ejemplo:nuevo){
            System.out.println(ejemplo.toString());
        }
        */

    }

    public static void agregar_datos(){
        Vehiculo auto;
        Scanner nuevo = new Scanner(System.in);
        System.out.println("marca del vehiculo:");
        String str = nuevo.nextLine();
        System.out.println("modelo del vehiculo:");
        String str2 = nuevo.nextLine();
        System.out.println("Precio del vehiculo:");
        double precio = nuevo.nextDouble();
        String color = "azul";
        auto = new Vehiculo(str,str2,precio,color);
        System.out.println(auto.toString());


    }
}
