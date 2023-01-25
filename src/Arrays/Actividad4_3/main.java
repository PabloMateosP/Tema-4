package Arrays.Actividad4_3;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int [] numeros = {7,4,5,2,1,10,8,3,6,9};
        int a = 1;
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        for (int numero:numeros) {
            System.out.print(" "+ numero);
        }
        System.out.println(" ");
        numeroBuscado(numeros, a);
        System.out.print(numeroBuscado(numeros, a));
        System.out.println(" ");
        if (numeroBuscado(numeros,a)){
            System.out.println("El número " + a + " está en la lista");
        } else {
            System.out.println("El número " + a + " NO está en la lista");
        }
    }
    static boolean numeroBuscado(int[] numeros, int a) {
        numeros = new int[]{7, 4, 5, 2, 1, 10, 8, 3, 6, 9};
        a = 1;
        return Arrays.asList(numeros)
                .contains(a);
                //Esta es la única forma que encontré para hacer este método.
    }
    // De manera manual no supe hacer el método
    // A partir del punto 5 no sé como seguir
}
