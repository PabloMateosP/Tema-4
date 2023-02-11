package Arrays.Practica.Actividad1;

import Arrays.Practica.Actividad1.Coloreable;
import Arrays.Practica.Actividad1.Geometria;

public class Triangulo extends Geometria implements Coloreable {
    Double base;
    Double altura;

    @Override
    double calcularArea() {
        return (base * altura)/2;
    }

    @Override
    double calcularPerimetro() {
        return 3 * base;
    }
}
