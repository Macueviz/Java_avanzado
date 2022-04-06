package Ej22_24_SOLID;

public class Coche implements CocheCaracteristicas{
    String color;
    String marca;
    int puertas;

    public void color(String color) {  this.color = color; }

    public void marca(String marca) {this.marca = marca;  }

    public void puertas(int puertas) { this.puertas = puertas; }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public int getPuertas() {
        return puertas;
    }
}
