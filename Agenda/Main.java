package Programacion2Java.Agenda;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        ContenedorContactos contacts = new ContenedorContactos(50);

        boolean continuar = true;

        while(continuar = true){
            System.out.println("1.Agregar Contacto");
            System.out.println("2.Mostrar Contactos");
            System.out.println("0.Salir");
            int respuesta;

            respuesta = sc.nextInt();

            switch (respuesta) {
			
				case 1:{
					Contacto nuevoContacto = menu.crearContacto(sc);
					boolean pudo = contacts.agregar(nuevoContacto);
					if(pudo) {
						System.out.println("El contacto fue agregado con éxito");
					}else {
						System.out.println("El contacto no se pudo agregar");
					}
				} break;
				case 0:{
					continuar = false;
				} break;

				default:{
					System.out.println("Ha ingresado una opción inválida, vuelva a intentarlo");
				}break;
			}
        }

        System.out.println("Fin del Programa x_x");
        sc.close();
    }
}