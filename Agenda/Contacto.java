package Programacion2Java.Agenda;

public class Contacto {
    private String Nombre;
    private int Edad;
    private double DNI;
    private int NumCelular;

    //Constructor
    public Contacto(String nombre, int edad, double dni, int NumDelCeludar){
        this.Nombre = nombre;
        this.Edad = edad;
        this.DNI = dni;
        this.NumCelular = NumDelCeludar;
    }

    //Getters and Setters
    public String GetNombre(){
        return this.Nombre;
    }

    public void SetNombre(String nombre){
        this.Nombre = nombre;
    }

    public int GetEdad(){
        return this.Edad;
    }

    public void SetEdad(int edad){
        this.Edad = edad;
    }

    public double GetDni(){
        return this.DNI;
    }

    public void SetDni(double dni){
        this.DNI = dni;
    }

    public int GetNumCelular(){
        return this.NumCelular;
    }

    public void SetNombre(int NumDelCelular){
        this.NumCelular = NumDelCelular;
    }
}
