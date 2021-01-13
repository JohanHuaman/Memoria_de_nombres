package editor;

import java.util.ArrayList;
import java.util.Scanner;

public class MostarMenu {

    public static ArrayList<String> lista = new ArrayList<>();

    public static void Menu(){

        //Puede ir como response = 0 pero el IDE lo marca como rebundancia
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

            switch (response) {
                case 1:
                    Agregar();
                    break;
                case 2:
                    Listado();
                    break;
                case 3:
                    Listado2();
                    break;
                case 4:
                    Modificar();
                    break;
                case 5:
                    Eliminar();
                    break;
                case 6:
                    Borrar();
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

    private static void Agregar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String add = sc.nextLine();
        lista.add(add);
    }

    private static void Listado(){
        System.out.println();
        System.out.println(lista);
    }

    private static void Listado2(){
        for (int i = 0; i < lista.size(); i++) {
            int j = i + 1;
            System.out.println(j+ ". " +lista.get(i));
        }
    }

    private static void Modificar(){
        System.out.println("Número del nombre a modificar:");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i+ ". " +lista.get(i));
        }

        System.out.println("\nNúmero?: ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        System.out.println("\nIngrese nombre modificado");
        Scanner sc2 = new Scanner(System.in);
        String modif = sc2.nextLine();

        if((index + 1) > lista.size()){
            System.out.println("Por favor ingrese una opción correcta");
        }else{
            lista.set(index,modif);
            System.out.println("Modificado!");
        }
    }

    private static void Eliminar(){
        System.out.println("Número del nombre a eliminar:");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i+ ". " +lista.get(i));
        }

        System.out.println("\nNúmero?: ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        if((index + 1) > lista.size()){
            System.out.println("Por favor ingrese una opción correcta");
        }else{
            lista.remove(index);
            System.out.println("Eliminado!");
        }
    }

    private static void Borrar(){
        lista.clear();
        System.out.println("Borrado!");
    }
}