package Arrays.Practica;
public class RecorrerArray {
    public static void main(String[] args){
    int[] a = {7, -2, 5, 0, 6};
    int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
    System.out.println(m(a, b));
    System.out.println(m(a));
    System.out.println(m(b));
    System.out.println(m(a) + m(b));
    }
    static int m (int[] a ,int[] b){
        int resultado = 0;
        for (int i = 0; i < a.length; i++){
            resultado += a[i];
        }
        for (int i = 0; i < b.length; i++){
            resultado += b[i];
        }
        return resultado;
    }

    static int m (int[] a ){
        int resultado = 0;
        for (int i = 0; i < a.length; i++){
            resultado += a[i];
        }
        return resultado;
    }

    /*static void m (int[] a){
        a = new int[]{7, -2, 5, 0, 6};
        System.out.println(a[0] + a[1] + a[2] + a[3] + a[4] );
    }*/
}
