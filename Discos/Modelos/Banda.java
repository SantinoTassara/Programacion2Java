package Programacion2Java.Discos.Modelos;

import java.util.ArrayList;
import java.util.List;

public class Banda {
    
    private String nombre;
    private String genero;
    private List<Disco> discos;
    
    public Banda(String nombre, String generoMusical) {
        this.nombre = nombre;
        this.genero = generoMusical;
        this.discos = new ArrayList<>();
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

    public List<Disco> getDiscos() {
        return discos;
    }

    public void agregarDisco(Disco disco) {
        discos.add(disco);
        disco.setBandaPerteneciente(this);
    }
}