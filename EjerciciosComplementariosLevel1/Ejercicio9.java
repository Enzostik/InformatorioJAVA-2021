package EjerciciosComplementariosLevel1;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String texto = pideValor(entrada, "Texto");
        char letra = pideValor(entrada, "Letra").charAt(0);
        int cantidadLetra=0;

        for (int i=0; i<texto.length();i++){
            if (texto.charAt(i)==letra){
                cantidadLetra++;
            }
        };
        System.out.println("Cantidad de la letra ["+letra+"]: "+cantidadLetra);
    }
    private static String pideValor(Scanner entrada, String atributo){
        System.out.println(atributo+":");
        return entrada.nextLine();
    }
}
