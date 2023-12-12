public class act4 {
    public static void main(String[] args) {
        int[] numeros = {-35, -13, -77, -46, -82, -2, -26};
        int minimo = encontrarMinimo(numeros);

        System.out.println("El mínimo de la lista es: " + minimo);
    }

    public static int encontrarMinimo(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío.");
        }

        int minimo = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }

        return minimo;
    }
}
