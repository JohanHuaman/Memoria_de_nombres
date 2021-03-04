package main;

import main.dao.MenuImpl;
import main.model.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuVista {

    public static ArrayList<Persona> lista = new ArrayList<>();

    public static void Menu(){

        int response;

        do {
            System.out.println();
            System.out.println("GESTOR DE NOMBRES");
            System.out.println("Ingrese un nombre:");
            System.out.println("1. Agregar dato");
            System.out.println("2. Listado de datos en una linea");
            System.out.println("3. Listado de datos con detalle");
            System.out.println("4. Modificar algún dato");
            System.out.println("5. Eliminar nombre");
            System.out.println("6. Borrar todo");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = sc.nextInt();

            MenuImpl m = new MenuImpl();

            switch (response) {
                case 1:
                    m.AgregarElemento();
                    break;
                case 2:
                    m.Listado();
                    break;
                case 3:
                    m.Listado2();
                    break;
                case 4:
                    m.ModificarElemento();
                    break;
                case 5:
                    m.EliminarElemento();
                    break;
                case 6:
                    m.BorrarLista();
                    break;
                case 0:
                    System.out.println("Nos vemos!");
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta");
                    break;
            }
        }while(response !=0);
    }

}