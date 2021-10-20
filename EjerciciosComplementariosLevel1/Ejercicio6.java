package EjerciciosComplementariosLevel1;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer número entero: ");
        int num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo número entero: ");
        int num2 = entrada.nextInt();
        entrada.close();
        int resultado = 1;
        for (int i = 0; i<num2; i++){
            resultado*=num1;
        };
        System.out.println(num1+" elevado a "+num2+" = "+resultado);
    }
}
