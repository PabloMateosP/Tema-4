package Arrays.Practica;

import java.util.Arrays;

public class ImprimirArray {
    public static void main(String[] args) {
        int [] a = {2, 4, 6, 8, 10};
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        m(a);
        x(a);
    }
    static void m (int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    static void x (int[] a){
        System.out.print("{"); //Debemos recordar que si ponemos el println nos saltaría de linea.
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1){
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }


}
