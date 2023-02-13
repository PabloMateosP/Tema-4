package Arrays.Practica.Actividad5;

public class OcurrenciasTexto {
    public static void main(String[] args) {
        System.out.println("Introduce el texto: ");
        String texto = "habia un barquito velero que navegaba por el mediterraneo en un día muy movido hasta que se acerco a una isla donde habia gente";
        System.out.println("Introduce la palabra a buscar: ");
        String palabra = "habia";

        int ocurrencias = contarOcurrencias(texto, palabra);
        System.out.println("La palabra '" + palabra + "' aparece " + ocurrencias + " veces en el texto");
    }
    public static int contarOcurrencias(String texto, String palabra) {
        int ocurrencias = 0;
        int ind = 0;
        while (ind != -1) {
            //Mediante la función indexOf controlamos si nuestra palabra aparece o no,
            //Donde en el caso que nuestra palabra aparezca seguirá recorriendo el bucle y así sumando en nuestra variable ocurrencia
            //Mientras que si no aparece nuestro método nos dará menos uno y la palabra no estará en el texto
            ind = texto.indexOf(palabra, ind);
            if (ind != -1) {
                ocurrencias++;
                ind += palabra.length();
            }
        }
        return ocurrencias;
    }
}
