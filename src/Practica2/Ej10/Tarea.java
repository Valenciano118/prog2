package Practica2.Ej10;

import Practica2.Ej6.Fecha;

public class Tarea {
    private Fecha fecha;
    private String descripción;

    public Tarea(Fecha fecha,String descripción){
        this.fecha=fecha;
        this.descripción=descripción;
    }
    public Fecha getFecha(){
        return fecha;
    }
    public String getDescripción(){
        return descripción;
    }
    public String toString(){
        return fecha.getDía()+"/"+fecha.getMes()+"/"+fecha.getAño()+": "+descripción;
    }

}
