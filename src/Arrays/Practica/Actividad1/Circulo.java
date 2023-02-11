package Arrays.Practica.Actividad1;

public class Circulo extends Geometria implements Coloreable {
    Double radio;

    @Override
    double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
        //Calculamos el área del circulo que es pi por radio al cuadrado
    }

    @Override
    double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
