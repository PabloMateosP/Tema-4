package Arrays.Practica.Actividad5;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class CorreccionClase {
    public static void main(String[] args) {
        String texto = "Escribe el código de un programa que dado el contenido de un texto y una determinada palabra, realice búsquedas de la palabra dentro de él. La secuencia de ejecución será: crear un texto, crear una palabra, invocar al método con estos parámetros, buscar número de ocurrencias de la palabra en texto, obtener la salida del método y mostrar por pantalla el número de apariciones de la palabra.";
        String palabra = "el";
        int numero = busquedaNumero (texto, palabra);
        System.out.println("La palabra aparece: " + numero);
    }
    private static int busquedaNumero (String texto, String palabra){
        int count  = 0;
        String [] ejer = texto.split(" |, |;|\\,");
        for (int i = 0; i < ejer.length; i++){
            if (ejer[i].equalsIgnoreCase(palabra)) {
                count++;
            }
        }
        return count;
    }
}
