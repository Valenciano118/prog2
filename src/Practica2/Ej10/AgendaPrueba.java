package Practica2.Ej10;
import Practica2.Ej6.Fecha;

public class AgendaPrueba {
    public static void main(String[] args) {
        System.out.println("Pruebas para la clase Agenda y clase Tarea.");
        System.out.println();
        System.out.println("PROBANDO LA CLASE Tarea:");
        System.out.println();
        ///////////////////////////////Tarea///////////////////////////////////////
        Fecha f1= new Fecha(1,1,2019);
        Tarea t1= new Tarea(f1,"Prepararse para examenes de enero");
        //Getters Tarea
        if (t1.getFecha().equals(new Fecha(f1)))
            System.out.println("La fecha de t1 es correcta 01/01/2019  (BIEN)");
        else
            System.out.println("La fecha de t1 es incorrecta "+t1.getFecha()+ " (MAL)");

        if(t1.getDescripción().equals("Prepararse para examenes de enero"))
            System.out.println("La descripción de t1 es correcta \"Prepararse para examenes de enero\" (BIEN)");
        else
            System.out.println("La descripción de t1 es incorrecta " +t1.getDescripción()+" (MAL)");

        //String toString
        System.out.println();
        System.out.println("Pobando el método String toString:");
        if (t1.toString().equals("1/1/2019: Prepararse para examenes de enero"))
            System.out.println("El método String toString es correcto \"1/1/2019: Prepararse para examenes de enero\" (BIEN)");
        else
            System.out.println("EL método String toString es incorrecto " +t1+" (MAL)");
        System.out.println();



        ////////////////////////////////Agenda/////////////////////////////////////




    }

}
