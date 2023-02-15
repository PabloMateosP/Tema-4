package Arrays.Actividad4_5;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        System.out.println("Primera parte: ");
        int[] numero = arrayAleatorio(10);
        System.out.println(Arrays.toString(numero) + "\n");
        System.out.println("Segunda parte : ");
        arrayInverso(numero);
        System.out.println();
        System.out.println("Tercera parte : ");
        int[] arrayOrdenado = ordenarArray(numero);
        System.out.println(Arrays.toString(arrayOrdenado) + "\n");
        System.out.println("Cuarta parte : ");
        System.out.println("Mediante una busqueda manual : " + buscarArray(arrayOrdenado, 55));
        System.out.println("Mediante una búsqueda binarySearch : " + Arrays.binarySearch(arrayOrdenado,55) + "\n");
        System.out.println("Quinta parte : ");
        System.out.println("Los arrays son iguales: " + Arrays.equals(numero, arrayOrdenado) + "\n");
        System.out.println("Sexta parte : ");
        System.out.println("Copia :");
        int[] array2 = numero.clone();
        System.out.println(Arrays.toString(numero));
        System.out.println(Arrays.toString(array2) + "\n");
        System.out.println("Copia fuera:");
        int[] array3 = Arrays.copyOf(numero, 4);
        System.out.println(Arrays.toString(array3) + "\n");
        System.out.println("Copia del rango :");
        int[] array4 = Arrays.copyOfRange(numero, 4, 8);
        System.out.println(Arrays.toString(array4) + "\n");
        // int[] in = {7, 1, 5, 2};
        int pos = 2;
        int e = 8;
        int [] y = arrayAleatorio(2);
        System.out.println(Arrays.toString(insertado(numero, pos, e)));
        System.out.println(" ");
        System.out.println(Arrays.toString(insertado2(numero, pos, y)));
        System.out.println(" ");
        System.out.println("Metodo eliminando parte del código: ");
        boolean a = true;
        System.out.println(Arrays.toString(eliminado(numero, pos, a)));
    }
    private static int[] arrayAleatorio(int numero) {
        int[] a = new int[numero];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        return a;
    } // Este método nos cumple la tarea de hacernos un Array de una serie de números aleatorios
    private static void arrayInverso(int[] numero) {
        for (int i = numero.length - 1; i >= 0; i--) {
            System.out.print(numero[i] + " ");
        }
        System.out.println();
    }   // Este método nos coge el array creado y nos lo invierte en sentido cambiando el primero por el último ...
    private static int[] ordenarArray(int[] numero) {
        Arrays.sort(numero);
        return numero;
    } // Con este método ordenamos el array de menor a mayor con el metodo sort
    private static int buscarArray(int[] input, int x) {
        for (int i = 0; i < input.length; i++) {
            if (x == input[i]) {
                return  i;
            }
        }
        return -1;
    } // En este método de la cuarta parte hacemos una busqueda manual en el array
    public static int[] insertado(int[]in, int pos, int e){
        int[] out = Arrays.copyOf(in, in.length + 1);
        System.out.println("Antes de añadir un nuevo elemento: ");
        System.out.println(Arrays.toString(out));
        for (int i = out.length - 1; i > pos; i--) {
            out[i] = out[i - 1];
        }
        out[pos] = e;
        System.out.println("Después de añadir el elemento: ");
        return out;
    } // Este método nos inserta un valor añadido dentro de un array anteriormente creado.
    public static int[] insertado2(int[]in, int pos, int[] e){
        int[] out = new int[in.length + 2];
        out = Arrays.copyOf(in, in.length + 1);
        System.out.println("Antes de añadir un nuevo array: ");
        System.out.println(Arrays.toString(out));
        for (int i = out.length - 1; i > pos; i--) {
            out[i] = out[i - 1];
        }
        int y = e.length - 1;
        out[pos] = e[y];
        System.out.println("Después de añadir el array: ");
        return out;
    } // Este método nos inserta un array añadido dentro de un array anteriormente creado.
    // En mi caso no consigo añadir completamente el array nuevo
    public static int[] eliminado (int[] in, int pos, boolean a){
        int[] out = new int[in.length -1];
        if (a = true) {
            System.arraycopy(in, pos + 1, out, pos, in.length - pos - 1);
        } else if (a = false) {
            System.arraycopy(in,pos +1, out, pos, in.length);
        }
        return in;
    } // Este método elimina el número que se encuentre en la tercera posición de nuestro array
    public static int[] paresPorImpares (int[] a){
        int[] out = new int[a.length];

        return out;
    }
}
