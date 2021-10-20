package EjerciciosComplementariosLevel2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Ejercicio5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        //crear las listas
        List<Integer> horas_trabajadas=new ArrayList<Integer>();
        List<Integer> valor_por_hora=new ArrayList<Integer>();
        List<Integer> resultados=new ArrayList<Integer>();
        //cargar los valores para las dos primeras listas
        System.out.println("Lista de Horas Trabajadas:");
        cargarLista(horas_trabajadas,5,entrada);
        System.out.println("Lista de Valor por Hora:");
        cargarLista(valor_por_hora,5,entrada);
        entrada.close();
        //calcular los elementos de la lista de "resultados"
        System.out.println("Lista de Resultados:");
        resultados=resultadosLista(horas_trabajadas,valor_por_hora);
    }
    private static void cargarLista(List<Integer> lista,int cantidad ,Scanner entrada){
        for (int i=0;i<cantidad;i++){
            System.out.println("Ingrese el valor para el dia N "+(i+1)+":");
            lista.add(entrada.nextInt());
        }
    }
    private static List<Integer> resultadosLista(List<Integer> horas,List<Integer> valor){
        List<Integer> resultados = new ArrayList<Integer>();
        int total=0;
        for (int i=0;i<horas.size();i++){
            resultados.add(horas.get(i)*valor.get(i));
        }
        for (int i:resultados){
            total+=i;
        }
        System.out.println(resultados);
        System.out.println("Total Final: $ "+total);
        return resultados;
    }
}
