package EjerciciosComplementariosLevel1;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int resultado = 0;
        System.out.println("Ingrese el primer número entero: ");
        int num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo número entero: ");
        int num2 = entrada.nextInt();
        entrada.close();
        for (int i=0;i<num1;i++){
            resultado += num2;
        };
        System.out.println(num1+" X "+num2+" = "+resultado);
    }
}
