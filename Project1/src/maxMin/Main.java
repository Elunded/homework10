package maxMin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = (int)Double.NEGATIVE_INFINITY;
        int min = (int)Double.POSITIVE_INFINITY;
        int next = 0;

        for (int i = 0; i< 20; i++){
            next = in.nextInt();

            if (max<next){
                max = next;
            }

            if (min> next) {
                min = next;
            }
        }
        System.out.println("min: " + min + " max: " + max);
    }
}
