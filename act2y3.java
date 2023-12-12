public class act2y3 {
    //es 24
    //Fijandome en el numero mas grande
    public static void main(String[] args) {
        int[] array = {-22, 5, 19, 1, -17, 0, -1, 19, 24, -13};
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("El número máximo en la colección es: " + max);
    }
}

