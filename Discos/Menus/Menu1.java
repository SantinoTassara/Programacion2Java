package Programacion2Java.Discos.Menus;

import java.util.ArrayList;
import java.util.Scanner;

import Programacion2Java.Discos.Modelos.Banda;
import Programacion2Java.Discos.Modelos.Cancion;
import Programacion2Java.Discos.Modelos.Disco;

public class Menu1 {

    private Scanner sc = new Scanner(System.in);
    private boolean continuar = true;
    private ArrayList<Banda> listaDeBandas;

    public Menu1(Scanner sc, ArrayList<Banda> listaDeBandas){
        this.sc = sc;
        this.listaDeBandas = listaDeBandas;
    }
    
   public void iniciarMenu(){
        while (this.continuar) {
            int opcion = this.elegirOpcion();
            this.realizarOpcion(opcion);
        }
   }

   private int elegirOpcion(){
        this.mostrarOpciones();
        int opcion = this.sc.nextInt();
        return opcion;
   }

   private void finalizar(){
        this.continuar = false;
   }

   private void mostrarOpciones(){
        System.out.println("Elija una opcion");
        System.out.println("0. Salir");
        System.out.println("1.Agregar Banda");
        System.out.println("2.Agregar Disco");
        System.out.println("3.Agregar Cancion");
        System.out.println("4.Mostrar todas las banda");
        System.out.println("5.Buscar y mostrar banda");
        System.out.println("6.Buscar y mostrar Disco");
        System.out.println("7.Buscar y mostrar Cancion");
        System.out.println("8.Buscar disco mas antiguo");
        System.out.println("9.Mostrar Cancion mas larga");
   }

   private void realizarOpcion(int opcion){
        switch (opcion) {
            case 1:
                this.agregarBanda();
                break;
            case 2:
                this.agregarDisco();
                break;
            case 3:
                this.agregarCancion();
                break;
            case 4:
                this.mostrarAllBandas();
                break;
            case 5:
                this.buscarBandaPorNombre();
                break;
            case 6:
                buscarDiscoPorNombre();
                break;
            case 7:
                buscarCancionPorNombre();
                break;
            case 8:
                this.discoMasAntiguo();
                break;
            case 9:
                this.cancionMasLarga();
                break;
            case 0:
                this.finalizar();
                break;
        
            default:
                System.out.println("Opcion incorrecta, ingrese otro numero");
                break;
        }
   }

   private void agregarBanda(){
        System.out.println("Ingrese el nombre de la banda:");
        String nombre = this.sc.next();

        System.out.println("Ingrese el genero musical de la banda");
        String genero = this.sc.next();

        Banda nuevaBanda = new Banda(nombre, genero);
        this.listaDeBandas.add(nuevaBanda);
   }

   private void agregarDisco(){
        System.out.println("De que banda es el disco?");
        String bandaBuscada = this.sc.next();

        for (Banda banda : this.listaDeBandas) {
            if (banda.getNombre().equalsIgnoreCase(bandaBuscada)) { 
                    System.out.println("Ingrese el nombre del disco");
                    String nombre = this.sc.next();
                    System.out.println("Ingrese el genero musical del disco");
                    String genero = this.sc.next();
                    System.out.println("Ingrese el año de salida del disco");
                    int año = this.sc.nextInt();

                    Disco nuevoDisco = new Disco(nombre, genero, año);
                    banda.agregarDisco(nuevoDisco);
                    
                
                break;
            }
        }
   }
   
   private void agregarCancion(){
        System.out.println("A que disco pertenece la cancion?");
        String discoBuscado = this.sc.next();

        for (Banda banda : listaDeBandas) {
            for (Disco disco : banda.getDiscos()) {
                if (disco.getNombre().equalsIgnoreCase(discoBuscado)) {
                    System.out.println("Ingrese el nombre de la Cancion");
                    String nombre = this.sc.next();
                    System.out.println("Ingrese la duracion en segundos");
                    int duracion  = this.sc.nextInt();

                    Cancion nuevaCancion = new Cancion(nombre, duracion);
                    disco.agregarCancion(nuevaCancion);
                    break;
                }
            }
            
        }
   }

