package Arrays.Ejemplos;

import java.util.Arrays;

public class InsercionArray {
    public static void main(String[] args) {
        int e = 8;
        int[] in = {7,1,5,2};
        int pos = 3;
        inserta(in, e, pos);
    }
    static int [] inserta(int [] in , int e, int pos) {
        in = new int[]{7, 1, 5, 2};
        e = 8;
        pos = 3;
        int[] out = new int[in.length + 1];
        for (int i = 1; i < in.length; i++) {
            out = Arrays.copyOf(in, 5);
            if (in[i] == pos) {
                in[pos] = e;
                out = new int[in[pos]];
            }
        }
        return out;
    }
}
