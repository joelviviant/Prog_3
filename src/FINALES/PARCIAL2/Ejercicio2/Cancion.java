package FINALES.PARCIAL2.Ejercicio2;

public class Cancion {

    String titulo;
    Double duracion;


    public Cancion(String titulo, Double duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Double getDuracion() {
        return duracion;
    }
}
