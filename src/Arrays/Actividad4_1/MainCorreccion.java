package Arrays.Actividad4_1;

public class MainCorreccion {
    public static void main(String[] args) {
        int x = 1;
        String s = ".....";
        Double [] a = {1d, 2.5d, 34.56d, null, 0d};
        System.out.println(x);
        m(x);
        System.out.println(x);
        m(x, s, a);
        System.out.println(a);
        m(s, x, a);
        System.out.println(s + x + a);
    }

    static void m (int x){
        x = x + 1;
    }
    static void m (String s, int x, Double[] a){
        s = s.toUpperCase();
        x = 1;
    }
    static void m (int x, String s, Double[] a){
        a[0] ++ ;
        a[a.length - 1] ++; // Coge la última posición. Se usa el a.length para la longitud ya que no se suele usar números como el 4, 5, 10, 30 en programción sino que se debe de encontrar de otra forma.
        a[(a.length- 1)/2] ++;

    }
    static int[][] f (int x, String s,  Double[] p){
        int n = p.length;
        int m = 2;
        int[][] resultado = new int[n][m]; //Diciendole donde la vertical es la m y la horizontal es la n.

        return resultado;
    }
}
