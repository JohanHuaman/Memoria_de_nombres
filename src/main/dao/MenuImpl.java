package main.dao;

import main.model.Persona;
import static main.MenuVista.lista;
import java.util.Scanner;

public class MenuImpl implements Menu{

    @Override
    public void AgregarElemento() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String add = sc.nextLine();

        Persona p = new Persona();
        p.setNombre(add);

        lista.add(p);
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

        Persona p = new Persona();
        p.setNombre(modif);

        if((index + 1) > lista.size()){
            System.out.println("Por favor ingrese una opción correcta");
        }else{
            lista.set(index,p);
            System.out.println("Modificado!");
        }
    }

    @Override
    public void EliminarElemento() {

        if(lista.size() == 0){
            System.out.println("\nNo hay elementos para eliminar");
        } else {
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

    }

    @Override
    public void BorrarLista() {
        if(lista.size() == 0){
            System.out.println("\nNo hay elementos para eliminar");
        } else {
            lista.clear();
            System.out.println("Borrado!");
        }

    }
}
