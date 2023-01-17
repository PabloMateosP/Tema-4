package Arrays.Actividad4_1;

import javax.swing.event.DocumentEvent;

public class Main {
    public static void main(String[] args) {
        int x = 1;
        String s = "Pablo";
        Double a = 3.14;
        System.out.println(x + s + a);
        int retorno = m(x, s, a);
        System.out.println(retorno);
    }
    static int m (int x, String s, Double a){
        s = "Pablo Mateos Palas";
        System.out.println(s);
        a = 4.14;
        System.out.println(a);
        x = 1;
        x = x + 1;
        System.out.println(x);
        return x;
    }
}
