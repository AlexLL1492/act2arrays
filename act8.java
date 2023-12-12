public class act8 {
    public static void main(String[] args){
        double[] array = { -47.39, 24.96, -1.02, 3.45, 14.21, 32.6, 19.42};
        double suma = 0;
        for(double elemento : array){
            suma += elemento;
        }

        double media = suma / array.length;

        System.out.println("La media es: " + media);

    }
}
