package EjerciciosComplementariosLevel2;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args){
        List<Integer> baraja = new ArrayList<Integer>();
        addCartas(baraja);
        System.out.println("Cartas ordenadas: "+baraja); //Orden actual de cartas
        Collections.reverse(baraja); //invierte el orden de las cartas
        System.out.println("Cartas invertidas: "+baraja);
        Collections.shuffle(baraja); //desrodenar las cartas aleatoriamente
        System.out.println("Cartas mezcladas: "+baraja);

    }
    private static void addCartas(List<Integer> baraja){
        for (int i=0;i<4;i++){
            for (int j=1;j<11;j++){
                baraja.add(j);
            }
        }
    }
}
