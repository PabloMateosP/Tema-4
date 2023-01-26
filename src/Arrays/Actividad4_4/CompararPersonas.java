package Arrays.Actividad4_4;

import Arrays.Actividad4_4.Persona;

public class CompararPersonas {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.name = "p1";
        Persona p2 = new Persona();
        p2.name = "p2";

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

    }
}
