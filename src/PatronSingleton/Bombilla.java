package PatronSingleton;

public class Bombilla {
    private static Bombilla bombilla;
    boolean encendida = false;

    private Bombilla(){}

    public static Bombilla getInstance(){
        if (bombilla == null){
            bombilla = new Bombilla();
        }
        return bombilla;
    }
    public void encender(){
        if (!encendida){
            encendida = true;
        }else{
            System.out.println("Bombilla ya encendida");
        }

    }
}
