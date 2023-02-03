package Arrays.Ejemplos;

import java.util.Arrays;

public class EliminacionArray {
    public static void main(String[] args) {
        int [] in = {5, 46, 3, 9};
        int pos = 1;
        int[] print = eliminaArray(in, pos);
        System.out.println(Arrays.toString(print));

    }
    static int[] eliminaArray(int [] in, int pos){
        int[] out = new int[in.length -1];
        System.arraycopy(in, 0, out, 0, pos); //Este array copia desde la posición cero hasta la 1
        System.arraycopy(in, pos +1, out, pos,in.length - pos -1); //Este segundo array copia las posiciones saltando la que queremos borrar
        return out;
    }
}
