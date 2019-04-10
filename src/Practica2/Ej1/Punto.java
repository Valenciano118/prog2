package Practica2.Ej1;

public class Punto {
    private double x;
    private double y;

    public Punto(double x,double y){
        this.x=x;
        this.y=y;
    }
    public Punto(){
        this.x=0;
        this.y=0;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public Punto desplazar(double desplazamientoX, double desplazamientoY){
        return new Punto(this.x+desplazamientoX,this.y+desplazamientoY);
    }
    public double distancia(Punto otroPunto){
        return (Math.sqrt(Math.pow(this.x+otroPunto.x,2)+Math.pow(this.y+otroPunto.y,2)));
    }
    public String toString(){
        return "("+this.x+", "+this.y+")";
    }
    public boolean equals(Object otroObjeto){
        if (this==otroObjeto)
            return true;
        if(!(otroObjeto instanceof Punto))
            return false;
        Punto otroPunto=(Punto) otroObjeto;
        return (this.x==otroPunto.x && this.y==otroPunto.y);
    }

    public static void main(String[] args) {
        Punto p=new Punto(),q=new Punto(1,3),t=new Punto(3,4),r=new Punto(0,0),s;
        System.out.println(p);
        System.out.println(q);
        System.out.println(p.equals(r));
        System.out.println(p.equals(q));
        System.out.println(q.equals("test"));
        System.out.println(t.getX());
        System.out.println(t.getY());
        s=r.desplazar(10,20);
        System.out.println(r);
        System.out.println(s);
        System.out.println(p.distancia(s));
    }

}