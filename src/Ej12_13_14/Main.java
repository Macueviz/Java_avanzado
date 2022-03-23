package Ej12_13_14;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        System.out.println(sumarNumeros(1, 2, 4, 12, 25));
        System.out.println(Arrays.toString(ordenarCronologicamente(1994, 1992, 2004, 2010, 1967)));
    }

    /**
     * Función que suma número indefinido de valores con programación funcional
     *
     * @param numeros
     * @return devuelve el valor de la suma
     */
    public static int sumarNumeros(int... numeros) {
        return Arrays.stream(numeros).reduce(0, (a, b) -> (a + b));

    }

    /**
     * Función que recorre un Array para ordenar sus valores de menor a mayor (cronológicamente)
     * Recorre el Array comparando el primer dato con el segundo en los bucles for
     * @param fechas
     * @return devuelve un Array con las fechas ordenadas
     */
    public static int[] ordenarCronologicamente(int... fechas) {

        for (int i = 0; i < (fechas.length - 1); i++) {
            for (int j = i + 1; j < fechas.length; j++) {
                if (fechas[i] > fechas[j]) {
                    int auxiliar = fechas[i];
                    fechas[i] = fechas[j];
                    fechas[j] = auxiliar;
                }
            }
        }
        return fechas;
    }
}


