/*
 * Gravar e imprimir a táboa. 
. Obter unha listaxe dos equipos por orde de menor n° de goles na liga. 
. Indicar o equipo que marca máis goles en cada xornada. 
. Que equipo e en que xornada se rexistran máis goles? 
. Consultas por equipo e xornada indicando o n° de goles. 
 */
package boletin20_futball;

import java.util.Scanner;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

/**
 *
 * @author lvazquezdorna
 */
public class MetodosFutbol {
Scanner teclado = new Scanner(System.in);
    /**
     * guarda el numero de equipos que juegan en el torneo
     */
    private final int nEquipos = 3;
    /**
     * guarda el numero de jornadas del torneo
     */

    private final int nJornadas = 4;
    /**
     * array que guarda el nombre de los equipos que participan
     */
    //para la prueba introduzco unos nombres directos en los array
    private String equipos[] = {"celta", "depor", "lugo"};// new String[nEquipos];
    /**
     * array que guarda la jornada en la que participa un equipo
     */
    private String jornadas[] = {"x1", "x2", "x3", "x4"};//new String[nJornadas];
    /**
     * matriz que guarda el numero de goles de un equipo en una jornada
     */
    private int goles[][] = new int[nEquipos][nJornadas];

    //guardar datos: sub menu que pida el numero de participantes jornadas y goles
    public int darValorVentana() {
        return Integer.parseInt(JOptionPane.showInputDialog("numero de goles"));

    }

    public int darValor() {
        int num;
        num=teclado.nextInt();
        return num;
    }

    public void crearMatriz() {
        for (int i = 0; i < goles.length; i++) {
            System.out.println("Introduce el numero de goles del equipo "+equipos[i]+"en la jornada "+jornadas[i]);
            for (int j = 0; j < goles[i].length; j++) {
                goles[i][j] = darValor();
            }
        }
    }

    //mostrartabla: que muestre los arrays jornadas y equipos y la matriz goles
    public void mostrarMatriz() {
        for (int x = 0; x < jornadas.length; x++) {
            System.out.print("    " + jornadas[x] + "  ");

        }
        System.out.println("\n");
        for (int i = 0; i < goles.length; i++) {

            System.out.print(equipos[i]);
            System.out.print("| ");
            for (int j = 0; j < goles[0].length; j++) {
                System.out.print("\t" + goles[i][j] + "  ");
                if (j != goles[i].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println(" \t|");
        }
    }
    //mostrar que equipo marca mas goles en cada jornada

    //  mostrar que equipo y jornada con mayor numero de goles
    // consulta numero de goles por equipo y jornada
}
