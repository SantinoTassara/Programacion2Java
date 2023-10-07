package Programacion2Java.Discos.Main;

import Programacion2Java.Discos.Menus.Menu1;
import Programacion2Java.Discos.Modelos.Banda;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Banda> list = new ArrayList<Banda>();
        Menu1 menu = new Menu1(sc,list);

        menu.iniciarMenu();

        sc.close();
    }
    
}
