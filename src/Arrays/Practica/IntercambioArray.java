package Arrays.Practica;

import java.util.Arrays;

public class IntercambioArray {
    public static void main(String[] args) {
        int [] a = {7, -2, 5, 0, 6};

        int pos = 5;

        int[] print = intercambiarArray(a, pos);

        System.out.println(Arrays.toString(print));

        int[] print2 = intercambiarArray2(a, pos);

        System.out.println(Arrays.toString(print2));

    }
    static int[] intercambiarArray(int [] a, int pos){
        a = new int[]{7, -2, 5, 0, 6};

        int[] out = new int[a.length];

        System.arraycopy(a, 0, out, 0, pos);

        int aux;

        for (int i = 0; i < a.length - 1; i++) {
            aux = a[i];
            a[i] = a[i+1];
            a[i+1] = aux;
        }

        System.arraycopy(a, 0, out, 0 ,a.length);

        return out;
    }

    static int[] intercambiarArray2(int [] a, int pos){
        a = new int[]{7, -2, 5, 0, 6};

        int[] out = new int[a.length];

        System.arraycopy(a, 0, out, 0, pos);
        int aux = a[a.length-1];
        for (int i = a.length -1; i >= 0; i++) {

            a[i] = a[i-1];
            a[i-1] = aux;
        }

        System.arraycopy(a, 0, out, 0 ,a.length);

        return out;
    }
}
