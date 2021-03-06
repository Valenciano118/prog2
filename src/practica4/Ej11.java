package practica4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) throws FileNotFoundException {
        String[] dnisCenso = crearVectorDni("datos/dniCenso.txt");
        String[] dnisClientes = crearVectorDni("datos/dniClientesOrdenado.txt");

        long tiempoInicio = System.currentTimeMillis();
        int coincidencias = contarCoincidencias(dnisCenso, dnisClientes);
        long tiempoTranscurrido = System.currentTimeMillis() - tiempoInicio;

        System.out.println("He encontrado " + coincidencias
                + " coincidencias (empleando " + tiempoTranscurrido
                + " milisegundos)");

    }

    private static int contarCoincidencias(String[] dnisCenso, String[] dnisClientes) {//O(n*log(n))
        int coincidencias=0;
        for(int i=0;i<dnisCenso.length;i++){
            if(buscarDni(dnisCenso[i],dnisClientes))
                coincidencias++;
        }

        return coincidencias;
    }
    private static boolean buscarDni(String dni,String[] vectorDni){ //O(log(n))
        int inicio = 0;
        int fin = vectorDni.length -1;

        while (inicio<=fin){
            int medio=(inicio+fin)/2;

            if (vectorDni[medio].compareTo(dni)<0)
                inicio = medio +1;
            else if (vectorDni[medio].compareTo(dni)>0)
                fin = medio -1;
            else
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

