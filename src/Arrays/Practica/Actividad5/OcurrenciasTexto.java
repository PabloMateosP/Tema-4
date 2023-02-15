package Arrays.Practica.Actividad5;

public class OcurrenciasTexto {
    public static void main(String[] args) {
        String texto = "habia un barquito velero que navegaba por el mediterraneo en un día muy movido hasta que se acerco a una isla donde habia gente";
        String palabraBuscada = "habia";
        System.out.println("Este es el texto: " + " '" + texto + "' " + " donde vamos a buscar cuantas veces aparece la palabra: " + palabraBuscada);
        int ocurrencias = contarOcurrencias(texto, palabraBuscada);
        System.out.println("La palabra '" + palabraBuscada + "' aparece " + ocurrencias + " veces en el texto");
    }
    public static int contarOcurrencias(String texto, String palabraBuscada) {
        int ocurrencias = 0;
        int indice = 0;
        while (indice != -1) {
            //Mediante la función indexOf controlamos si nuestra palabra aparece o no, (nos buscará la palabra que pongamos y empezará en el índice que le pongamos)
            //Es decir con el bucle de el índice le decimos que vaya aumentando hasta encontrar la palabra
            //Donde en el caso que nuestra palabra aparezca seguirá recorriendo el bucle y así sumando en nuestra variable ocurrencia
            //Mientras que si no aparece nuestro método nos dará menos uno y la palabra no estará en el texto
            indice = texto.indexOf(palabraBuscada, indice);
            if (indice != -1) {
                ocurrencias++;
                indice += palabraBuscada.length();
            }
        }
        return ocurrencias;
    }
}
