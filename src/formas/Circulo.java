package formas;

public class Circulo implements FormaGeometrica {

    public double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * raio * raio;
        System.out.println(area);
        System.out.println("--------------------");
    }


}
