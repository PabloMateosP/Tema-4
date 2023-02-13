package Arrays.TareaOpcional;

import java.util.Arrays;

public class arrayAleatorio {
    public static void main(String[] args) {
        String [] a = {"Adri", "Juanma Herrera", "Dani", "David", "Juan Manuel Saborido", "Juan María", "Victor", "Pepe", "Jonathan", "Juan Jesús", "Pablo", "Julián", "Diego", "Antonio", "Jorge", "Fran", "Jossie", "Ricardo" };
        aleatoriedad(a);
        System.out.println(Arrays.toString(a));

        int i = (int) (Math.random() * 18);
        System.out.println(a[i]);

        System.out.println(a.length);

        int pos = (int) (Math.random() * 18); ;
        String[] out = new String[a.length -1];
        System.arraycopy(a, 0, out, 0, pos); //Este array copia desde la posición cero hasta la 1
        System.arraycopy(a, pos +1, out, pos,a.length - pos -1);
        System.out.println(Arrays.toString(out));
    }

    static void aleatoriedad (String [] a){
        int i = (int) (Math.random() * 18);
        System.out.println(a[i]);
    }
    static int[] eliminarPersona(String [] in, int pos){
        int[] out = new int[in.length -1];
        System.arraycopy(in, 0, out, 0, pos); //Este array copia desde la posición cero hasta la 1
        System.arraycopy(in, pos +1, out, pos,in.length - pos -1); //Este segundo array copia las posiciones saltando la que queremos borrar
        return out;
    }
}
