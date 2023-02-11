package Arrays.Practica.Actividad2;

public class Actividad2 {
    public static void main(String[] args) {
        String a = "Una vez había un barquito que navegaba por el mar";
        int i = 0;
        calcularPalabras(a, i);
    }
    static void calcularPalabras (String a, int i){
        i = 0;
        for (int b = 0; b < 10 ; b++){
            while (a == " "){
                i++;
            }
        }
        System.out.println("El número de palabras del texto es " + i);
    }
}
