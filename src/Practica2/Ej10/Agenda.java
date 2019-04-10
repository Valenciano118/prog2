package Practica2.Ej10;

import Practica2.Ej6.Fecha;

public class Agenda {
    private Tarea[] tareas;
    private int cantidadTareas;

    public Agenda(){
        this.tareas= new Tarea[10];
        this.cantidadTareas=0;
    }


    public void añadir(Tarea tarea){
        Tarea[] aux=new Tarea[tareas.length];
        if (tareas.length==cantidadTareas)
            aux= new Tarea[2*tareas.length];
        Tarea intercambio;
        for(int i=0;i<tareas.length;i++)
            aux[i]=tareas[i];
        aux[cantidadTareas++]=tarea;
        for(int i=0;i<cantidadTareas;i++){
            for (int j=0;j<cantidadTareas;j++){
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
        return cantidadTareas;
    }

    public Tarea[] consultar(Fecha fecha){
        Tarea[] v1;
        int contador=0;
        for(int i=0;i<cantidadTareas;i++){
            if(tareas[i].getFecha().equals(fecha))
                contador++;
        }
        v1= new Tarea[contador];
        for(int i=0;i<cantidadTareas;i++){
            int j=0;
            if (tareas[i].getFecha().equals(fecha))
                v1[j++]=tareas[i];
        }
        return v1;
    }
    public void borrarPasadas(Fecha fecha){
        int posiciónlimite=0;
        for (int i=0;i<cantidadTareas;i++){
            if (tareas[i].getFecha().compareTo(fecha)>0)
                posiciónlimite=i;
        }
        for (int i=0; i<posiciónlimite+1;i++){
            tareas[i]=null;
        }
        Tarea aux;
        int elementosBorrados=0;
        for(int i=0; i<cantidadTareas;i++){
            for(int j=0+i;j<cantidadTareas;j++){
                if(tareas[i]==null && tareas[j]!=null) {
                    aux = tareas[i];
                    tareas[i] = tareas[j];
                    tareas[j] = aux;
                }
            }
            elementosBorrados++;
        }
        cantidadTareas-=posiciónlimite+1;
    }
    public void borrar(){
        borrarPasadas(Fecha.Hoy());
    }
    public String toString(){
        String print="";
        for(int i=0;i<cantidadTareas;i++)
            print+=tareas[i].toString()+"\n";
        return print;
    }
}
