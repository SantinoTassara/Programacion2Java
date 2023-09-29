package Programacion2Java.Agenda;

import java.util.Scanner;

public class Menu {
    public Contacto crearContacto(Scanner sc){
        String Nombre;
        int Edad;
        double DNI;
        int NumCelular;

        System.out.println("Ingrese el Nombre del contacto");
        Nombre = sc.next();

        System.out.println("Ingrese la Edad del contacto");
        Edad = sc.nextInt();

        System.out.println("Ingrese el Dni del contacto");
        DNI = sc.nextDouble();

        System.out.println("Ingrese el Numero del contacto");
        NumCelular = sc.nextInt();

        Contacto nuevoContacto = new Contacto(Nombre, Edad, DNI, NumCelular);

        return nuevoContacto;

    }

}
