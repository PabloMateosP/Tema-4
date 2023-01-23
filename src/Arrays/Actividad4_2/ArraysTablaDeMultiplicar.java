package Arrays.Actividad4_2;

import java.util.Arrays;

public class ArraysTablaDeMultiplicar {
    public static void main(String[] args) {
        int[][] t = new int[10][3];
        metodo(t);
    }
    static void metodo (int[][] t){
        t = new int[11][11];
        int j= 0;
        int i= 0;
        while (j <= 10){
            i = 0;
            while (i <= 10){
                t[i][j] = i * j;
                System.out.println( i + " x "+ j + " = "  + t[i][j]);
                //System.out.print(t[i][j]);
                //System.out.print(", ");
                i++;
            }j++;
            System.out.println(" ");
        }
    }
}