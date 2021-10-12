package EjerciciosComplementariosLevel1;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int numero = entrada.nextInt();
        entrada.close();
        int resultado = 1;

        for (int i = 0; i<numero; i++){
            resultado*=i+1;
        }
        System.out.println("El factorial de "+numero+" es: "+resultado);
    }
}
