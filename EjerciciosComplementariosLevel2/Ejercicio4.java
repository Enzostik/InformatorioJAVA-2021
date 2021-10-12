package EjerciciosComplementariosLevel2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        List<String> alumnos = new ArrayList<String>();
        listaAdd(entrada,alumnos,12);
        entrada.close();
        
        List<String> curso1 = listaCursos(1,3,alumnos);
        List<String> curso2 = listaCursos(2,3,alumnos);
        List<String> curso3 = listaCursos(3,3,alumnos);
        //lista de cursos
        System.out.println("Lista de cursos:");
        System.out.println("Curso N 1:"+curso1);
        System.out.println("Curso N 2:"+curso2);
        System.out.println("Curso N 3:"+curso3);
    }    
    private static void listaAdd(Scanner entrada,List<String> lista, int cantidad){
        System.out.println("Ingrese 12 nombres:");
        for (int i=0;i<cantidad;i++){
            System.out.println("El nombre N "+(i+1)+":");
            lista.add(entrada.nextLine());
        }
    }
    private static List<String> listaCursos(int nCurso, int cantidadCursos, List<String> alumnos){
        int cantidad = alumnos.size()/cantidadCursos;
        return alumnos.subList((nCurso-1)*cantidad,nCurso*cantidad);
    }

}
