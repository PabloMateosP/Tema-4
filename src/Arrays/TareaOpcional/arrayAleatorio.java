package Arrays.TareaOpcional;

public class arrayAleatorio {
    public static void main(String[] args) {
        String [] a = {"Adri", "Juanma Herrera", "Dani", "David", "Juan Manuel Saborido", "Juan María", "Victor", "Pepe", "Jonathan", "Juan Jesús", "Pablo", "Julián", "Diego", "Antonio", "Jorge", "Fran", "Jossie", "Ricardo" };
        aleatoriedad(a);
    }
    static void aleatoriedad (String [] a){
        int i = (int) (Math.random() * 18);
        System.out.println(a[i]);
    }
}
