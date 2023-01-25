package Arrays.Practica;

public class Persona {
    String name;
    int edad;
    Persona (String name) {
        this.name = name;
    }

    Persona() {}

    @Override
    public String toString() {
        return name;
    }

}

