package lesson26;

public class Main {
    public static void main(String[] args) {
        int [] x = {-6, 1, 5, 15, 51, -12, 15};
        int sum = 0;
        for (int i = 0, n = x.length; i < n; i++){
            sum += x[i];
        }
        System.out.println(sum);
        int min = (int)Double.POSITIVE_INFINITY;
        int max = (int)Double.NEGATIVE_INFINITY;
        for (int i = 0, n = x.length; i < n; i++){
            if (min > x[i]) {
                min = x[i];
            }
            if (max < x[i]){
                max = x[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        int k =15;
        int r =0;
        for (int i = 0, n = x.length; i < n; i++){
            if (k==x[i]){
                r++;
            }
        }
        System.out.println("Знайдено " + r + " збігів");
    }
}
