package EjerciciosComplementariosLevel1;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String salida = new String();
        System.out.println("Ingrese un número: ");
        int numero = entrada.nextInt();
        entrada.close();
        //hacer la secuencia de numeros
        for (int i = 0; i<numero; i++){
            salida+=i+1+" ";
            System.out.println(salida);
        }
    }
}
