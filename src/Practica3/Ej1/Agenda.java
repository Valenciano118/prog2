package Practica3.Ej1;

import Practica2.EJ9.Tarea;
import Practica2.Ej6.Fecha;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Agenda {
    private List<Tarea> tareas;;

    public Agenda(){
        this.tareas= new LinkedList<Tarea>() {
        };
    }

    public void añadir(Tarea tarea){
        if (tareas.size()==0)
            tareas.add(tarea);
        else {
            for (int i = 0; i < tareas.size(); i++) {
                if (tareas.get(i).getFecha().compareTo(tarea.getFecha()) > 0)
                    tareas.add(i, tarea);
            }
        }




      /*  Tarea[] aux= new Tarea[tareas.length+1];
        Tarea intercambio=tarea;
        for(int i=0;i<tareas.length;i++)
            aux[i]=tareas[i];
        aux[tareas.length]=tarea;
        for(int i=0;i<aux.length;i++){
            for (int j=0;j<aux.length;j++){
                if(aux[i].getFecha().compareTo(aux[j].getFecha())>0) {
                    intercambio = aux[i];
                    aux[i] = aux[j];
                    aux[j] = intercambio;
                }
            }
        }
        tareas=aux;

       */
    }

    public int cantidad(){
        return tareas.size();
    }

    public Tarea[] consultar(Fecha fecha){
        LinkedList<Tarea> v1=new LinkedList<>();
        for (int i=0;i<tareas.size();i++){
            if (tareas.get(i).getFecha().equals(fecha))
                v1.add(tareas.get(i));
        }
        return v1.toArray(new Tarea[0]);
     /*   Tarea[] v1;
        int contador=0;
        for(int i=0;i<tareas.length;i++){
            if(tareas[i].getFecha().equals(fecha))
                contador++;
        }
        v1= new Tarea[contador];
        for(int i=0;i<tareas.length;i++){
            int j=0;
            if (tareas[i].getFecha().equals(fecha))
                v1[j++]=tareas[i];
        }
        return v1;

      */
    }
    public void borrarPasadas(Fecha fecha){
    for(int i=0;i<tareas.size();i++){
        if (tareas.get(i).getFecha().compareTo(fecha)>0)
            tareas.remove(i);
    }

       /* int posiciónlimite=0;
        for (int i=0;i<tareas.length;i++){
            if (tareas[i].getFecha().compareTo(fecha)>0)
                posiciónlimite=i;
        }
        Tarea[] v1= new Tarea[tareas.length-posiciónlimite-1];
        for (int i=0; i<v1.length;i++){
            v1[i]=tareas[i+posiciónlimite+1];
        }
        tareas=v1;

        */
    }
    public void borrar(){
        borrarPasadas(Fecha.Hoy());
    }
    public String toString(){
        String print="";
        for(int i=0;i<tareas.size();i++)
            print+=tareas.get(i).toString()+"\n";
        return print;
    }
}
