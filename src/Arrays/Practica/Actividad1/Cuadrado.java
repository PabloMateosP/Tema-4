package Arrays.Practica.Actividad1;

public class Cuadrado extends Geometria implements Coloreable {
    Double lado;
    Cuadrado (double lado){
        this.lado = lado;
    }

    @Override
    protected double calcularArea() {
        return lado * lado;
    }

    @Override
    protected double calcularPerimetro() {
        return 4 * lado;
    }
}
