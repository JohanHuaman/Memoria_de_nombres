import java.util.ArrayList;

public class ArraylistRepaso {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();

        lista.add("Johan");
        lista.add("Alex");
        lista.add("Ronald");
        lista.add("Leonor");
        lista.add("Cirilo");
        lista.add("Machín");
        lista.add("Marley");
        lista.add("Maya");
        lista.add("Isabel");

        /*
        //Imprime todos los elementos de la lista en una sola linea
        System.out.println(lista);

        //Imprime el número de elementos de la lista
        int size = lista.size();
        System.out.println(size);

        //Devuelve el elemento del indice mostrado
        String indice = lista.get(0);
        System.out.println(indice);

        //Cambia el nombre del indice indicado
        String cambio = lista.set(0, "Johancito");
        System.out.println(lista);
*/
        //Remover algún dato
        String remove = lista.remove(8);
        System.out.println(lista);

        System.out.println((lista.size()));
        System.out.println();


        //Imprimeros todos los Elementos de nuestra lista con un for
        for (int i = 0; i < lista.size(); i++) {
            int j = i +1;
            System.out.println(j + ". " +lista.get(i));
        }

        System.out.println();
        System.out.println();

        //Imprimeros todos los Elementos de nuestra lista con un foreach
        for (String indice: lista) {
            System.out.println(indice);
        }
    }
}
