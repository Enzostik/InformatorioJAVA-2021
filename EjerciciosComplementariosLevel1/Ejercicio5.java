package EjerciciosComplementariosLevel1;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer número entero: ");
        int num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo número entero: ");
        int num2 = entrada.nextInt();
        entrada.close();
        int resultado = num1*num2;
        System.out.println(num1+" X "+num2+" = "+resultado);
    }
}
