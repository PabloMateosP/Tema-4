package Arrays.Actividad4_6;

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

        char b = 'h';
        contarOcurrenciasDeUnCaracter(a, b);

        char [] abecedario = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'm', 'n', 'o', 'p', 'k', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        char [] c = {'a', 'l', 't', 'o'};
        char [] d = {'b', 'a', 'j', 'o'};
        char [] f = {'c', 'o', 'r', 't', 'o'};

        //imprimirCadenaEnOrdenAlfabético(c,d,f,abecedario);

        String A = "Hola a todo el mundo como estamos";
        cambioCaracteres(A);

        int[] numbers = {2,1,11,10};
        String [] conversion;
        conversion = conversioonString(numbers);
        System.out.println(Arrays.toString(conversion));
        // Al imprimir parece que no se ordena, aunque en vd se hace un aordenación pero por las referencias de cada elemento
    }
    static void imprimirLongitud(char [] a){

        System.out.println("El total de la cadena" + a + " es " + a.length);

    }
    static void imprimirCaracterEnPosición(char [] a, int pos){

            System.out.println("El caracter " + pos + " de la cadena es " + a[pos]);

    }
    static void contarOcurrenciasDeUnCaracter(char [] a, char b){
        int contador = 0;
        for (int  i = 0; i < a.length; i++) {
            if (a[i] == b) {
                contador ++;
            }
        }   System.out.println("La letra " + b + " aparece " + contador);

    } // Si tenemos una cadena ejemplo: alcohol y le digo la o me tiene que decir que hay dos o

    //static void imprimirCadenaEnOrdenAlfabético(char [] a, char [] b, char [] c, char [] x){
        //for (int i = 0; i < x.length; i ++){
            //if (a[1] == x[i] || b[1] != x[i] || c[1] != x[i]){
                //if (b[1] == x[i+1] || c[1] != x[i+1]){
                    //System.out.println(a + " " + b + " " + c);
                //}
            //}
        //}
    //}

    //TODO: imprimirCadenaEnOrdenAlfabético imprimir en orden alfabético las cadenas dadas por un array de cadenas
    // - ejemplo m({"corto", "bajo", "alto"}) --> alto, bajo, corto. Pero sin tener en cuenta las mayúsculas y las minúsculas.



    // TODO: un método que dado un pequeño texto devuelva un array de cadenas codificando el texto, de modo que cada vez que aparezca el caracter punto (.) se corte esa frase y se meta en una posición del array y que todas las vocales se sustituyen por el número gratificánte más parecido por ejemplo o --> 0 ...
    public static void cambioCaracteres(String cadena){

        char [] cadenaCaracteres = cadena.toCharArray();

        System.out.println("Antes de la codificación:");
        System.out.println(cadena);
        System.out.println(" ");
        System.out.println("Tras la codificación:");


        for (int i = 0; i < cadenaCaracteres.length; i++) {
            if (cadenaCaracteres[i] == 'a'){
                cadenaCaracteres[i] = '4';

            }if (cadenaCaracteres[i] == 'e'){
                cadenaCaracteres[i] = '3';

            }if (cadenaCaracteres[i] == 'i'){
                cadenaCaracteres[i] = '1';

            }if (cadenaCaracteres[i] == 'o'){
                cadenaCaracteres[i] = '0';

            }if (cadenaCaracteres[i] == 'u'){
                cadenaCaracteres[i] = 'v';
            }
        }
        System.out.println(Arrays.toString(cadenaCaracteres));
    } // Copia código jorge ya que no sabía otra forma de hacerlo

    //TODO Convertir los siguientes números a String y posteriormente ordenarlos alfabéticamente de menor a mayor
    static String [] conversioonString(int [] numbers){
        String [] conversion = new String[numbers.length];
        // Conversión
        for (int i = 0; i < numbers.length; i++){
            conversion[i] = String.valueOf(numbers[i]);
        }
        // Ordenación
        Arrays.sort(conversion);

        return conversion;
    }


}
