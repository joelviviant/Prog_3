package FINALES.FINAL2.Ejercicio2;

import FINALES.FINAL1.Ejercicio3.Factura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ejercicio2 {

    public Cd ElegirTemas(List<Cancion> canciones) {
        int max =60;
        double tiempoActual = 0;
        Cd cd = new Cd(new ArrayList<>());
        canciones.sort(Comparator.comparing(Cancion::getDuracion));
        for (Cancion cancion : canciones) {
            if(cancion.getDuracion() + tiempoActual <= max){
                cd.addCancion(cancion);
                tiempoActual = tiempoActual + cancion.getDuracion();
            }
        }
        return cd;
    }
}
