/*
 *A seguinte táboa recolle lós goles marcados polos 20 equipos de 1ª  división en cada unha das 36 xornadas. 

Equipo/xornada              X1    X2       X3 ...
        Celta               3     4        2
        Depor               1     2        1 
        Malaga              3     0        1

. Pídese: 
. Gravar e imprimir a táboa. 
. Obter unha listaxe dos equipos por orde de menor n° de goles na liga. 
. Indicar o equipo que marca máis goles en cada xornada. 
. Que equipo e en que xornada se rexistran máis goles? 
. Consultas por equipo e xornada indicando o n° de goles. 
 */
package boletin20_futball;

import java.util.Scanner;

/**
 *
 * @author Lara Vazquez Dorna
 */
public class Boletin20_futball {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        do {
            opcion = menu();
            switch (opcion) {
                case 1://crea tabla

                    break;
                case 2://muestra tabla

                    break;
                case 3://listar equipos de menor a mayor goleador

                    break;
                case 4://equipo goleador

                    break;
                case 5:// goles de equipo

                    break;
            }

        } while (opcion != 0);

    }

    /*
     guardar datos: sub menu que pida el numero de participantes jornadas y goles
     mostrartabla: que muestre los arrays jornadas y equipos y la matriz goles
     mostrar que equipo marca mas goles en cada jornada
     mostrar que equipo y jornada con mayor numero de goles
     consulta numero de goles por equipo y jornada
     */
    private static int menu() {
        int op = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("GESTOR DE TORNEO DE FUTBOL:");
            System.out.println("1=> Crear torneo:");
            System.out.println("2=> Mostrar torneo:");
            System.out.println("3=> Lista de equipos(de menor a mayor goleador):");
            System.out.println("4=> Equipo goleador:");
            System.out.println("5=> Goles partido:");
            System.out.println("0=> SALIR.");
            try {
                op = Integer.parseInt(teclado.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Debes escoger un valor entre 0 y 5.");
                op = -1;
            }

        } while (op < 0 || op > 4);
        return op;
    }
     private static int menuCrearTorneo() {
        int op = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("CREAR UN NUEVO TORNEO:");
            System.out.println("1=> numero de equipos:");
            System.out.println("2=> numero de jornadas:");
            System.out.println("3=> goles en cada jornada:");
            System.out.println("0=> SALIR.");
            try {
                op = Integer.parseInt(teclado.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Debes escoger un valor entre 0 y 3.");
                op = -1;
            }
        } while (op < 0 || op > 4);
        return op;
    }
    
    
}
