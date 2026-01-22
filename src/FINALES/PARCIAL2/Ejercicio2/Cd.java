package FINALES.PARCIAL2.Ejercicio2;

import java.util.List;

public class Cd {

    public List<Cancion> canciones;
    public Cd(List<Cancion> canciones) {
        this.canciones = canciones;
    }

    public void addCancion(Cancion c){
        canciones.add(c);
    }

}
