package MyPaquetote;


/**
 * @author Masterk3y (@OrlandoHC)
 * Estructura de Datos
 */

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int discos;
        System.out.println();
        System.out.println("|=====================================|");
        System.out.println("|======= Torres de Hanoi v3.0 ========|");
        System.out.println("|================ By =================|");
        System.out.println("|============ @Masterk3y =============|");
        System.out.println("|========= www.orlandohc.org =========|");
        System.out.println();
        // Creamos una partida de N discos
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Introduzca el numero de discos a jugar: ");
        discos=Integer.parseInt(entrada.readLine());
        Hanoi H = new Hanoi (discos);
        // Si el usuario escribe un numero igual o menor a 0 no nos arroja un mensaje y sale del programa
        while(discos<=0){
            System.out.print("No es un numero correcto para jugar ");
        
            // Si no es menor o igual a 0 la resolvemos (movemos de columna 0 a columna 2 los n discos
        }
        H.MoverN(0,2,(discos));
        // Mostramos resultado.
        H.Mostrar();
        System.out.print("Juego terminado");
        }
       }
