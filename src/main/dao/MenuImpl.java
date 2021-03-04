package main.dao;

import static main.MostarMenuImpl.lista;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuImpl implements Menu{

    //public static ArrayList<String> lista = new ArrayList<>();

    @Override
    public void AgregarElemento() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String add = sc.nextLine();
        lista.add(add);
    }

    @Override
    public void Listado() {
        System.out.println();
        System.out.println(lista);
    }

    @Override
    public void Listado2() {
        for (int i = 0; i < lista.size(); i++) {
            int j = i + 1;
            System.out.println(j+ ". " +lista.get(i));
        }
    }

    @Override
    public void ModificarElemento() {
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

    @Override
    public void EliminarElemento() {
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

    @Override
    public void BorrarLista() {
        lista.clear();
        System.out.println("Borrado!");
    }
}
