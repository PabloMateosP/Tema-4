package Arrays.Practica.Actividad1;

public class Cuadrado extends Geometria implements Coloreable {
    Double lado;

    @Override
    double calcularArea() {
        return lado * lado;
    }

    @Override
    double calcularPerimetro() {
        return 4 * lado;
    }
}
