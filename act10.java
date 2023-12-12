public class act10 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 1};
        int[] array3 = {1, 2, 3, 4, 6};

        System.out.println("Array1 es igual a Array2: " + arraysEqualsUnordered(array1, array2));
        System.out.println("Array1 es igual a Array3: " + arraysEqualsUnordered(array1, array3));
    }

    public static boolean arraysEqualsUnordered(int[] arr1, int[] arr2) {
        if (arr1 == null && arr2 == null) {
            return true;
        }

        if (arr1 == null || arr2 == null) {
            return false;
        }

        if (arr1.length != arr2.length) {
            return false;
        }
        return true;
    }
}



