package EjerciciosComplementariosLevel2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ejercicio6 {
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        Set<ArrayList<String>> empleados = new HashSet<ArrayList<String>>();
        Map<Integer, Integer> sueldos = new HashMap<Integer, Integer>();
        
        //formulario para ingreso de cantidad de empleados y sus datos
        System.out.println("Ingrese cantidad de empleados:");
        int cantEmpleados=Integer.parseInt(entrada.nextLine());
        for (int i=0;i<cantEmpleados;i++){
            empleadoAdd(empleados,nuevoEmpleado(entrada));
        }
        entrada.close();
        addSueldos(empleados,sueldos);
        //Resultado
        System.out.println("Lista de empleados: [Nombre y Apellido, DNI, Horas trabajadas, Valor por hora]");
        for (ArrayList<String> j:empleados){
            System.out.println(j);
        }
        System.out.println("Diccionario de sueldos: (DNI=SUELDOS)");
        System.out.println(sueldos);
    }
    private static String[] nuevoEmpleado(Scanner entrada){
        String[] datosEmpleado = new String[] {};
        System.out.println("Ingrese los datos en el siguiente formato: NombreyApellido,DNI,horasTrabajadas,valorPorHora");
        datosEmpleado=entrada.nextLine().split(",");
        return datosEmpleado;
    }
    private static void empleadoAdd(Set<ArrayList<String>> empleados, String[] args){
        ArrayList<String> nuevoEmpleado = new ArrayList<String>();
        for (String i:args){
            nuevoEmpleado.add(i);
        }
        empleados.add(nuevoEmpleado); //agrega el nuevo empleado
    }
    private static void addSueldos(Set<ArrayList<String>> empleados,  Map<Integer, Integer> sueldos){
        int dni;
        int valor;
        for (ArrayList<String> empleado:empleados){
            dni=Integer.parseInt(empleado.get(1));
            valor=Integer.parseInt(empleado.get(2))*Integer.parseInt(empleado.get(3));
            sueldos.put(dni,valor);
        }
    }
}
