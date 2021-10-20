package EjerciciosComplementariosLevel1;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Texto de entrada (minúsculas): ");
        String texto = entrada.nextLine();
        int asciiLetra;
        String textoMayus = new String();
        entrada.close();
        for (int i=0;i<texto.length();i++){
            asciiLetra=(int)texto.charAt(i);
            textoMayus+=(char)(asciiLetra-32);
        };
        System.out.println(textoMayus);
    }
}
