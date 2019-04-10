package Practica1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
public class Ej24 {
    public static void main(String[] args) throws FileNotFoundException{
        String[] v1={"CDEF_Logroño","Levante_UD_SAD","Valencia_Féminas_CF"};
        char esperado[][]={{'-','2','X'},{'-','-','X'},{'1','-','-'}};
        prueba(v1,"datos/liga.txt",esperado);

    }
    private static void prueba(String[] v1, String fichero, char[][] esperado)throws FileNotFoundException{
        char[][] resultado=crearMatrizResultados(v1,fichero);
        if (Arrays.deepEquals(resultado,esperado))
            System.out.println("El resultado era el esperado:");
        else {
            System.out.println("El resultado no era el esperado, se esperaba:");
            for (char[] fila : esperado)
                System.out.println(Arrays.toString(fila));
            System.out.println("Y se ha obtenido; ");
        }
        for (char[] fila : resultado)
            System.out.println(Arrays.toString(fila));
        System.out.println();
    }
    private static char[][] crearMatrizResultados(String[] v1, String nombreFichero) throws FileNotFoundException{
        File ruta=new File(nombreFichero);
        char[][] m1 = new char[v1.length][v1.length];
            Scanner fichero = new Scanner(ruta);
            int filas = m1.length, columnas = m1[0].length;
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    m1[i][j] = '-';
                }
            }
            while (fichero.hasNext()) {
                String equipo_local = fichero.next();
                int goles_local = fichero.nextInt();
                String equipo_visitante = fichero.next();
                int goles_visitante = fichero.nextInt();
                if (goles_local > goles_visitante)
                    m1[buscarIndice(v1,equipo_local)][buscarIndice(v1,equipo_visitante)] = '1';
                else if (goles_visitante > goles_local)
                    m1[buscarIndice(v1,equipo_local)][buscarIndice(v1,equipo_visitante)] = '2';
                else
                   m1[buscarIndice(v1,equipo_local)][buscarIndice(v1,equipo_visitante)] = 'X';
            }
            fichero.close();
            return m1;
        }
    private static int buscarIndice(String[] v1,String n){
        for (int i=0;i<v1.length;i++){
            if (v1[i].equals(n))
                return i;
        }
        return -1;
    }
    }