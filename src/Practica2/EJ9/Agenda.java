package Practica2.EJ9;

import Practica2.Ej6.Fecha;

public class Agenda {
    private Tarea[] tareas;

    public Agenda(){
        this.tareas= new Tarea[0];
    }
    public void añadir(Tarea tarea){
        Tarea[] aux= new Tarea[tareas.length+1];
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
    }

    public int cantidad(){
        return tareas.length;
    }

    public Tarea[] consultar(Fecha fecha){
        Tarea[] v1;
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
    }
    public void borrarPasadas(Fecha fecha){
        int posiciónlimite=0;
        for (int i=0;i<tareas.length;i++){
            if (tareas[i].getFecha().compareTo(fecha)>0)
                posiciónlimite=i;
        }
        Tarea[] v1= new Tarea[tareas.length-posiciónlimite-1];
        for (int i=0; i<v1.length;i++){
            v1[i]=tareas[i+posiciónlimite+1];
        }
        tareas=v1;
    }
    public void borrar(){
        borrarPasadas(Fecha.hoy());
    }
    public String toString(){
        String print="";
        for(int i=0;i<tareas.length;i++)
            print+=tareas[i].toString()+"\n";

        return print;
    }
}
