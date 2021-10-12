package EjerciciosComplementariosLevel1;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //para que se ingrese info desde el teclado
        System.out.println("Ingrese su nombre");
        String nombre = entrada.nextLine();
        entrada.close();
        System.out.println("Hola "+nombre+"!!!");
    }
}
