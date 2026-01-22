package FINALES.PARCIAL1.Ejercicio3;

public class Factura {

    int calorias;
    String nombre;

    public Factura(int calorias, String nombre) {
        this.calorias = calorias;
        this.nombre = nombre;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
