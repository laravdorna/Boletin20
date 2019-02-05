/*
 * O triángulo de Tartaglia utilizase para calcular, 
dun xeito sinxelo números combinatorios . 
Neste triángulo os lados son 1 e,
os outros valores achanse sumando os dous valores da fila anterior.
Facer un programa que, dado un número de filas, dibuxe o triangulo de Tartaglia . 

 */
package boletin20_triangulopascal;

import java.util.Scanner;

/**
 *
 * @author Lara Vazquez Dorna
 */
public class Boletin20_trianguloPascal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nIndica el numero de lineas a mostrar: ");
        int n = sc.nextInt();

        int[][] matriz = new int[n + 1][];
        matriz[0] = new int[]{1};

        System.out.println(String.format("%5d", matriz[0][0]));
        for (int k = 1; k < matriz.length; k++) {
            matriz[k] = new int[k + 1];
            matriz[k][0] = matriz[k][k] = 1;
            System.out.print(String.format("%5d", 1));
            for (int i = 1; i < k; i++) {
                matriz[k][i] = matriz[k - 1][i - 1] + matriz[k - 1][i];
                System.out.print(String.format("%5d", matriz[k][i]));
            }
            System.out.println(String.format("%5d", 1));
        }
    }
}
