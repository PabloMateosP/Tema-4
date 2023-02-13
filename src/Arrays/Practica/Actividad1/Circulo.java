package Arrays.Practica.Actividad1;

public class Circulo extends Geometria implements Coloreable {
    Double radio;
    Circulo (double radio){

    }

    @Override
    protected double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
        //Calculamos el área del circulo que es pi por radio al cuadrado
    }

    @Override
    protected double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
