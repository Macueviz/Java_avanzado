package PatronSingleton;

public class Main {

    public static void main(String[] args) {
	Bombilla bombilla = Bombilla.getInstance();
	Bombilla bombilla2 = Bombilla.getInstance();

    bombilla.encender();
    bombilla2.encender();
        System.out.println(bombilla + " " + bombilla2);
    }
}
