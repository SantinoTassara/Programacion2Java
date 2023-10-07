package Programacion2Java.Discos.Modelos;

import java.util.ArrayList;
import java.util.List;

public class Disco {
    private String nombre;
    private String genero;
    private int añoSalida;
    private Banda bandaPerteneciente;
    private List<Cancion> canciones;


    public Disco(String nombre, String genero, int añoSalida){
        this.nombre = nombre;
        this.genero = genero;
        this.añoSalida = añoSalida;
        this.canciones = new ArrayList<>();
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    public String getGenero() {
        return this.genero;
    }
   
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAñoSalida() {
        return this.añoSalida;
    }
    
    public Banda getBanda() {
        return this.bandaPerteneciente;
    }
    
    public void setBandaPerteneciente(Banda bandaPerteneciente) {
        this.bandaPerteneciente = bandaPerteneciente;
    }

    public void setBanda(Banda bandaPerteneciente) {
        this.bandaPerteneciente = bandaPerteneciente;
    }

        public List<Cancion> getCanciones() {
        return canciones;
    }

    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
        cancion.setDiscoPerteneciente(this);
    }
}