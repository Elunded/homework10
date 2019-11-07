package lesson9;

public class Main {
    public static void main(String[] args) {
        double x = 8.5;

        double y = 11.45;

        double x1 = 10 - x;

        double y1 = 10 - y;

        if (y1 > x1) {
            System.out.println(x + " - ближче");
        } else {
            System.out.println(y + " - ближче");
        }
    }
}
