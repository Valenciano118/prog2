package Practica3.Ej2;

public class PruebasListaCadenasEnlaceSimple {
    public static void main(String[] args) {
        ListaCadenasEnlaceSimple lista1=new ListaCadenasEnlaceSimple();
        lista1.add("Prueba");
        lista1.add("Espero que esto funcione");
        System.out.print("Tamaño:");
        System.out.println(lista1.size());
        System.out.println();

        System.out.println(lista1);
        System.out.println();

        lista1.add(0,"primer string");
        System.out.println(lista1);
        System.out.println();

        System.out.println("Pruebas get() en posición 0,1 y 2 de la lista1");
        for(int i=0;i<3;i++){
            System.out.println(i+": "+lista1.get(i));
        }
        System.out.println();
        System.out.println("Probando IndexOf() con \"Prueba\", que debería devolver 1");
        System.out.println(lista1.indexOf("Prueba"));
        System.out.println();


        System.out.println("Añadiendo \"Prueba\" al final de la lista");
        lista1.add("Prueba");
        System.out.println(lista1);
        System.out.println();

        System.out.println("Probando lastIndexOf() con \"Prueba\", debería devolver 3, y no 1 como con IndexOf()");
        System.out.println(lista1.lastIndexOf("Prueba"));
        System.out.println();

        System.out.println("Probando remove(int i), eliminando último elemento \"Prueba\"");
        System.out.println("Antes; "+lista1.toString());
        System.out.println(lista1.remove(3));
        System.out.println("Despues: "+lista1.toString());
        System.out.println();

        System.out.println("Probando remove(String s) con \"Prueba\", debería eliminar el segundo elemento");
        System.out.println("Antes; "+lista1.toString());
        System.out.println(lista1.remove("Prueba"));
        System.out.println("Despues: "+lista1.toString());
        System.out.println();

        System.out.println("Probando set(int i, String s) haremos que el segundo elemento ahora valga \"Prueba\", cuando antes valía \"Espero que esto funcione\"");
        System.out.println("Antes; "+lista1.toString());
        System.out.println(lista1.set(1,"Prueba"));
        System.out.println("Despues: "+lista1.toString());
        System.out.println();

        System.out.println("Probando clear()");
        lista1.clear();
        System.out.println("Lista: "+lista1.toString());

        System.out.println("FIN");



    }
}
