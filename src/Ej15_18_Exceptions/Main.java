package Ej15_18_Exceptions;

import org.w3c.dom.ls.LSOutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Arrays;

import static Ej15_18_Exceptions.Main.leerFichero;

public class Main {
    public static void main(String []args){

        int valor1 = 5;

        division(valor1, 0);
        obtenerNumero(9);
        leerFichero("/etc/password");

    }

    public static int division(int valor1, int valor2) throws ArithmeticException{
        int resultado = 0;
        try {
            resultado = valor1 / valor2;
        }catch(ArithmeticException e){
            System.out.println("Lanza una excepción aritmética " +  e.getClass());

        }
        return resultado;
    }

    public static void obtenerNumero(int posicion) {
        int[] aNumeros = {1, 2, 3, 4, 5, 6};
        try {
            System.out.println(aNumeros[posicion]);
        } catch (Exception e) {
            System.out.println("Array de 6 posiciones, no puede acceder a la petición " + e.getClass());
        }
    }
    public static void leerFichero(String fichero){

        try{
            InputStream archivo = new FileInputStream(fichero);
                try{
                    byte[] datos = archivo.readAllBytes();
                    for (byte dato : datos) {
                            System.out.println((char) dato);
                    }
                }catch(Exception e){
                    System.out.println("No se puede leer el archivo " + e.getClass());
                }
        }catch(Exception e){
            System.out.println("No se encuentra el fichero " + e.getClass());
        }

    }

}
