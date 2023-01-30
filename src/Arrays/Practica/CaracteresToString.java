package Arrays.Practica;

import java.util.Arrays;

public class CaracteresToString {
    public static void main(String[] args) {
        char[] a = {'h', 'o', 'l', 'a'};

        int pos = 3;

        String s1 = new String(a);

        System.out.println(s1);

        String s2 = new String(new char[]{'h', 'o', 'l', 'a'});

        System.out.println(s2);

        imprimirLongitud(a);

        imprimirCaracterEnPosición(a, pos);

    }
    static void imprimirLongitud(char [] a){

        System.out.println("El total de la cadena" + a + " es " + a.length);

    }
    static void imprimirCaracterEnPosición(char [] a, int pos){
        System.out.println("El caracter " + pos + " de la cadena es " + a[pos]);
    }
    static void contarOcurrenciasDeUnCaracter(){
        System.out.println( );
    } // Si tenemos una cadena ejemplo: alcohol y le digo la o me tiene que decir que hay dos o
    // TODO: imprimirCadenaEnOrdenAlfabético imprimir en orden alfabético las cadenas dadas por un array de cadenas
    // ejmplo m({"corto", "bajo", "alto"}) --> alto, bajo, corto. Pero sin tener en cuenta las mayúsculas y las minúsculas.


    // TODO: un método que dado un pequeño texto devuelva un array de cadenas codificando el texto, de modo que cada vez que aparezca el caracter punto (.) se corte esa frase y se meta en una posición del array y que todas las vocales se sustituyen por el número gratificánte más parecido por ejemplo o --> 0 ...

}
