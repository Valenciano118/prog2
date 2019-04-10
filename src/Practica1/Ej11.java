package Practica1;

public class Ej11 {
    public static void main(String[] args) {
        prueba("Hola","ola",true);
        prueba("Hola","",true);
        prueba("","ola",false);
        prueba("ola","a",true);
        prueba("Hola","Hola",true);
    }
    private static boolean esSufijo(String s1,String s2){
        if (s2.length()>s1.length())
                return false;
        String aux="";
        for (int i=s1.length()-s2.length();i<s1.length();i++){
            aux+=s1.charAt(i);
        }
        for (int i=0;i<s2.length();i++){
            if (aux.charAt(i)!=s2.charAt(i))
                    return false;
        }
        return true;
    }
    private static void prueba(String s1,String s2,boolean esperado){
        boolean resultado=esSufijo(s1,s2);
        System.out.format("Prueba con %s y %s:",s1,s2);
        if (resultado==esperado)
            System.out.println("bien");
        else
            System.out.println("error");
    }
}
