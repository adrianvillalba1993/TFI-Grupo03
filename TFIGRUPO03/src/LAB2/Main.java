package LAB2;

import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("fiat","uno",200000);
        Vehiculo v2 = new Vehiculo("fiat","siena",200000);
        Vehiculo v3 = new Vehiculo("forza","R4",500000);
        Marca fiat = new Marca("fiat");
        Comparacion comp = new Comparacion();
        comp.comparar(fiat,v1);
        comp.comparar(fiat,v2);

        Marca m1 = comp.comparar(fiat,v3);
        m1.mostrar();
        fiat.mostrar();



    }


}
