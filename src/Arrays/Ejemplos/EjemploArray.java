package Arrays.Ejemplos;

public class EjemploArray {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        System.out.println(a); // De esta forma imprimirá la referencia
        System.out.println(a[0]); // Siempre tenemos que recordar que empezamos desde el 0
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        System.out.println(a.length); // El punto length lo que hará será imprimir cuantoa números componene nuestro array, es decir, en nuestro caso 5.
    }
}
