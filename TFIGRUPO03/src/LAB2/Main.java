package LAB2;

import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("fiat","uno",200000,"rojo");
        Vehiculo v2 = new Vehiculo("fiat","siena",200000,"verde");
        Vehiculo v3 = new Vehiculo("forza","R4",500000,"negro");
        Marca fiat = new Marca("fiat");

        fiat.comparar(v1);
          fiat.comparar(v2);
        fiat.mostrar();

    }
}
