package practica4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) throws FileNotFoundException {
        String[] dnisCenso = crearVectorDni("datos/dniCenso.txt");
        String[] dnisClientes = crearVectorDni("datos/dniClientes.txt");

        long tiempoInicio = System.currentTimeMillis();
        int coincidencias = contarCoincidencias(dnisCenso, dnisClientes);
        long tiempoTranscurrido = System.currentTimeMillis() - tiempoInicio;

        System.out.println("He encontrado " + coincidencias
                + " coincidencias (empleando " + tiempoTranscurrido
                + " milisegundos)");

    }

    private static int contarCoincidencias(String[] dnisCenso, String[] dnisClientes) {
        int coincidencias=0;
        for(int i=0;i<dnisClientes.length;i++){ //O(n²)
            if(buscarDni(dnisClientes[i],dnisCenso))
                coincidencias++;
        }

        return coincidencias;
    }
    private static boolean buscarDni(String dni,String[] vectorDni){ //O(n)
        for (int i=0;i<vectorDni.length;i++){
            if(dni.equals(vectorDni[i]))
                return true;
        }
        return false;
    }

    private static String[] crearVectorDni(String s) throws FileNotFoundException {
        File file = new File(s);
        Scanner sc = new Scanner(file);
        int contador = 0;
        String[] dni;
        dni = new String[sc.nextInt()];
        sc.nextLine();

        while (sc.hasNextLine()) {
            dni[contador]=sc.nextLine();
            contador++;
        }

            return dni;
    }

}
