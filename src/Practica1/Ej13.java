package Practica1;

public class Ej13 {
    public static void main(String[] args) {
        prueba("Esto es una frase de prueba ",3,"una");
        prueba("Esto es otra frase de prueba para este ejercicio",20,null);
        prueba("Esto es otra frase de prueba para este ejercicio",5,"de");
        prueba("   Esta frase tiene espacios al principio para ver si pilla al programa ",1,"Esta");
    }

    private static void prueba(String s1,int posición,String palabraEsperada){
        if ( obtenerPalabra(s1,posición)==null ||palabraEsperada.equals(obtenerPalabra(s1,posición))) /*Primero comprobamos que sea null para aprovecharnos de los "cortocircuitos",
            y así que no ejecute el equals con un null y produzca una excepción*/
            System.out.format("La palabra de \"%s\" en la posición %d es \"%s\", que es la esperada",s1,posición,obtenerPalabra(s1,posición));
        else
            System.out.format("La palabra de \"%s\" en la posición %d es \"%s\", que no es la esperada",s1,posición,obtenerPalabra(s1,posición));
        System.out.println();
    }

    private static String obtenerPalabra(String s1, int posición){
        if (posición<0 || posición>contarPalabras(s1))
            return null;
        char anterior=' ';
        String palabraDeseada="";
        int palabraActual=0;
        for (int i=0;i<s1.length();i++){
            if (s1.charAt(i)!=' ' && anterior==' ' )
                palabraActual++;
            anterior=s1.charAt(i);
            if (palabraActual==posición && s1.charAt(i)!=' ')
                palabraDeseada+=s1.charAt(i);
        }
        return palabraDeseada;

    }
    private static int contarPalabras(String s1){
        char anterior=' ';
        int contador=0;
        for (int i=0;i<s1.length();i++){
            if (s1.charAt(i)!=' ' && anterior==' ' )
                contador++;
            anterior=s1.charAt(i);
        }
        return contador;
    }
}
