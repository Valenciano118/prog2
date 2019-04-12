package Practica3.Ej2;

public class PruebasListaCadenasEnlaceSimple {
    public static void main(String[] args) {
        ListaCadenasEnlaceSImple lista1=new ListaCadenasEnlaceSImple(0,null);
        lista1.add("Prueba");
        lista1.add("Espero que esto funcione");
        System.out.print("Tamaño:");
        System.out.println(lista1.size());
        System.out.println(lista1);

        lista1.add(0,"primer string");
        System.out.println(lista1);
        System.out.println("Esto es una cadena de prueba para saber como hacer el push de github");

    }
}
