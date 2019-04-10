package Practica2.Ej5;

import java.util.Calendar;

public class Fecha {
    private int día;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año){
        this.día=dia;
        this.mes=mes;
        this.año=año;
    }
    public Fecha(Fecha otraFecha){
        día=otraFecha.día;
        mes=otraFecha.mes;
        año=otraFecha.año;
    }
    public String toString(){
        return(día+"/"+mes+"/"+año+"/");
    }
    public boolean equals(Object otroObjeto){
        if (this == otroObjeto)
            return true;
        if (!(otroObjeto instanceof Fecha) )
            return false;
        Fecha otraFecha= (Fecha) otroObjeto;
        return día==otraFecha.día && mes==otraFecha.mes && año==otraFecha.año;
    }
    public int compareTo(Fecha otraFecha) {
        if (this.equals(otraFecha))
            return 0;
        if (((double) mes / 12 + (double) día / 365 + año) < ((double) otraFecha.mes / 12 + (double) otraFecha.día / 365 + año))
            return 1;
        else
            return -1;
    }
    public int getDía(){
        return día;
    }
    public int getMes(){
        return mes;
    }
    public int getAño(){
        return año;
    }
    public static boolean añoBisiesto(int año){
        if ((float)año%4==0 && ((float)año%100!=0 || (float)año%400==0) )
            return true;
        else
            return false;
    }
    public static int diasMes(int mes, int año){
        if (mes==2 && añoBisiesto(año))
            return 29;
        if (mes==2 && !añoBisiesto(año))
            return 28;
        if (mes==4 || mes==6 || mes==9 || mes==11)
            return 30;
        return 31;
    }
    public static Fecha Hoy(){
        Calendar calendario= Calendar.getInstance();
        int dia=calendario.get(Calendar.DAY_OF_MONTH);
        int mes=calendario.get(Calendar.MONTH)+1;
        int año=calendario.get(Calendar.YEAR);
        return new Fecha(dia,mes,año);
    }
    public Fecha díaSiguiente(){
        /*if (mes<12){
            if (dia<diasMes(mes,año))
                return new Fecha(dia+1,mes,año);
            if (dia==diasMes(mes,año))
                return new Fecha(1,mes+1,año);
        }
        if (mes==12){
            if */
         if (día==diasMes(mes,año)){
             if (mes<12)
                 return new Fecha(1,mes+1,año);
             return new Fecha(1,1,año+1);
        }
         return new Fecha(día+1,mes,año);
    }


}
