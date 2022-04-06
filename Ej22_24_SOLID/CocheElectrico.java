package Ej22_24_SOLID;

public class CocheElectrico extends Coche{
    String tipo;

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }

    @Override
    public int getPuertas() {
        return super.getPuertas();
    }

    public void tipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo()  {
        return tipo;
    }
}
