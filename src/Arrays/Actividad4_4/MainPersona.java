package Arrays.Actividad4_4;

public class MainPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Pepe",20);
        Persona persona2 = new Persona("Julián",18);
        Persona persona3 = new Persona("Juan",31);
        Persona[] grupoDePersonas = {persona1,persona2,persona3};
        for (Persona x: grupoDePersonas){
            System.out.println(x);
        }
    }
}
