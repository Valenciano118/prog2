/*package Practica2.Ej2;
import Practica2.Ej1.Punto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Restaurante {
    private String nombre;
    private Punto posición;
    private int valoración;

    private Restaurante(String nombre,Punto posición,int valoración){
        this.nombre=nombre;
        this.posición=posición;
        this.valoración=valoración;
    }
    public String getNombre(){
        return this.nombre;
    }
    public Punto getPosición(){
        return this.posición;
    }
    public int getValoración(){
        return this.valoración;
    }
    public double distancia(Punto p){
        return this.posición.distancia(p);
    }
    public static Restaurante[] leeRestaurantes(String nombreFichero){
        try {
            Scanner fichero = new Scanner(new File(nombreFichero));
            int longitud;
            longitud=fichero.hasNext()?fichero.nextInt():0;
            while(fichero.hasNext()){

            }
        }
        catch(FileNotFoundException e){
            System.out.println("Fichero no encontrado");
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
}


 */
