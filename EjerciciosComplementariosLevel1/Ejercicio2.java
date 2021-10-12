package EjerciciosComplementariosLevel1;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int numero1 = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el segundo número: ");
        int numero2 = Integer.parseInt(entrada.nextLine());
        entrada.close();
        //resultado y operaciones
        devuelveImprime(numero1,"+",numero2);
        devuelveImprime(numero1,"-",numero2);
        devuelveImprime(numero1,"*",numero2);
        devuelveImprime(numero1,"/",numero2);
        devuelveImprime(numero1,"%",numero2);
    }

    private static void devuelveImprime(int num1, String operacion, int num2){
        float resultado=0f;
        switch (operacion){
            case "+":
                resultado=num1+num2;
                break;
            case "-":
                resultado=num1-num2;
                break;
            case "*":
                resultado=num1*num2;
                break;
            case "/":
                resultado=num1/num2;
                break;
            case "%":
                resultado=num1%num2;
                break;
            default:
                resultado=num1+num2;
                break;
        }
        System.out.println(num1+" "+operacion+" "+num2+" = "+resultado);
    }
}
