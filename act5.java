public class act5 {
    public static void main(String[] args){
        int[] pagoSemanal = {987, 688, 1324, 450, 667, 801};
        int sum = 0;

        for (sum = 0; sum<6; sum++){
            sum += pagoSemanal[sum];
        }
    }
}
