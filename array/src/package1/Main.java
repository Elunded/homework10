package package1;

public class Main {
    public static void main(String[] args) {
        int[] x = {-7, 5, -1, 26, 23};
        int min = (int) Double.POSITIVE_INFINITY;
        int max = (int) Double.NEGATIVE_INFINITY;
        int sum = 0, sum2 = 0, ser = 0, bi = 0;

        for (int i = 0, n = x.length; i < n; i++) {
            if (x[i]%2 == 0) {
                sum += x[i];
                if (x[i] > 20) {
                    if (x[i] < 30) {
                        sum2 += x[i];
                    }
                }
            }

        }
        for (int i = 0, n = x.length; i < n; i++) {
            if (x[i]>0){
                x[i]++;
            } else {
                x[i]--;
            }
        }
        System.out.println(sum + " " + sum2 + " - Сума від 20 до 30");
        System.out.println();
        for (int i:x
             ) {
            System.out.print(i + " ");
        }
    }
}

