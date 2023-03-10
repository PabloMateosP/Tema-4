package Arrays.Ejemplos;

import java.util.Arrays;

public class ArrayBusqueda {
        public static void main(String[] args) {
            int[] a = {1, 4, 3, 7, 10, 8};
            System.out.println("La búsqueda manual: " + buscar(a,7));
            System.out.println("La búsqueda binarySearch: " + Arrays.binarySearch(a,7));
            Arrays.sort(a);
        }
        private static int buscar(int[] a, int x) {
            for (int i = 0; i < a.length; i++) {
                if (x == a[i]) {
                    return i;
                }
            }
            return -1;
        }

}
