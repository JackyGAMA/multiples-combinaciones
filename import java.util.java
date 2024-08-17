import java.util.ArrayList;
import java.util.List;

public class Combinaciones {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};
        List<String> combinaciones = generarCombinaciones(numeros);

        for (String combinacion : combinaciones) {
            System.out.println(combinacion);
        }

        System.out.println("Final: " + combinaciones.size());
    }

    public static List<String> generarCombinaciones(int[] numeros) {
        List<String> combinaciones = new ArrayList<>();

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                combinaciones.add(numeros[i] + " " + numeros[j]);
            }
        }

        return combinaciones;
    }
}
