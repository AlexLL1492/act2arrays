public class act6 {
    public class MaxNumber {
        public static void main(String[] args) {
            int[] array = {-22, 5, 19, 1, -17, 0, -1, 19, 24, -13};
            int max = array[0];

            for (int num : array) {
                if (num > max) {
                    max = num;
                }
            }

            System.out.println("El número máximo en la colección es: " + max);
        }
    }
    public class Act4 {
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

            for (int num : array) {
                if (num < minimo) {
                    minimo = num;
                }
            }

            return minimo;
        }
    }

}
