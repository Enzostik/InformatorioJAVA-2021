package EjerciciosComplementariosLevel2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        List<String> ciudades = new ArrayList<String>();
        for (int i=1;i<4;i++){
            System.out.println("Ingrese el nombre de la "+i+" ciudad:");
            ciudades.add(entrada.nextLine());
        }
        entrada.close();
        ImprimeLista(ciudades);
    }
    private static void ImprimeLista(List<String> ciudades){
        int i = 0;
        for (String ciudad : ciudades){
            i++;
            System.out.println("#"+i+" - "+ciudad);
        }
    }
}
