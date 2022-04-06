package Ej22_24_SOLID;

public class Main {

    public static void main(String[] args) {
        Coche coche1 = new Coche();


        coche1.color("rojo");
        coche1.puertas(5);
        coche1.marca("citroen");

        CocheElectrico coche3 = new CocheElectrico();
        coche3.color("blanco");
        coche3.puertas(5);
        coche3.marca("audi");
        coche3.tipo("electrico");

        CocheHibrido coche4 = new CocheHibrido();
        coche4.color("negro");
        coche4.puertas(5);
        coche4.marca("mercedes");
        coche4.tipo("hibrido");

        System.out.println("coche 1 marca: " + coche1.getMarca() + " color: " + coche1.getColor() + " ," + coche1.getPuertas() + " puertas");
        System.out.println("coche 3 marca: " + coche3.getMarca() + " color: " + coche3.getColor() + " ," + coche3.getPuertas() + " puertas"
                + ", su marca es " +coche3.getMarca() + " y es de tipo " + coche3.getTipo());
        System.out.println("coche 4 marca: " + coche4.getMarca() + " color: " + coche4.getColor() + " ," + coche4.getPuertas() + " puertas"
                + ", su marca es " +coche4.getMarca() + " y es de tipo " + coche4.getTipo());

    }
}
