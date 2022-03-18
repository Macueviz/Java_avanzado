package PatronSingleton;

public class Singleton {
    private static Singleton singleton;
    int contador;

    private Singleton(){}

    public static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public void setContador(int contador){
        this.contador = contador;
    }

    public int getContador(){
        return contador;
    }
}
