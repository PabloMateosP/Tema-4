package Arrays.Practica;

import java.util.Arrays;

public class ImprimirArray {
    public static void main(String[] args) {
        int [] a = {2, 4, 6, 8, 10};
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        m(a);
    }
    static void m (int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