   private void mostrarAllBandas(){
        if(this.listaDeBandas.isEmpty()){
            System.out.println("No hay bandas registradas");
        }else{
            for(Banda banda : this.listaDeBandas){
                this.mostrarBanda(banda);
            }
        }
   }
   private void mostrarBanda(Banda banda){
    System.out.println("Banda: " + banda.getNombre());
    System.out.println("Género Musical: " + banda.getGenero());
    System.out.println("Discos de la Banda:");

    for (Disco disco : banda.getDiscos()) {
        System.out.println("  - Disco: " + disco.getNombre());
        System.out.println("    Año de Salida: " + disco.getAñoSalida());
        System.out.println("    Género Musical: " + disco.getGenero());
        System.out.println("    Canciones:");

        for (Cancion cancion : disco.getCanciones()) {
            System.out.println("      - Canción: " + cancion.getNombre());
            System.out.println("        Duración: " + cancion.getDuracion() + " segundos");
        }
    }
    System.out.println("-------------------------------");
   }

   private void mostrarDisco(Disco disco){
        
            System.out.println("  - Disco: " + disco.getNombre());
            System.out.println("    Año de Salida: " + disco.getAñoSalida());
            System.out.println("    Género Musical: " + disco.getGenero());
            System.out.println("    Canciones:");

            for (Cancion cancion : disco.getCanciones()) {
                System.out.println("      - Canción: " + cancion.getNombre());
                System.out.println("        Duración: " + cancion.getDuracion() + " segundos");
            }
    }

    private void mostrarCancion(Cancion cancion){
            System.out.println("      - Canción: " + cancion.getNombre());
            System.out.println("        Duración: " + cancion.getDuracion() + " segundos");
    }
   
   private void buscarBandaPorNombre(){
        System.out.println("Ingrese la banda buscada");
        String nombreBuscado = this.sc.next();
        Banda bandaBuscada = null;

        for (Banda banda : listaDeBandas) {
            if (banda.getNombre().equalsIgnoreCase(nombreBuscado)) {
                bandaBuscada = banda;
                break;
            }
        }
        if (bandaBuscada != null) {
            this.mostrarBanda(bandaBuscada);
        }else{
            System.out.println("Esa banda no esta registrada");
        }
   }

   private void buscarDiscoPorNombre(){
    System.out.println("Ingrese el disco buscado");
    String nombreBuscado = this.sc.next();
    Disco discoBuscado = null;
    for (Banda banda : listaDeBandas) {
        for(Disco disco : banda.getDiscos()){
            if (disco.getNombre().equalsIgnoreCase(nombreBuscado)) {
                discoBuscado = disco;
            }
        }
    }
    if (discoBuscado != null) {
        this.mostrarDisco(discoBuscado);
    }else{
        System.out.println("Ese disco no esta registrado");
    }
   }

   private void buscarCancionPorNombre(){
        System.out.println("Ingrese la cancion buscada");
        String nombreBuscado = this.sc.next();
        Cancion cancionBuscada = null;
        for (Banda banda : listaDeBandas) {
            for(Disco disco : banda.getDiscos()){
                for (Cancion cancion : disco.getCanciones()) {
                    if (cancion.getNombre().equalsIgnoreCase(nombreBuscado)) {
                        cancionBuscada=cancion;
                    }
                }
            }
        }
        if (cancionBuscada != null) {
            this.mostrarCancion(cancionBuscada);
        }else{
            System.out.println("La cancion buscada no existe");
        }
   }

   private void discoMasAntiguo(){
        Disco discoMasAntiguo = null;
        for (Banda banda : listaDeBandas) {
            for (Disco disco : banda.getDiscos()) {
                if (discoMasAntiguo == null || disco.getAñoSalida() < discoMasAntiguo.getAñoSalida()) {
                    discoMasAntiguo = disco;
                }   
            }
        }
        if (discoMasAntiguo != null) {
            this.mostrarDisco(discoMasAntiguo);
        }else{
            System.out.println("No hay discos guardados");
        }
   }

   private void cancionMasLarga(){
    Cancion cancionMasLarga = null;
    for (Banda banda : listaDeBandas) {
        for (Disco disco : banda.getDiscos()) {
            for (Cancion cancion : disco.getCanciones()) {
                if (cancionMasLarga == null || cancion.getDuracion() > cancionMasLarga.getDuracion()) {
                    cancionMasLarga = cancion;
                }
            }
        }
    }
    if (cancionMasLarga != null) {
        this.mostrarCancion(cancionMasLarga);
    }else{
        System.out.println("No hay canciones guardadas");
    }
   }

}
