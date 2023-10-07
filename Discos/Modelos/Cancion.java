package Programacion2Java.Discos.Modelos;

public class Cancion {
    private String nombre;
    private int duracion;
    private Disco discoPerteneciente;
    
    public Cancion(String nombre, int duracion){
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getDuracion() {
        return this.duracion;
    }
    
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
  
    public Disco getDiscoPerteneciente() {
        return this.discoPerteneciente;
    }

    public void setDiscoPerteneciente(Disco discoPerteneciente) {
        this.discoPerteneciente = discoPerteneciente;
    }
}