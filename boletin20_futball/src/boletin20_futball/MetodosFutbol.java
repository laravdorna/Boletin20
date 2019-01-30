/*
 * Gravar e imprimir a táboa. 
. Obter unha listaxe dos equipos por orde de menor n° de goles na liga. 
. Indicar o equipo que marca máis goles en cada xornada. 
. Que equipo e en que xornada se rexistran máis goles? 
. Consultas por equipo e xornada indicando o n° de goles. 
 */
package boletin20_futball;

/**
 *
 * @author lvazquezdorna
 */
public class MetodosFutbol {

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
    private String equipos[] ={"celta", "depor", "lugo"};// new String[nEquipos];
    /**
     * array que guarda la jornada en la que participa un equipo
     */
    private String jornadas[] = {"x1","x2","x3","x4"};//new String[nJornadas];
    /**
     * matriz que guarda el numero de goles de un equipo en una jornada
     */
    private int goles[][] = new int[nEquipos][nJornadas];
    
    //guardar datos: sub menu que pida el numero de participantes jornadas y goles
    
    //mostrartabla: que muestre los arrays jornadas y equipos y la matriz goles
    
    //mostrar que equipo marca mas goles en cada jornada
    
    //  mostrar que equipo y jornada con mayor numero de goles
    
    // consulta numero de goles por equipo y jornada

}
