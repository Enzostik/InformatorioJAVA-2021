package EjerciciosComplementariosLevel2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        List<Integer> numeros = crearLista(5,entrada);
        List<Integer> numerosAdd = listaAdd(numeros,entrada);
        entrada.close();
        System.out.println("Antes de los elementos agregados:");
        devuelve(numeros);
        System.out.println("Despues de los elementos agregados:");
        devuelve(numerosAdd);
    }
    private static List<Integer> crearLista(int cantidad, Scanner entrada){
        List<Integer> lista = new ArrayList<Integer>();
        
        for (int i=0; i<cantidad;i++){
            System.out.println("Ingrese el elemento "+(i+1)+" de la lista:");
            lista.add(entrada.nextInt());
        }
        return lista;
    }
    private static List<Integer> listaAdd(List<Integer> lista, Scanner entrada){
        List<Integer> listaNew = new ArrayList<Integer>(lista);
        
        System.out.println("Ingrese el elemento al principio de la lista:");
        listaNew.add(0,entrada.nextInt());
        System.out.println("Ingrese el elemento al final de la lista:");
        listaNew.add(entrada.nextInt());

        return listaNew;
    }
    private static void devuelve(List<Integer> lista){
        System.out.println("Elementos de la lista:");
        int contador=0;
        for (int i:lista){
            contador++;
            System.out.println("Elemento N "+contador+": "+i);
        }
        System.out.println("Tamaño de la lista: "+lista.size());
    }
}
