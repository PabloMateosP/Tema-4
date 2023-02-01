package Arrays.Practica;

public class StringExample {
    public static void main(String[] args) {
        // Parse cambia esa cadena a ese tipo ejemplo parseInt cambia la cadena "1" a int
        int n = Integer.parseInt("1");
        System.out.println(n + 1);
        boolean b = Boolean.parseBoolean("true");
        System.out.println(b);
        Long.parseLong("23423563");
        Double.parseDouble("2.2");
        Float.parseFloat("");

        // Con el valueOf metemos un tipo primitivo en un tipo envoltorio.
        Integer integer = Integer.valueOf(1);
        Double doble = Double.valueOf("1.222222");

        integer.toString();

        int num1 = 1;

        // TODO Número entero envoltorio de nombre num2 y valor 2

        Integer num2 = Integer.valueOf(2);

        // TODO: Imprimir el valor de cadena de num1

        System.out.println(num1 + "");
        System.out.println(String.valueOf(num1));

        //TODO: Imprimir valor de cadena de num2

        System.out.println(Integer.toString(num2));
        System.out.println(num2); // Invoca el toString de intellij
        System.out.println(String.valueOf(num2));
        System.out.println(num2 + "");
        System.out.println(String.valueOf(num2));
        // esto es lo mismo que el primero System.out.println(Integer.toString(num2));

    }
}
