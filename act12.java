import java.util.Arrays;
import java.util.Scanner;

public class act12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del array: ");
        int longitud = scanner.nextInt();

        int[] array = new int[longitud];
        System.out.println("Ingrese los valores del array:");
        for (int i = 0; i < longitud; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int[] arrayOrdenado = ordenarArray(array);

        System.out.println("Array ordenado: " + Arrays.toString(arrayOrdenado));
    }

    public static int[] ordenarArray(int[] array) {
        int[] arrayOrdenado = Arrays.copyOf(array, array.length);

        Arrays.sort(arrayOrdenado);

        return arrayOrdenado;
    }
}
