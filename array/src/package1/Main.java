package package1;

public class Main {
    public static void main(String[] args) {
        int[] x = {-7, 5, -1, 25, 23};
        int min = (int) Double.POSITIVE_INFINITY;
        int max = (int) Double.NEGATIVE_INFINITY;
        int sum = 0, sum2 = 0, ser = 0, bi = 0;
        for (int i = 0, n = x.length, sum3 = 0; i<n; i++){
            sum3 += x[i];
            ser = sum3/n;
            if (x[i]>ser){
                bi++;
            }
        }
        for (int i = 0, n = x.length; i < n; i++) {
            if (x[i] > 0) {
                sum += x[i];
                if (x[i] > 20) {
                    if (x[i] < 30) {
                        sum2 += x[i];
                    }
                }
            }
            if (x[i] > max) {
                max = x[i];
            }
            if (x[i]<0){
                x[i] = Math.abs(x[i]);
            }

        }
        System.out.println(sum + " " + sum2 + " " + max + " "+ (bi-1));
    }
}

