public class act11 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {3, 5};
        int[] array3 = {7, 8};

        System.out.println("Array2 está contenido en Array1: " + isArrayOn(array2, array1));
        System.out.println("Array3 está contenido en Array1: " + isArrayOn(array3, array1));
    }
    public static boolean isArrayOn(int[] src, int[] dst) {
        if (src == null && dst == null) {
            return true;
        }
        if (src == null || dst == null) {
            return false;
        }
        if (src.length > dst.length) {
            return false;
        }

        for (int srcElement : src) {
            boolean containsElement = false;

            for (int dstElement : dst) {
                if (srcElement == dstElement) {
                    containsElement = true;
                    break;
                }
            }

            if (!containsElement) {
                return false;
            }
        }

        return true;
    }
}