package Practica3.Ej1;
import java.util.Arrays;

import Practica2.EJ9.Agenda;
import Practica2.EJ9.Tarea;
import Practica2.Ej6.Fecha;

public class AgendaPruebas {


    public static void main(String[] args)
            /*throws ExcepcionFechaInvalida */{

        Fecha fecha = new Fecha(15, 4, 2018);
        Fecha fecha2 = new Fecha(13, 4, 2018);
        Fecha fecha3 = new Fecha(16, 4, 2018);
        Tarea tarea = new Tarea(fecha, "Examen Mates");
        Tarea tarea2 = new Tarea(fecha2, "Examen Fisica ");
        Tarea tarea3 = new Tarea(fecha3, "Examen Programació ");

        Practica2.EJ9.Agenda agenda = new Agenda();

        agenda.añadir(tarea);
        agenda.añadir(tarea2);
        agenda.añadir(tarea3);

        System.out.println(agenda.toString());
        System.out.println("Consulta dia 13/4/2018");
        System.out.println(Arrays.toString(agenda.consultar(new Fecha(13, 4, 2018))));
        System.out.println("Borrar fechas pasadas: 14/04/2018");
        agenda.borrarPasadas(new Fecha(14, 4, 2018));
        System.out.println(agenda.toString());
        System.out.println("Borrar pasadas de hoy");
        agenda.borrar();
        System.out.println(agenda.toString());

    }

}
