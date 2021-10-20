package EjerciciosComplementariosLevel2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Ejercicio7 {
    public static void main(String[] args){
        System.out.println("Ejemplo de funcion: fizzBuzzFunction(1, 8)");
        List<String> lista = fizzBuzzFunction(1, 8);
        System.out.println(lista);
        Scanner entrada = new Scanner(System.in);
        int n1;
        int n2;
        System.out.println("Pruebe la funcion. Ingrese un numero entero:");
        n1=entrada.nextInt();
        while (true){
            System.out.println("Ingrese un numero entero mayor a "+n1+":");
            n2=entrada.nextInt();
            if (n2>n1){break;}else{System.out.println("Ha ocurrido un error, intente nuevamente");}
        }
        List<String> listaPersonalizada = fizzBuzzFunction(n1, n2);
        System.out.println(listaPersonalizada);
        entrada.close();
    }
    private static List<String> fizzBuzzFunction(int n1, int n2){
        //condicion n2>n1
        List<String> lista = new ArrayList<String>();
        //primero se recorre desde n1 a n2
        for (int i=n1;i<n2;i++){
            lista.add(comprobarNumero(i));
        }
        return lista;
    }
    private static String comprobarNumero(int numero){
        String rta;
        if (numero%2==0 && numero%3==0){
            rta="FizzBuzz";
        }
        else if (numero%2==0){
            rta="Fizz";
        }
        else if (numero%3==0){
            rta="Buzz";
        }
        else{
            rta=Integer.toString(numero);
        }
        return rta;
    }
}
