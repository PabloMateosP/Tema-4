package Arrays.Ejemplos;

import java.util.Arrays;

public class EjemploMatriz3x3 {
    public static void main(String[] args) {
        String[][] matrix = {{"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}};
        m(matrix);
        System.out.println(" ");
        x(matrix);
    }
    static void m (String [][] a){
        a = new String[][]{{"a","b","c"}, {"d", "e", "f"}, {"g", "h", "i"} };
        for (int i = 0; i < a.length; i++){
            System.out.println(Arrays.toString(a[i]));
        }
        for (int i = 0; i < a.length; i++){
            for (int o = 0; o < a[i].length; o ++ ){
                System.out.print(" ");
                System.out.print(a[i][o]);
                System.out.print(", ");
            }
        }

    }
    static void x (String [][] a){
        a = new String[][]{{"a","b","c"}, {"d", "e", "f"}, {"g", "h", "i"}};
        int i = 0;
        int o = 0;
        while (i < a.length){
            o = 0;
            while (o < a[i].length){
                System.out.print(" ");
                System.out.print(a[i][o]);
                System.out.print(", ");
                o ++;
            }
            i++;
        }
    }
}
