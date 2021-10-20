package EjerciciosComplementariosLevel1;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args){
        String nombre = pideDato("Nombre y Apellido");
        String edad = pideDato("Edad");
        String direccion = pideDato("Dirección");
        String ciudad = pideDato("Ciudad");
        //resultado
        System.out.println(ciudad+" - "+direccion+" - "+edad+" - "+nombre);
    }
    private static String pideDato(String atributo){
        Scanner entrada = new Scanner(System.in);
        System.out.println(atributo+":");
        String resultado = entrada.nextLine();
        entrada.close();
        return resultado;
    }
}
