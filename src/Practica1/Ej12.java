package Practica1;

public class Ej12 {
    public static void main(String[] args) {
        prueba("Esto es una prueba",4);
        prueba(" Esto   es una prueba ",4);
        prueba("Esto es otra prueba distinta    ",5);
        prueba("    Esto es una prueba    distinta a la anterior    ",8);

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
    private static void prueba(String s1,int palabrasEsperadas){
        if (contarPalabras(s1)==palabrasEsperadas)
            System.out.format("\"%s\" tiene %d palabras como se esperaba",s1,contarPalabras(s1));
        else
            System.out.format("\"%s\" tiene %d palabras, y se esperaban %d",s1,contarPalabras(s1),palabrasEsperadas);
        System.out.println();
    }
}
