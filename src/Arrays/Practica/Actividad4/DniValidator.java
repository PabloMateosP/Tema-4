package Arrays.Practica.Actividad4;

public class DniValidator {
    public static void main(String[] args) {

        System.out.print("Ingrese su DNI: ");
        String dni = "20605192K";
        System.out.println(" ");

        if (dni.length() != 9) {
            System.out.println("DNI es inválido (debe tener 9 caracteres).");
            return;
        }

        String numerosDni = dni.substring(0, 8); //El método substring nos da una subcadena de Dni en este caso con un inicio 0 y un fin 8 es decir 9 números como el DNI
        // Me informe para encontrar el método ya que con arrays no sabia hacerlo
        char letraDni = dni.charAt(8);

        int numeros = Integer.parseInt(numerosDni); //Mediante el método parseInt convertimos la cadena de 9 caractéres en un entero
        char letraCorrecta = getLetraDni(numeros);

        if (letraCorrecta != letraDni) {
            System.out.println("El DNI es inválido (letra incorrecta).");
            return;
        }
        System.out.println("DNI válido.");
    }
    private static char getLetraDni(int numeros) { //Mediante el método getLetraDni conseguimos cual es la letra de el DNI
        String abecedario = "TRWAGMYFPDXBNJZSQVHLCKE";
        int let = numeros % 23;
        return abecedario.charAt(let);
    }
}
