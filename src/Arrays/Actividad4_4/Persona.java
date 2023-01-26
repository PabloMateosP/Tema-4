package Arrays.Actividad4_4;

public class Persona {
    public String name;
    public int age;
    public Persona(){}
    public Persona (String nombreNuevo, int edadNueva){
        this.name = nombreNuevo;
        this.age = edadNueva;
    }
    public String toString (){
        String grupoFinal = name + " tiene: " + age + " años";
        return grupoFinal;
    }
}

