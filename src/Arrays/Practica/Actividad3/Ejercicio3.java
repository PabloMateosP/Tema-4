package Arrays.Practica.Actividad3;

import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        int mayor = numeros[0];
        int suma = 0;
        int numeroAnt = numeros[12];
        int numeroNue = numeros[13];
         numeroAleatorio(numeros);
        numeroMayor( mayor, numeros);
        int sumados = numeroSuma(suma, numeros);
        double media = (double) sumados/numeros.length;
        System.out.println(media);

        System.out.println(Arrays.toString(numeros));
        numeroSustituir(numeros, numeroAnt, numeroNue);

    }
    static void numeroAleatorio (int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100);
        }
    }
    static int numeroMayor (int mayor, int[] numeros){
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        System.out.println("El número mayor del array es: " + mayor);
        return mayor;
    }
    static int numeroSuma (int suma, int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.println("La suma de todos los números del array es: " + suma);
        return suma;
    }
    static void numeroSustituir (int[] numeros, int numeroAnt, int numeroNue){
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroAnt) {
                numeros[i] = numeroNue;
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println(Arrays.toString(numeros));
    }
}
